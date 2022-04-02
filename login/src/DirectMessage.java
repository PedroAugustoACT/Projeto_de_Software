package login.src;


public class DirectMessage {

    String text;
    Account sender;
    Account receiver;


    public DirectMessage() {

    }

    public DirectMessage(String text, Account sender, Account receiver) {
        this.text = text;
        this.sender = sender;
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Mensagem Diretas{" +
                "Mensagen='" + text + '\'' +
                ", Remetente=" + sender +
                ", Destinatário=" + receiver +
                '}';
    }
}
