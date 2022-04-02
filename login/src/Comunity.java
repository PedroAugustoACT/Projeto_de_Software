package login.src;

import java.util.ArrayList;

public class Comunity {
    String nameComunity;
    String descriptionComunity;
    Account owner;

    ArrayList<Account> membersComunity;

    public Comunity(){

    }

    public Comunity(String nameComunity, String descriptionComunity, Account owner) {
        this.nameComunity = nameComunity;
        this.descriptionComunity = descriptionComunity;
        this.owner = owner;
        membersComunity = new ArrayList<Account>();
    }
    public void setMember(Account account){
        membersComunity.add(account);
    }
    @Override
    public String toString() {
        return "Comunidade{" +
                "Nome ='" + nameComunity + '\'' +
                ", Descrição ='" + descriptionComunity + '\'' +
                ", Dono =" + owner +
                ", Membros =" + membersComunity +
                '}';
    }
}
