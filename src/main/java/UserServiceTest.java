import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Created by Grand on 25.04.2015.
 */
public class UserServiceTest {
    public static UserGroupService userService;

    @BeforeClass
    public static void setup() {
        userService = new UserGroupService();
    }

    @AfterClass
    public static void teardown() {
        userService = null;
    }


    @Test
    public void testInsertUser() {
        UserGroup userGroup = new UserGroup();
        UserService us = new UserService();
        GroupService gs = new GroupService();

        List<UserGroup> ug = userService.selectByUser(us.getUserById(4));
        for (UserGroup u : ug) {
            System.out.println(ug.toString());
        }
    }

}
