import java.util.Scanner;

public class CommandSendFeed extends CommandMenuParent{
    public CommandSendFeed(){
        super.name = "Enviar mensagem no feed";
        super.number = 9;
    }
    
    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        System.out.println("Enviar mensagem no feed");
        editable.sendFeed(myObj, account);
    }
    
}
