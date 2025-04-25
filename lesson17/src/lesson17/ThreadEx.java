package lesson17;

public class ThreadEx {
    public static void main(String[] args) {
        System.out.println("main 시작");

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();  // 멀티 스레드 방식
        myThread2.start();  

        Thread thread = new Thread(new MyThread());
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(i + " :: Thread :: " + Thread.currentThread().getName());
            }
        });
        thread.start();
        thread2.start();

        // myThread1.run(); // 싱글 스레드 방식 - 주의: 이렇게 하면 멀티스레드가 아님

        System.out.println(Thread.currentThread().getName());
        System.out.println("main 종료");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        test();
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " :: Thread :: " + getName());
        }
    }

    void test() {
        System.out.println("test");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " :: Thread :: " + Thread.currentThread().getName());
        }
    }
}
