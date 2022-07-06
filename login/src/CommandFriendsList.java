import java.util.Scanner;

public class CommandFriendsList implements CommandMenuInterface {
    
    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        System.out.println(account.friends);
    }
    
}
