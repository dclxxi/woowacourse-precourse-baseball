package baseball;

public class SystemMessage {
    public void printStart() {
        System.out.println(Message.START);
    }

    public void printInputNumber() {
        System.out.println(Message.INPUT_NUMBER);
    }

    public void printInputState() {
        System.out.println(Message.INPUT_STATE);
    }

    public void printShutDown() {
        System.out.println(Message.SHUTDOWN);
    }
}