package login.src;

public class Invite {
    Account sender;
    Account receiver;

    public Invite() {

    }

    public Invite(Account sender, Account receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Convite: " +
                "Remetente => " + sender +
                ", Destinatário => " + receiver;
    }
}
