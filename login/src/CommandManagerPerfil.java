import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;



public class CommandManagerPerfil extends CommandMenuParent {
    public CommandManagerPerfil(){
        super.name = "Editar perfil";
        super.number = 1;
    }

    @Override
    public void execute(Scanner myObj, Account account, AccountManager editable){
        System.out.println("EDITAR/CRIAR ATRIBUTO");

        try {
            editable.managerPerfil(myObj, account);
        } catch (InputMismatchException e) {
            System.out.println("DIGITE UM NÚMERO VÁLIDO");
        } catch (ExceptionAtribute nullAtribute) {
            System.out.println(nullAtribute.getMessage());
        } finally {
            myObj.nextLine();
        }
    };
   
    
}

ArrayList<CommandMenuParent> commands = new ArrayList<CommandMenuParent>();
for (CommandMenuParent command : commands) {
    System.out.println("Pressione " + command.number + " para: " + command.name);
}

// LEITURA
Integer chosenNumber = 1;

// VERIFICAR
