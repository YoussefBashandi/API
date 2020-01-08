package User;

import Platform.Group;
import Platform.Page;
import Post.Post;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;



public class User implements iUser {

    public String Email;

    public String Password;

    public String Name;

    public String Gender;

    public ArrayList<User> Friends = new ArrayList<User>();

    public ArrayList<User> friendReq = new ArrayList<User>();

    public ArrayList<Group> groups = new ArrayList<Group>();

    public ArrayList<Page> pages = new ArrayList<Page>();

    public ArrayList<Post> posts = new ArrayList<Post>();

    boolean premiumUser = false;

    public Vector myPost;
    /**
     *
     * @element-type Post
     */
    public Vector  has;
    /**
     *
     * @element-type Group

    public Vector  is member;
    /**
     *
     * @element-type Page

    public Vector  is fan;
    public Vector  0 .. *;
    public Vector  myGroup;
    public Vector  myiPost;
    public Vector  myPost;
    public Vector  myPost;
*/

    public User(){

    }

    public User(String email, String password, String name, String gender){
        this.Email = email;
        this.Password = password;
        this.Name = name;
        this.Gender = gender;
        this.Friends = new ArrayList<User>();
        this.friendReq = new ArrayList<User>();
    }
    public void setEmail(String mail) {
    }

    public String getEmail() {
        return null;
    }

    public void setPassword(String pass) {
    }

    public String getPassword() {
        return null;
    }

    public void setGender(String gender) {
    }

    public String getGender() {
        return null;
    }

    public void setName(String name) {
    }

    public String getName() {
        return null;
    }

    public User signUp(String email, String name, String password, String gender) {
        User newUser = new User();
        newUser.Name = name;
        newUser.Gender = gender;
        newUser.Email = email;
        newUser.Password = password;
        return newUser;
    }

    public boolean logIn(String mail, String pass, ArrayList<User> users) {
        boolean found = false;
        for(int i = 0; i < users.size(); i++){
            if (users.get(i).Email.equals(mail) && users.get(i).Password.equals(pass)) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("You have been logged in.");
        }else{
            System.out.println("Failed!! .. You have to sign up first");
        }
        return found;
    }

    public boolean addFriend(String name, ArrayList<User> users) {
        boolean found = false;
        for(int i = 0; i < users.size(); i++){
            if(name.equals(users.get(i).Name)){
                found = true;
                users.get(i).friendReq.add(this);
                break;
            }
        }
        if(found){
            System.out.println("Request has been send");
        }else {
            System.out.println("Error!!");
        }
        return found;
    }

    public boolean respondFriendRequest() {
        ArrayList<User> arr = new ArrayList<User>(this.friendReq);
        boolean done = false;
        if(arr.size() != 0){
            for(int i = 0; i < arr.size(); i++){
                System.out.println(arr.get(i).Name + " Send you a friend request.\n1- Accept \n2- Reject");
                Scanner scan = new Scanner(System.in);
                int ans = scan.nextInt();
                if(ans == 1){
                    this.Friends.add(arr.get(i));
                    arr.remove(i);
                    done = true;
                }else{
                    arr.remove(i);
                    done = true;
                }
            }
        }
        return done;
    }

    public void removeFriend(User user) {
    }

    public void blockSomeone(User user) {

    }

    public void sendMessage(User user, String content) {
    }

    public void createGroup(String name) {
    }

    public void createPage(String name) {
    }

    public void createPost(String content) {
    }

    public void addLike(Post post) {
    }

    public void addComment(Post post) {
    }

    public boolean upgrade(String name, ArrayList<User> users){
        boolean done = false;
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).Name.equals(name) && users.get(i).premiumUser == false){
                done = true;
                users.get(i).premiumUser = true;
            }else{
                System.out.println("You are a premium user already.");
                done = false;
            }
        }
        return done;
    }

    public static void main(String[] args) {

    }
}