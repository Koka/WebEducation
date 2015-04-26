import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Grand on 26.04.2015.
 */
public class UserGroupServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer userid = Integer.parseInt(request.getParameter("userId"));
        Integer groupid = Integer.parseInt(request.getParameter("groupId"));
        System.out.println(userid+" "+groupid);
        UserService us = new UserService();
        Users user = us.getUserById(userid);
        GroupService gs = new GroupService();
        Groups group = gs.getGroupById(groupid);
        UserGroupService userGroupService = new UserGroupService();
        userGroupService.insertUserGroup(user, group);
        response.sendRedirect("");
    }
}
