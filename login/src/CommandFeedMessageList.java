import java.util.Scanner;

public class CommandFeedMessageList extends CommandMenuParent {
    public CommandFeedMessageList(){
        super.name = "Ver mensagens do feed";
        super.number = 12;
    }

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable) {
        
        System.out.println(account.messagesFeed);
        System.out.println(account.messagesFriends);
        
    }
    
}
