package User;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void signUpTest(){
        ArrayList<User> users = new ArrayList<User>();
        final int expected = users.size() + 1;

        User user = new User();

        user.signUp("youssef", "aaa", "you", "male");
        final int actual = users.size();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void addFriendTest(){
        final boolean expected = true;

        User user = new User("youssef@gmail.com", "123456", "Youssef", "male");
        User user1 = new User("omar@gmail.com", "123456", "omar", "male");
        ArrayList<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user1);

        final boolean actual = user.addFriend("omar", users);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void respondTest(){
        final boolean expected = true;

        User user = new User("youssef@gmail.com", "123456", "Youssef", "male");
        User user1 = new User("omar@gmail.com", "123456", "omar", "male");
        ArrayList<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user1);

        user1.friendReq.add(user);

        final boolean actual = user1.respondFriendRequest();

        Assert.assertEquals(actual, expected);

    }
}