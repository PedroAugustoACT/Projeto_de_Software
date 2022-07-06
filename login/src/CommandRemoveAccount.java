import java.util.Scanner;

public class CommandRemoveAccount extends CommandMenuParent {
    public CommandRemoveAccount(){
        super.name = "Remover conta";
        super.number = 8;
    }

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        if (editable.removeAccount(myObj, account)) {
            return;
        }
    }
    
}
