import java.util.Scanner;

public class CommandFeedMessageList implements CommandMenuInterface {

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable) {
        
        System.out.println(account.messagesFeed);
        System.out.println(account.messagesFriends);
        
    }
    
}
