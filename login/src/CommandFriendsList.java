import java.util.Scanner;

public class CommandFriendsList extends CommandMenuParent {
    public CommandFriendsList(){
        super.name = "Ver lista de amigos";
        super.number = 10;
    }

    
    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        System.out.println(account.friends);
    }
    
}
