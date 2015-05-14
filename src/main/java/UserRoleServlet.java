import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Grand on 26.04.2015.
 */
public class UserRoleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer userId = Integer.parseInt(request.getParameter("userId"));
        Integer roleId = Integer.parseInt(request.getParameter("roleId"));
        System.out.println(userId+" "+roleId);
        UserService rs = DAOFactory.getUserService();
        Users user = rs.getUserById(userId);
        RoleService ps = DAOFactory.getRoleService();
        Roles roles = ps.getRoleById(roleId);
        System.out.println(user.toString());
        System.out.println(roles.toString());
        UserRoleService userroleService = DAOFactory.getUserRoleService();
        userroleService.insertUserRole(user, roles);
        response.sendRedirect("");
    }
}
