import java.util.Scanner;

public class CommandListInformations extends CommandMenuParent {
    public CommandListInformations(){
        super.name = "Listas minhas informações";
        super.number = 7;
    }
    
    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        System.out.println("Listar informações");

        editable.listInformations(myObj, account);
    }
}
