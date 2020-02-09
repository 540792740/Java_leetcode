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
        Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_project?serverTimezone=UTC", "root", "Wang123!");
        System.out.println("---connected---");



		/*	Statement st=c1.createStatement();
		        int i=st.executeUpdate("insert into student values(2,'Sam')");
		        		//,8555)");
		      //  int j=st.executeUpdate("insert into student values(586,'yi',7000)");

	        System.out.println("no of rows inserted\n"+i);
	        //System.out.println("no of rows inserted\n"+j);
*/
    }
}