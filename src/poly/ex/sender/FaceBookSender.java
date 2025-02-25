package poly.ex.sender;

public class FaceBookSender implements Sender {
    public void sendMessage(String message) {
        System.out.println("FaceBook를 발송합니다: 환영합니다!");
    }
}
