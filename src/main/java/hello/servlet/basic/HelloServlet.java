package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello") // /hello로 요청이 들어오면 해당 서블릿이 실행됨
public class HelloServlet extends HttpServlet {
    @Override // 서블릿이 실행되면 service() 메서드가 실행됨
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);
        
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8"); // HTTP Response header에 들어감
        response.getWriter().write("hello " + username); // HTTP Response Body에 메세지가 들어감
    }
}
