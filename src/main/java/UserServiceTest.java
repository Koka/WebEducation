import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * Created by Grand on 25.04.2015.
 */
public class UserServiceTest {
    public static UserService userService;

    @BeforeClass
    public static void setup(){
        userService = new UserService();
    }
    @AfterClass
    public static void teardown(){
        userService = null;
    }
    @Test
    public void testGetUserById()
    {
        System.out.println("------------");
        Users user = userService.getUserById(1);
        Assert.assertNotNull(user);
        System.out.println(user);
    }

    @Test
    public void testGetAllUsers(){

        List<Users> users = userService.getAllUsers();
        Assert.assertNotNull(users);
        for (Users user : users)
        {
            System.out.println(user);
        }
    }

    @Test
    public void testInsertUser(){
        System.out.println("-------");
        Users user = new Users();
        user.setName("abra");
        userService.insertUser(user);
    }

}
