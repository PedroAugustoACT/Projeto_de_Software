package login.src;
import java.util.ArrayList;

public class Account {
    String login;
    String password;
    String username;
    boolean active;
    ArrayList<DirectMessage> messages;
    ArrayList<Atribute> atributes;
    ArrayList<Account> friends;
    ArrayList<Invite> invites;
    ArrayList<FeedMessage> messagesFeed;
    ArrayList<FeedMessage> messagesFriends;

    public Account(String l, String p, String u){
        this.login = l;
        this.password = p;
        this.username = u;
        this.active = true;
        this.atributes = new ArrayList<Atribute>();
        messages = new ArrayList<DirectMessage>();
        friends = new ArrayList<Account>();
        invites = new ArrayList<Invite>();
        messagesFeed = new ArrayList<FeedMessage>();
        messagesFriends = new ArrayList<FeedMessage>();
    }
    public String toString(){
        if (this.active) {
            return "Login: " + this.login +" | User : " + this.username;
        } else {
            return "";
        }

    }

    public void setAtribute(Atribute atribute){
        atributes.add(atribute); 
      }

    public void setMessage(DirectMessage message){
        messages.add(message);
    }

    public void setFriend(Account friend){
        friends.add(friend);
    }

    public void setInvite(Invite invite){
        invites.add(invite);
    }

    public void setMessageFeed(FeedMessage message){
        messagesFeed.add(message);
    }

    public void setmessageFriends(FeedMessage message){
        messagesFriends.add(message);
    }

}

