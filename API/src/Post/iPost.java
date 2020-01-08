package Post;

/*import java.util.Vector;
import String;
import System.User;
import Integer;
import System.void;*/

import User.User;

import java.util.Vector;

public interface iPost {

    //public Vector myUser;

    public void setWriter();

    public User getWriter();

    public void setNoOfLikes();

    public Integer getNoOfLikes();

    public void setNoOfComments();

    public Integer getNoOfComments();

    public void setContent();

    public String getContent();

    public void addLike();

    public void addComment();

}