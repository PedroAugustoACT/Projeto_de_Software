
import java.util.Scanner;

public class CommandSendInvite extends CommandMenuParent {
    public CommandSendInvite(){
        super.name = "Adicionar amigo";
        super.number = 2;
    }


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
