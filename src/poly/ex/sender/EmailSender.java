package poly.ex.sender;

public class EmailSender implements Sender {
    public void sendMessage(String message) {
        System.out.println("Eamil를 발송합니다: 환영합니다!");
    }
}
