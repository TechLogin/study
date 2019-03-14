import java.util.Random;

public class Main {
    public  static String line = "";
    public static void main(String[] args) {
//        Object loker = new Object();
//        MyReader reader = new MyReader ("lines.txt", loker);
//        Mywriter wryter = new Mywriter("lines_out.txt", loker);
//
//        Thread readerThread = new Thread(reader);
//        Thread writerThread = new Thread(writer);
//
//        readerThread.setDaemon(true);
//        writerThread.setDaemon(true);
//
//        writerThread.start();
//
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//
//        }
//
//
        int v  =new Random().nextInt(10);
        MyThread myThread = new MyThread(v);
        Thread t1 = new Thread(myThread);
        t1.setDaemon (true);

        v= new Random().nextInt(20);
        MyThread myThread2 = new MyThread(v);
        Thread t2 = new Thread(myThread2);
        t2.setDaemon(true);
        t1.start();
        t2.start();
git         try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
