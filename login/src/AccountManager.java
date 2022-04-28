
import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
    ArrayList<Account> accounts;
    ArrayList<Comunity> comunities;


    public AccountManager(){
        accounts = new ArrayList<Account>();
        comunities = new ArrayList<Comunity>();
    }
    
    public void create(Scanner myObj) {
        
        Account a1 = new Account("", "", "");
        

        System.out.println("Digite seu login: ");
        System.out.print("=> ");
        a1.login = myObj.next();

        System.out.println("Digite sua senha: ");
        System.out.print("=> ");
        a1.password = myObj.next();

        System.out.println("Digite seu username: ");
        System.out.print("=> ");
        a1.username= myObj.next();

        System.out.println("");

        accounts.add(a1);

        System.out.println("Conta criada com sucesso!");
        System.out.println(a1);
        // for (Account account: accounts) {
        //     System.out.println(account);
        // }
    }

    public Account login(Scanner myObj){
        System.out.println("Login");
        System.out.println("----------------");
        System.out.println("Digite o seu login: ");
        System.out.print("=> ");
        String login = myObj.next();
        System.out.println("Digite a sua senha: ");
        System.out.print("=> ");
        String password = myObj.next();

        for (Account account: accounts) {
            if(account.login.equals(login)){
                if(account.password.equals(password)){
                    System.out.println("Login realizado!");
                    return account;
                }
            }
        }
        System.out.println("Não foi possível realizar o login!");
        return null;

    }

    public void managerPerfil(Scanner myObj, Account account){

        System.out.println("Digite 1 para criar um novo atributo");
        System.out.println("Digite 2 para editar um atributo");
        System.out.println("Digite 3 para sair");
        System.out.print("=> ");

        int v;
        v = myObj.nextInt();

        switch (v){
            case 1:
            System.out.println("Criar");

            System.out.println("Digite o nome do atributo: ");
            System.out.print("=> ");
            String nameAtribute = myObj.next();

            System.out.println("Digite o valor do atributo: ");
            System.out.print("=> ");
            String valueAtribute = myObj.next();

            Atribute newAtribute = new Atribute(nameAtribute, valueAtribute);

            account.setAtribute(newAtribute);

            break;

            case 2:
            System.out.println("Editar");
            System.out.println("Lista de atributos:");
            System.out.println(account);
           
            for (Atribute atribute: account.atributes){
                System.out.println(atribute.name + ": " + atribute.value);
            }

            System.out.print("Digite o nome do atributo para editar: ");
            String editableAtribute = myObj.next();

            System.out.print("Digite o novo valor do atributo: ");
            String editableValue = myObj.next();

            if(editableAtribute.toUpperCase().equals("LOGIN")){
                account.login = editableValue;
            }
            else if (editableAtribute.toUpperCase().equals("SENHA")){
                account.password = editableValue;
            } 
            else if (editableAtribute.toUpperCase().equals("USER")){
                account.username = editableValue;
            }
            else{
                for (Atribute atribute: account.atributes){
                    if(atribute.name.toUpperCase().equals(editableAtribute.toUpperCase())){
                        atribute.value = editableValue;
                    }
                }
            }

            break;

            case 3:
            System.out.println("ENCERRANDO");
            return;


            default:
            System.out.println("Digite um número válido");
        }

        

    }

    public void addComunity(Scanner myObj, Account account){
        System.out.println("Digite o nome da sua comunidade: ");
        System.out.print("=> ");
        String name = myObj.next();

        System.out.println("Digite a descrição: ");
        System.out.print("=> ");
        String description = myObj.next();

        Comunity newComunity= new Comunity(name, description, account);

        comunities.add(newComunity);

        System.out.println(newComunity);
    }

    public void addMember(Scanner myObj, Account account){
        for (Comunity comunity: comunities){
            System.out.println(comunity);
        }
        System.out.println("Qual comunidade deseja entrar?");
        System.out.print("=> ");
        String pickComunity = myObj.next();

        for (Comunity comunity: comunities){
            if(comunity.nameComunity.toUpperCase().equals(pickComunity.toUpperCase())){
                comunity.setMember(account);
                return;
            }
        }
        System.out.println("Digite uma comunidade válida");
    }

    public void sendMessage(Scanner myObj, Account account){
        for (Account currentAccount: accounts){
            if (currentAccount.active) {
                System.out.println(currentAccount);
            }
        }
        System.out.println("Digite o login de quem você deseja enviar:");
        System.out.print("=> ");
        String pickProfile = myObj.next();

        for (Account currentAccount: accounts){

            if(currentAccount.login.toUpperCase().equals(pickProfile.toUpperCase())) {
                if (!currentAccount.active) {
                    break;
                }

                System.out.print("Mensagem: ");
                String currentMessage = myObj.next();

                DirectMessage newMessage = new DirectMessage(currentMessage, account, currentAccount);

                account.setMessage(newMessage);
                currentAccount.setMessage(newMessage);
                System.out.println(newMessage);
                return;
            }
        }
        System.out.println("ERRO!");


    }

    public void sendInvite(Scanner myObj, Account account){
        for (Account currentAccount: accounts){
            if(currentAccount.active){
                System.out.println(currentAccount);
            }
        }

        System.out.println("Digite o login de quem você quer adicionar: ");
        System.out.print("=> ");
        String nameInvite = myObj.next();

        for (Account currentAccount: accounts) {
            if (currentAccount.login.toUpperCase().equals(nameInvite.toUpperCase())) {
                if (!currentAccount.active) {
                    break;
                }
                if (currentAccount.login.toUpperCase().equals(account.login.toUpperCase())) {
                    System.out.println("VOCÊ NÃO PODE SE ADICIONAR COMO AMIGO");
                    return;
                }
                for (Account friend : account.friends) {
                    if (currentAccount.login.toUpperCase().equals(friend.login.toUpperCase())) {
                        System.out.println("AMIGO JÁ ADICIONADO");
                        return;
                    }
                }

                Invite newInvite = new Invite(account, currentAccount);
                currentAccount.setInvite(newInvite);

                return;
            }
        }
        System.out.println("ERRO!");
    }

    public void answerInvite(Scanner myObj, Account account){

        for (Invite invite: account.invites){
            if(invite.sender.active){
                System.out.println(invite);
            }
        }
        System.out.println("Digite o login de quem deseja responder:");
        System.out.print("=> ");
        String nameInvite = myObj.next();

        for (Invite invite: account.invites) {
            if (invite.sender.login.toUpperCase().equals(nameInvite.toUpperCase())) {
                if(!invite.sender.active){
                    break;
                }
                System.out.println("Digite 1 para aceitar e 2 para recusar");
                System.out.print("=> ");
                int responseInvite = myObj.nextInt();
                if(responseInvite == 1){
                    account.invites.remove(invite);
                    account.friends.add(invite.sender);
                    invite.sender.friends.add(account);
                    System.out.println("AMIGO ADICIONADO!");
                    return;
                }
                else if(responseInvite == 2){
                    account.invites.remove(invite);
                    System.out.println("CONVITE RECUSADO!");
                    return;
                }
                else{
                    System.out.println("NÚMERO INVÁLIDO");
                    return;
                }
            }
        }
        System.out.println("ERRO!");
    }

    public void sendFeed(Scanner myObj, Account account){
        System.out.println("Digite 1 para mandar a mensagem no feed de amigos e 2 para o feed geral");
        System.out.print("=> ");
        int pickFeed = myObj.nextInt();

        System.out.print("Mensagem: ");
        String textMessage = myObj.next();

        if(pickFeed == 1){
            FeedMessage feedMessage = new FeedMessage(textMessage, account);
            account.setmessageFriends(feedMessage);

            for (Account friend: account.friends){
                if(friend.active){
                    friend.setmessageFriends(feedMessage);
                }
            }
            System.out.println("Mensagem enviada!");
        }
        else if (pickFeed == 2){
            FeedMessage feedMessage = new FeedMessage(textMessage, account);
            /*account.setMessageFeed(feedMessage);*/

            for (Account currentAccount: accounts){
                if(currentAccount.active){
                    currentAccount.setMessageFeed(feedMessage);
                }
            }
            System.out.println("Mensagem enviada!");
        }
        else{
            System.out.println("DIGITE UM NÚMERO VÁLIDO");
        }
    }

    public boolean removeAccount(Scanner myObj, Account account){

        System.out.println("Digite 1 se quiser remover a sua conta, e 2 para voltar");
        System.out.print("=> ");
        int feedbackUser = myObj.nextInt();

        if(feedbackUser == 1){
            account.active = false;
            return true;
        }
        return false;
    }

    public void recoverAccount(Scanner myObj, Account account){

        System.out.println("Digite 1 se quiser recuperar a sua conta, e 2 para voltar");
        System.out.print("=> ");
        int feedbackUser = myObj.nextInt();

        if(feedbackUser == 1){
            account.active = true;
        }
        else if(feedbackUser == 2){
            return;
        }
    }

    public void listInformations(Scanner myObj, Account account){

        System.out.println("Perfil:");
        System.out.println(account);

        for (Atribute atribute: account.atributes){
            System.out.println(atribute.name + ": " + atribute.value);
        }

        System.out.println("Comunidades:");
        for(Comunity comunity: comunities){
            if(comunity.owner.login.toUpperCase().equals(account.login.toUpperCase())){
                System.out.println(comunity);
                continue;
            }
            for(Account currentAccount: comunity.membersComunity){
                if (currentAccount.login.toUpperCase().equals(account.login.toUpperCase())){
                    if(!comunity.owner.active){
                        break;
                    }
                    System.out.println(comunity);
                    break;
                }
            }
        }

        System.out.println("Amigos:");
        System.out.println(account.friends);

        System.out.println("Mensagens Diretas:");
        System.out.println(account.messages);
        System.out.println("Mensagens do feed:");
        System.out.println(account.messagesFeed);
        System.out.println("Mensagens dos amigos no feed:");
        System.out.println(account.messagesFriends);


    }
}


