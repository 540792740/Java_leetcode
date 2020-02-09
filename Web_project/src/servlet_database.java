import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class servlet_database {



    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema?serverTimezone=UTC", "root", "Wang123!");
        System.out.println("---connected---");

    }
}