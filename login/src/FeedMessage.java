

public class FeedMessage {
    String text;
    Account sender;

    public FeedMessage() {

    }

    public FeedMessage(String text, Account sender) {
        this.text = text;
        this.sender = sender;
    }

    @Override
    public String toString() {
        return '\n' +
                "----------------------------------------" + '\n' +
                "Feed: " + '\n' +
                "Mensagem => '" + text + '\n' +
                "Remetente => " + sender + '\n' +
                "----------------------------------------";
    }
}


