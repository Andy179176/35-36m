import java.util.Scanner;

public class ScannerEnMailSenderFactory implements MailSenderFactory {
    public MailSender getSender(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("1. DHL");
        System.out.println("2. Email");
        System.out.println("3. Pigeon");
        int choice = scanner.nextInt();
        MailSender mailSender =null;
        switch (choice){
            case 1: mailSender =new MailSender(new DHL()); break;
            case 2: mailSender =new MailSender(new Email()); break;
            case 3: mailSender =new MailSender(new Pigeon()); break;
            default: mailSender =new MailSender(new DHL());
        }
        return mailSender;
    }

}
