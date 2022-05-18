

public class Invite {
    public Account sender;
    public Account receiver;

    public Invite() {

    }

    public Invite(Account sender, Account receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "----------------------------------------" + '\n' +
                "Convite: " + '\n' +
                "Remetente => " + sender + '\n' +
                "Destinatário => " + receiver + '\n' +
                "----------------------------------------";
    }
}
