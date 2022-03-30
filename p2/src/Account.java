package src;
import java.util.Scanner;

public class Account {

    String login;
    String password;
    String username;

    void status(){
        System.out.println("Seu login é: " + this.login);
        System.out.println("Sua senha é: " + this.password);
        System.out.println("Seu username é: " + this.username);
    }
}
