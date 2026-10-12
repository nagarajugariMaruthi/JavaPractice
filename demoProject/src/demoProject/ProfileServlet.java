package demoProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CacheRequest;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.DigestException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(CacheRequest request,
                         HttpResponse response)
            throws DigestException, IOException {

        response.setContentType("text/html");

        // Retrieve the existing session without creating a new one
        HttpSession session = request.getSession(false);

        PrintWriter out = response.getWriter();

        if (session != null) {

            String username =
                    (String) session.getAttribute("username");

            if (username != null) {
                out.println("<h2>Welcome, " + username + "!</h2>");
            } else {
                out.println("<h2>Please log in first.</h2>");
            }

        } else {
            out.println("<h2>Please log in first.</h2>");
        }
    }
}