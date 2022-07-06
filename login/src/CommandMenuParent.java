import java.util.Scanner;

public abstract class CommandMenuParent {
    public String name;
    public Integer number;

    public abstract void execute(Scanner myObj, Account account, AccountManager editable);
    
    
}






