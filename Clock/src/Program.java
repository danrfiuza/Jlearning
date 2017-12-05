public class Program {
    public static void main(String[] args) throws InterruptedException {
        MyClock clock = new MyClock();
        clock.setCount(10);
        Thread clockThread = new Thread(clock);
        clockThread.start();
    }
}