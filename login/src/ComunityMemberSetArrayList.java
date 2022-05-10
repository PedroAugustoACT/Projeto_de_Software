import java.util.ArrayList;

public class ComunityMemberSetArrayList implements ComunityMemberSet {

    private ArrayList<Account> members;

    public ComunityMemberSetArrayList() {
        this.members = new ArrayList<Account>();
    }

    public void addMember(Account account){
        this.members.add(account);
    }

    public ArrayList<Account> getAllMembers(){
        return this.members;
    }
}
