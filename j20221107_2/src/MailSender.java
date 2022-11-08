public class MailSender {
    private MailDeliveryService mailDeliveryService;

    public MailSender(MailDeliveryService mailDeliveryService) {
        this.mailDeliveryService = mailDeliveryService;
    }


    void send(){
        mailDeliveryService.sendMail();
    }

}
