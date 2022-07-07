
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void accountMenu(Scanner myObj, Account account, AccountManager editable) {
        InvokerCommandMenu invoker = new InvokerCommandMenu();
        while (true) {
            System.out.println("IFace");
            System.out.println("------------------------------");
            for (CommandMenuParent command : invoker.commands) {
               System.out.println("Pressione " + command.number + " para: " + command.name);
             }
            System.out.print("=> ");

            try {
                int value = myObj.nextInt();
                invoker.executeCommand(value, myObj, account, editable);
                if(value == 13){
                    System.out.println("Pressione Enter novamente");
                    return;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("DIGITE UM NÚMERO VÁLIDO");
            } finally {
                myObj.nextLine();
            }

        }

    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        myObj.useDelimiter("\r?\n");
        AccountManager c1 = new AccountManager();

        int user_num;

        while (true) {

            System.out.println("MENU IFace");
            System.out.println("--------------");
            System.out.println("Pressione 1 para: Adicionar conta");
            System.out.println("Pressione 2 para: Logar");
            System.out.println("Pressione 3 para: Sair");

            System.out.print("Sua escolha: ");

            try {
                user_num = myObj.nextInt();
                switch (user_num) {

                    case 1:

                        System.out.println("Adicionar conta");
                        try {
                            Account a1 = new Account("", "", "");
                            
                            
                            System.out.println("Digite seu login: ");
                            System.out.print("=> ");
                            a1.login = myObj.next();
                            
                            if(!a1.login.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")){
                                throw new ExceptionLoginUser("DIGITE UM LOGIN VÁLIDO (Ex. fulano@gmail.com)");
                            }
                            
                            for (Account account1: c1.accounts) {
                                if(account1.login.equals(a1.login)){
                                    throw new ExceptionLoginUser("JÁ EXISTE UMA CONTA COM ESSE LOGIN"); 
                                }
                            }
                            
                            System.out.println("Digite sua senha: ");
                            System.out.print("=> ");
                            a1.password = myObj.next();
                            if(a1.password.contains(" ")){
                                throw new ExceptionLoginUser("DIGITE UMA SENHA VÁLIDA (SEM ESPAÇOS)");
                            }
                            else if(a1.password.length()< 5){
                                throw new ExceptionLoginUser("SUA SENHA DEVE TER 6 OU MAIS DÍGITOS");
                            }
                            
                            System.out.println("Digite seu username: ");
                            System.out.print("=> ");
                            a1.username= myObj.next();
                            if(!a1.username.matches("[\\p{L}\\s]+")){
                                throw new ExceptionLoginUser("DIGITE UM USERNAME VÁLIDO (SEM NÚMEROS, ACENTOS OU CARACTERES ESPECIAIS)");
                            }
                            System.out.println("");
                            
                            c1.accounts.add(a1);
                            
                            System.out.println("Conta criada com sucesso!");
                            System.out.println(a1);
                            break;
                            
                        } catch (ExceptionLoginUser containsSpace) {
                            System.out.println(containsSpace.getMessage());
                        }
                        break;

                    case 2:
                        System.out.println("Logar");
                        Account account;
                        account = c1.login(myObj);
                        try {
                            if (account.active == true) {
                                accountMenu(myObj, account, c1);
                            } else if (account.active == false) {
                                System.out.println("Conta removida!");
                                c1.recoverAccount(myObj, account);
                            }
                        } catch (NullPointerException errorNUllAccount) {
                            System.out.println("Usuário ou senha inválidos");
                        }

                        break;

                    case 3:
                        System.out.println("ENCERRANDO");
                        return;

                    default:

                        System.out.println("DIGITE UM NÚMERO VÁLIDO");

                }
            } catch (InputMismatchException e) {
                System.out.println("DIGITE UM NÚMERO VÁLIDO");
            } catch (NoSuchElementException e){
                System.out.println("3, ENCERRANDO");
            }finally {
                myObj.nextLine();
            }

        }
    }
}
