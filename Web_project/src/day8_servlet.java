import java.io.IOException;
import java.sql.*;
import javax.servlet.*;

/*
    Cache is not security
    Session scope is a secure way, such as bank system. terminate session after 5 min.
*/


public class day8_servlet  extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("name");
        String pass = req.getParameter("pass");
        System.out.println(username);
        System.out.println(pass);


        try {
            Class.forName("com.mysql.jdbc.Driver");
//        Build connection
            Connection conn = null;
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/new_schema?serverTimezone=UTC", "root", "Wang123!");

//        Run SQL
            ResultSet rs = null;
            String sql = "select name, pass" +
                    " from servlet_table" +
                    " where name= \"" + username + "\"";

//        Create statement
            Statement stmt = null;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            if (!rs.next()) {
                RequestDispatcher red = req.getRequestDispatcher("/register.html");
                red.forward(req, resp);


                /*
                sql = "insert into servlet_table values (" + '"' + username + '"' + ',' + '"' + pass + '"' + ")";
                System.out.println(sql);
                stmt.executeUpdate(sql);
//        Create statement
                System.out.println("插入成功" + username);

              */
            } else {
//                while (rs.next()) {
                    String name = rs.getString("name");
                    String password = rs.getString("pass");
                    System.out.println(name + password);
                    //username in table
                    if (name.equals(username)) {
                        if (password.equals(pass)) {
                            RequestDispatcher red = req.getRequestDispatcher("/result.html");
                            red.forward(req, resp);
                        } else {
                            RequestDispatcher red = req.getRequestDispatcher("/error.html");
                            red.forward(req, resp);
                        }
                    }
                    //Username not in user
//                }
            }
                stmt.close();
                rs.close();
            }
        catch(Exception e){
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }
}

