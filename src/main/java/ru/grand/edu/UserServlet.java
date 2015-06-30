package ru.grand.edu;

import target.gen.domain.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Grand on 26.04.2015.
 */
public class UserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        UserService userService = DAOFactory.getUserService();
        Users users = new Users();
        users.setName(name);
        userService.insertUser(users);
        response.sendRedirect("");
    }
}
