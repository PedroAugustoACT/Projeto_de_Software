
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
// import login.src.Account;
// import login.src.AccountManager;

public class Main {
    public static void accountMenu(Scanner myObj, Account account, AccountManager editable) {

        while (true) {
            System.out.println("IFace");
            System.out.println("------------------------------");
            System.out.println("Pressione 1 para: Editar perfil");
            System.out.println("Pressione 2 para: Adicionar amigo");
            System.out.println("Pressione 3 para: Ver convites");
            System.out.println("Pressione 4 para: Enviar mensagem");
            System.out.println("Pressione 5 para: Criar comunidade");
            System.out.println("Pressione 6 para: Entrar em uma comunidade");
            System.out.println("Pressione 7 para: Listas minhas informações");
            System.out.println("Pressione 8 para: Remover conta");
            System.out.println("Pressione 9 para: Enviar mensagem no feed");
            System.out.println("Pressione 10 para: Ver lista de amigos");
            System.out.println("Pressione 11 para: Ver mensagens diretas");
            System.out.println("Pressione 12 para: Ver mensagens do feed");
            System.out.println("Pressione 13 para: Logout");
            System.out.print("=> ");

            try {
                int value = myObj.nextInt();
                switch (value) {

                    case 1:
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

                        break;

                    case 2:
                        System.out.println("ADICIONAR AMIGO");
                        try {
                            editable.sendInvite(myObj, account);
                        }
                        catch(ExceptionLogin nullLogin){
                            System.out.println(nullLogin.getMessage());
                        }
                        catch (Exception nullFriend) {
                            System.out.println(nullFriend.getMessage());
                        }
                        

                        break;

                    case 3:
                        System.out.println("VER CONVITES");
                        try{
                            editable.answerInvite(myObj, account);
                            break;
                        }
                        catch(ExceptionLogin nullLogin){
                            System.out.println(nullLogin.getMessage());
                        }
                        break;

                    case 4:
                        System.out.println("ENVIAR MENSAGEM");
                        try {
                            editable.sendMessage(myObj, account);
                            
                        } catch (ExceptionLogin nullLogin) {
                            System.out.println(nullLogin.getMessage());
                        }
                        break;

                    case 5:

                        System.out.println("CRIAR COMUNIDADE");

                        editable.addComunity(myObj, account);
                        break;

                    case 6:

                        System.out.println("Entrar em uma comunidade");
                        try {
                            editable.addMember(myObj, account);
                            break;
                        } catch (ExceptionComunity nullComunity) {
                            System.out.println(nullComunity.getMessage());
                        }
                        

                    case 7:
                        System.out.println("Listar informações");

                        editable.listInformations(myObj, account);
                        break;

                    case 8:
                        System.out.println("Remover sua conta");

                        if (editable.removeAccount(myObj, account)) {
                            return;
                        }

                        break;

                    case 9:
                        System.out.println("Enviar mensagem no feed");
                        editable.sendFeed(myObj, account);
                        break;

                    case 10:
                        System.out.println(account.friends);
                        break;

                    case 11:
                        System.out.println(account.messages);
                        break;

                    case 12:

                        System.out.println(account.messagesFeed);
                        System.out.println(account.messagesFriends);
                        break;
                    case 13:
                        return;

                    default:
                        System.out.println("DIGITE UM NÚMERO VÁLIDO");
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
        // c1.create(myObj);

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
                            c1.create(myObj);
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
                return;
            }finally {
                myObj.nextLine();
            }

        }
    }
}
