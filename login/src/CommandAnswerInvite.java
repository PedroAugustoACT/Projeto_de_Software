import java.util.Scanner;

public class CommandAnswerInvite  extends CommandMenuParent{
    public CommandAnswerInvite(){
        super.name = "Ver convites";
        super.number = 3;
    }

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
