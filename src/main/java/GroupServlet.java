import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Grand on 26.04.2015.
 */
public class GroupServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("groupname");
        GroupService groupService = new GroupService();
        Groups groups = new Groups();
        groups.setName(name);
        groupService.insertGroup(groups);
        response.sendRedirect("");
    }
}

