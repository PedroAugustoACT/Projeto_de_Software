
public class Comunity {
    String nameComunity;
    String descriptionComunity;
    Account owner;

    ComunityMemberSet membersComunity;


    public Comunity(String nameComunity, String descriptionComunity, Account owner, ComunityMemberSet membersComunity) {
        this.nameComunity = nameComunity;
        this.descriptionComunity = descriptionComunity;
        this.owner = owner;
        this.membersComunity = membersComunity;
    }
    public void setMember(Account account){ this.membersComunity.addMember(account);
    }
    @Override
    public String toString() {
        return "----------------------------------------" + '\n' +
                "Comunidade: " + '\n' +
                "Nome => '" + nameComunity + '\n' +
                "Descrição => '" + descriptionComunity + '\n' +
                "Dono => " + owner + '\n' +
                "Membros => " + membersComunity.getAllMembers() + '\n' +
                "----------------------------------------";
    }
}
