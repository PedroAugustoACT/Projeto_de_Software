import java.util.Scanner;

public class CommandExitMenu extends CommandMenuParent{
    public CommandExitMenu(){
        super.name = "Logout";
        super.number = 13;
    }

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable) {
        return;
        
    }
    
}
