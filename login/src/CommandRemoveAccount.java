import java.util.Scanner;

public class CommandRemoveAccount implements CommandMenuInterface {

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        if (editable.removeAccount(myObj, account)) {
            return;
        }
    }
    
}
