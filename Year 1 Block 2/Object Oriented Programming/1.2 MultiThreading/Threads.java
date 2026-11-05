public class Threads implements Runnable{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println("Main Thread: " + t);
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("changing priority");
        System.out.println("Main Thread: " + t);

        t.run();
    }

    @Override
    public void run() {
        Thread b = Thread.currentThread();
        System.out.println("Main Thread: " + b);
        System.out.println("Main Thread Priority: " + b.getPriority());
    }
    
}
