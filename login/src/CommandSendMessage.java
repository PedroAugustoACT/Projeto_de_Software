import java.util.Scanner;

public class CommandSendMessage extends CommandMenuParent {
    public CommandSendMessage(){
        super.name = "Enviar mensagem";
        super.number = 4;
    }

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
