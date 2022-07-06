import java.util.Scanner;

public class CommandAddComunity implements CommandMenuInterface {

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        System.out.println("CRIAR COMUNIDADE");

        editable.addComunity(myObj, account);
    }
    
}