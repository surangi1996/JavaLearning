package threads;

public class ThreadDummy extends Thread {
    @Override
    public void run() {
        System.out.println("me miniha mata wada denawa !");
        for (int i = 0; i < 500; i++)   {
            System.out.println("merenawa dn nm !");
        }
    }

    public static void main(String[] args) {
        ThreadDummy threadObj = new ThreadDummy(); // new state
        threadObj.start(); // runnable state
        for (int i = 0; i < 500; i++)   {
            System.out.println("chutiyo !");
        }

        //---------------------------------------------------
        class RunnableThread implements Runnable{

            @Override
            public void run() {
                System.out.println("thread multiple hadanna puluwan");
            }
        }
        Thread newTread = new Thread(new RunnableThread());
        newTread.start();

        //---------------------------------------------------
        Thread newThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread multiple hadanna be ");
            }
        });
        newThread1.start();

        //----------------------------------------------------
        Thread threadLambda = new Thread(() -> {
            System.out.println("threads using lambda");
        });
        threadLambda.start();
    }

}
