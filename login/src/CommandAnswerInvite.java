import java.util.Scanner;

public class CommandAnswerInvite  implements CommandMenuInterface{

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){

        System.out.println("VER CONVITES");
        try{
            editable.answerInvite(myObj, account);
        }
        catch(ExceptionLogin nullLogin){
            System.out.println(nullLogin.getMessage());
        }
    }
}
