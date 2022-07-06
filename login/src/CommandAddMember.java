import java.util.Scanner;

public class CommandAddMember extends CommandMenuParent {
    public CommandAddMember(){
        super.name = "Entrar em uma comunidade";
        super.number = 6;
    }

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        System.out.println("Entrar em uma comunidade");
            try {
                editable.addMember(myObj, account);
                
                } catch (ExceptionComunity nullComunity) {
                System.out.println(nullComunity.getMessage());
            }
    }
    
}
