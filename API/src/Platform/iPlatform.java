package Platform;

/*import String;
import System.User;
import System.void;*/

import User.User;

public interface iPlatform {

    public void setName(String name);

    public String getName();

    public void banMember(User user);

    public void addAdmin(User user);

    public void removeAdmin(User user);

    public String changeName(String name);

    public void unBanMember(User user);

    public void removeMember(User user);

    public void addPost(String content);

    public void removePost();

    public iPlatform createPlatform();
}