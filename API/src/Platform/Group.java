package Platform;

/*import Platforms.ArrayList<Post>;
import java.util.Vector;
import String;
import System.User;
import System.ArrayList<User>;
import System.void;*/

import Post.Post;
import User.User;

import java.util.ArrayList;
import java.util.Vector;

public class Group implements iPlatform {

    public String name;

    public ArrayList<User> admins;

    public ArrayList<User> members;

    public ArrayList<Post> posts;

    public ArrayList<User> ban;

    /**
     *
     * @element-type User

    public Vector is member;
    public Vector  myUser;
    /**
     *
     * @element-type Post

    public Vector  contains;
    */

    public void setName(String name) {
    }

    public String getName() {
        return null;
    }

    public void banMember(User user) {
    }

    public void addAdmin(User user) {
    }

    public void removeAdmin(User user) {
    }

    public String changeName(String name) {
        return null;
    }

    public void unBanMember(User user) {
    }

    public void removeMember(User user) {
    }

    public void addPost(String content) {
    }

    public void removePost() {
    }

    public iPlatform createPlatform() {
        return null;
    }

}