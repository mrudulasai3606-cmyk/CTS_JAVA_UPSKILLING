package MODULE31_41;

import java.sql.*;

public class JDBCConnectionExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            ResultSet rs =
                    stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " "
                                + rs.getString("name") + " "
                                + rs.getInt("age"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
