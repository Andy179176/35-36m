public class Email implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Отправили email");
    }
}
