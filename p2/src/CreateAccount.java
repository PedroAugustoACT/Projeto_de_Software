package src;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CreateAccount{

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        Account a1 = new Account();


        System.out.println("Digite seu login: ");
        a1.login = myObj.nextLine();

        System.out.println("Digite sua senha");
        a1.password = myObj.nextLine();

        System.out.println("Digite seu username");
        a1.username= myObj.nextLine();

        System.out.println("");
        
      
        a1.status();

        
    }
  
}
