package ru.grand.edu;

/**
 * Created by Grand on 14.05.2015.
 */
public class DAOFactory {
    private static GroupService groupService = null;
    private static PremissionService premissionService = null;
    private static RoleService roleService = null;
    private static UserService userService = null;
    private static UserGroupService userGroupService = null;
    private static UserRoleService userRoleService = null;
    private static RolePremissionService rolePremissionService = null;

    public static GroupService getGroupService() {
        return groupService;
    }

    public static PremissionService getPremissionService() {
        return premissionService;
    }

    public static RoleService getRoleService() {
        return roleService;
    }

    public static UserService getUserService() {
        return userService;
    }

    public static UserGroupService getUserGroupService() {
        return userGroupService;
    }

    public static UserRoleService getUserRoleService() {
        return userRoleService;
    }

    public static RolePremissionService getRolePremissionService() {
        return rolePremissionService;
    }

    static {
        groupService = new GroupService();
        premissionService = new PremissionService();
        roleService = new RoleService();
        userService = new UserService();
        userGroupService = new UserGroupService();
        userRoleService = new UserRoleService();
        rolePremissionService = new RolePremissionService();
    }
}
