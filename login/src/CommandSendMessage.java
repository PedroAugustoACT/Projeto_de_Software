import java.util.Scanner;

public class CommandSendMessage implements CommandMenuInterface {

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        System.out.println("ENVIAR MENSAGEM");
        try {
            editable.sendMessage(myObj, account);
            
        } catch (ExceptionLogin nullLogin) {
            System.out.println(nullLogin.getMessage());
        }
    }
    
}
