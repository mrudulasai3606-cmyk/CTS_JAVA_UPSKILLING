package MODULE31_41;

import java.sql.*;

public class TransactionExample {

    public static void transferMoney(
            Connection con,
            int fromAccount,
            int toAccount,
            double amount) {

        try {

            con.setAutoCommit(false);

            PreparedStatement debit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance = balance - ? WHERE id = ?");

            debit.setDouble(1, amount);
            debit.setInt(2, fromAccount);
            debit.executeUpdate();

            PreparedStatement credit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance = balance + ? WHERE id = ?");

            credit.setDouble(1, amount);
            credit.setInt(2, toAccount);
            credit.executeUpdate();

            con.commit();

            System.out.println("Transfer Successful");

        } catch (Exception e) {

            try {
                con.rollback();
                System.out.println("Transaction Rolled Back");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bank",
                "root",
                "root");

        transferMoney(con, 1, 2, 1000);

        con.close();
    }
}
