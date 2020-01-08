package Message;

/*import String;
import System.User;
import System.*;*/
import User.User;

public interface iMessage {

    public void setContent(String content);

    public String getContent();

    public void setSender(User sender);

    public User getSender();

    public void setReciever(User reciever);

    public User getReciever();

}