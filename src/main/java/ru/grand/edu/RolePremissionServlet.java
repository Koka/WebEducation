package ru.grand.edu;

import target.gen.domain.Premissions;
import target.gen.domain.Roles;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Grand on 26.04.2015.
 */
public class RolePremissionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer roleId = Integer.parseInt(request.getParameter("roleId"));
        Integer premissionId = Integer.parseInt(request.getParameter("premissionId"));
        System.out.println(roleId + " " + premissionId);
        RoleService rs = DAOFactory.getRoleService();
        Roles role = rs.getRoleById(roleId);
        PremissionService ps = DAOFactory.getPremissionService();
        Premissions premissions = ps.getPremissionById(premissionId);
        RolePremissionService rolePremissionService = DAOFactory.getRolePremissionService();
        rolePremissionService.insertPremissionRole(premissions, role);
        response.sendRedirect("");
    }
}
