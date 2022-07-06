import java.util.ArrayList;
import java.util.Scanner;

public class InvokerCommandMenu {

    ArrayList<CommandMenuInterface> commands;

    public InvokerCommandMenu() {
        commands = new ArrayList<CommandMenuInterface>();

        commands.add(new CommandManagerPerfil()) ;
        commands.add(new CommandSendInvite());
        commands.add(new CommandAnswerInvite());
        commands.add(new CommandSendMessage());
        commands.add(new CommandAddComunity());
        commands.add(new CommandAddMember());
        commands.add(new CommandListInformations());
        commands.add(new CommandRemoveAccount());
        commands.add(new CommandSendFeed());
        commands.add(new CommandFriendsList());
        commands.add(new CommandDirectMessageList());
        commands.add(new CommandFeedMessageList());
        commands.add(new CommandExitMenu());


    }

    public void executeCommand(int opcao, Scanner myObj, Account account, AccountManager editable) {
        for (CommandMenuParent command : this.commands) {
            if(command.number == opcao){
                command.execute(myObj, account, editable);
                break;
            }
        
        }
    }
    
}
