


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
        return "----------------------------------------" + '\n' +
                "Mensagem Diretas: " + '\n' +
                "Mensagem => '" + text + '\n' +
                "Remetente => " + sender + '\n' +
                "Destinatário => " + receiver + '\n' +
                "----------------------------------------";
    }
}
