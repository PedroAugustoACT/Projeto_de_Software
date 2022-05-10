
public class DirectMessage extends Message {

    public Account receiver;


    public DirectMessage(String text, Account sender, Account receiver) {
        super(text, sender);
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Destinatário => " + receiver + '\n' +
                "Mensagem Privada" + '\n' +
                "----------------------------------------";
    }
}
