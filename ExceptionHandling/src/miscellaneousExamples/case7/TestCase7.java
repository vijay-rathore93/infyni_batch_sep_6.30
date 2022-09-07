package miscellaneousExamples.case7;

import java.sql.SQLException;

public class TestCase7 {

    public static void main(String[] args)  {
        try {
            m1();
        } catch (SQLException e) {
            System.out.println("Handled Exception");
        }
    }


    public static void m1() throws SQLException {
        m2();
    }

    public static void m2() throws SQLException {
        m3();
    }

    public static void m3() throws SQLException{
        throw new SQLException("SQL Exception");
    }
}
