import java.util.Scanner;

public class CommandSendFeed implements CommandMenuInterface{
    
    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        System.out.println("Enviar mensagem no feed");
        editable.sendFeed(myObj, account);
    }
    
}
