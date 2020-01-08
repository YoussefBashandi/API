package User;

import Post.Post;

import java.util.ArrayList;
import java.util.Scanner;
/*import String;
import System.User;
import System.void;*/

public interface iUser {

    public void setEmail(String mail);

    public String getEmail();

    public void setPassword(String pass);

    public String getPassword();

    public void setGender(String gender);

    public String getGender();

    public void setName(String name);

    public String getName();

    public User signUp(String email, String name, String password, String gender);

    public boolean logIn(String mail, String pass, ArrayList<User> users);

    public boolean respondFriendRequest();

    public boolean addFriend(String name, ArrayList<User> users);

    public void removeFriend(User user);

    public void blockSomeone(User user);

    public void sendMessage(User user, String content);

    public void createGroup(String name);

    public void createPage(String name);

    public void createPost(String content);

    public void addLike(Post post);

    public void addComment(Post post);

    public boolean upgrade(String name, ArrayList<User> users);

}