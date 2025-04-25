package lesson17;

public class JoinEx {
    public static void main(String[] args) {
        MyJoin join1 = new MyJoin(1, 0);
        MyJoin join2 = new MyJoin(1, 0);

        join1.start();
        join2.start();

        try {
            join1.join();
            join2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(join1.sum + join2.sum);
    }
}

class MyJoin extends Thread {
    int start;
    int end;
    int sum;

    public MyJoin(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }
}
