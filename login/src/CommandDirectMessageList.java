import java.util.Scanner;

public class CommandDirectMessageList extends CommandMenuParent {
    public CommandDirectMessageList(){
        super.name = "Ver mensagens diretas";
        super.number = 11;
    }

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable) {
        System.out.println(account.messages);
        
    }
    
}
