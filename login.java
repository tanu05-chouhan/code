//Servlet Code.
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //action perform in doget methord
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //accept value from html page
        String name = request.getParameter("username");
        String pass = request.getParameter("pass");
        //now display
        if(name.equals("Tanu Chouhan")&& pass.equals("56789"))
        {
            out.print("name of user is "+name);
        }
        else out.print("Invalid Username");
    }
}
//HTML Code.
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
       <form action="login" method="get">
            name:<input type="text" name="username"/><br/>
            password<input type="password" name="pass"/><br/>
            <input type="submit" value="sumbit"/>
        </form>
    </body>
</html>
