import java.util.Scanner;

public class CommandListInformations implements CommandMenuInterface {
    
    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        System.out.println("Listar informações");

        editable.listInformations(myObj, account);
    }
}
