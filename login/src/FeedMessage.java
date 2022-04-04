package login.src;

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
        return "Feed: " +
                "Mensagem => '" + text + '\'' +
                ", Remetente => " + sender
                ;
    }
}


