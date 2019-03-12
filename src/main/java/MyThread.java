import javax.swing.table.TableRowSorter;

public class MyThread implements Runnable {
    int value;

    public MyThread(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        int limit = this.value / 2;
        System.out.println("Thread " + Thread.currentThread().getName() + " started with" + this.value);
        while (this.value >= 0) {
            System.out.println(Thread.currentThread().getName() + " value = " + value);
            this.value -= 1;
            if (this.value <= limit && Thread.currentThread().isInterrupted()) {
                System.out.println("Thread interrupted");
                return;
            }
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has finished");
    }
}
