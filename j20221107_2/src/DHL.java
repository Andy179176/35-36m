public class DHL implements MailDeliveryService{

    @Override
    public void sendMail() {
        System.out.println("Положили письмо в конверт. Приклеили марку. Отправили");
    }
}
