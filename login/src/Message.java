import java.util.ArrayList;

public abstract class Message {
    public String text;
    Account sender;

    public Message() {
    }

    public Message(String text, Account sender) {
        this.text = text;
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "----------------------------------------" + '\n' +
                "Mensagem Diretas: " + '\n' +
                "Mensagem => '" + text + '\n' +
                "Remetente => " + sender + '\n'
                ;
    }
}
