import java.util.Scanner;

public class CommandAddComunity extends CommandMenuParent {
    public CommandAddComunity(){
        super.name = "Criar comunidade";
        super.number = 5;
    }

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        System.out.println("CRIAR COMUNIDADE");

        editable.addComunity(myObj, account);
    }
    
}