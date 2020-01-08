package Post;

/*import User.User;
import java.util.Vector;
import String;
import System.User;
import System.ArrayList<User>;
import Platform.Page;
import Integer;
import Platform.Group;
import System.void;*/

import User.User;

import java.util.ArrayList;
import java.util.Vector;

public class Post implements iPost {

    public String content;

    public User writer;

    public Integer noOfLikes;

    public Integer noOfComments;

    public ArrayList<User> comments;

    public ArrayList<User> likes;

    public Vector myUser;
    public User has;
    //public Group contains;
    /*public Page contains;
    public Vector  myUser;
    public Vector  myUser;*/
    public Vector  myPage;

    public void setWriter() {
    }

    public User getWriter() {
        return null;
    }

    public void setNoOfLikes() {
    }

    public Integer getNoOfLikes() {
        return null;
    }

    public void setNoOfComments() {
    }

    public Integer getNoOfComments() {
        return null;
    }

    public void setContent() {
    }

    public String getContent() {
        return null;
    }

    public void addLike() {
    }

    public void addComment() {
    }

}