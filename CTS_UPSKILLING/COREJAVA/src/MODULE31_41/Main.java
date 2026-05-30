package MODULE31_41;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "root");

        StudentDAO dao = new StudentDAO(con);

        dao.insertStudent(101, "Sai", 22);
        dao.updateStudent(101, "Sai Krishna");

        con.close();
    }
}
