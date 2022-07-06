import java.util.Scanner;

public class CommandDirectMessageList implements CommandMenuInterface {

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable) {
        System.out.println(account.messages);
        
    }
    
}
