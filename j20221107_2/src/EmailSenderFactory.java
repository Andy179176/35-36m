public class EmailSenderFactory implements MailSenderFactory {
    public MailSender getSender(){

        return new MailSender(new Email());
    }

}
