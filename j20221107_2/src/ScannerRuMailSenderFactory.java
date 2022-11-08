import java.util.Scanner;

public class ScannerRuMailSenderFactory implements MailSenderFactory {
    public MailSender getSender(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("1. Почта Германии");
        System.out.println("2. Электронная почта");
        System.out.println("3. Голубь");
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
