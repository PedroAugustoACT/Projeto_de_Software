
import java.util.Scanner;

public class CommandSendInvite implements CommandMenuInterface {

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){
    
        System.out.println("ADICIONAR AMIGO");
        try {
            editable.sendInvite(myObj, account);
        }
        catch(ExceptionLogin nullLogin){
            System.out.println(nullLogin.getMessage());
        }
        catch (Exception nullFriend) {
            System.out.println(nullFriend.getMessage());
        }
   
    }
}
