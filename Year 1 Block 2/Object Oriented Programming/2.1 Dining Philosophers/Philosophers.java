public class Philosophers {

    // Shared resource representing a fork
    static class Fork {
        private final int id;

        public Fork(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }

    // Runnable task representing a philosopher's lifecycle
    static class Philosopher implements Runnable {
        private final int id;
        private final Fork leftFork;
        private final Fork rightFork;

        public Philosopher(int id, Fork leftFork, Fork rightFork) {
            this.id = id;
            this.leftFork = leftFork;
            this.rightFork = rightFork;
        }

        private void performAction(String action) throws InterruptedException {
            System.out.println("Philosopher " + id + ": " + action);
            // Simulate variable action duration (thinking or eating)
            Thread.sleep((long) (Math.random() * 500));
        }
        private int getId(){
            return id;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    // 1. Thinking phase
                    performAction("Thinking...");



                    if(this.getId() == 4){
                        synchronized (rightFork) {
                            performAction("Picked up right Fork " + rightFork.getId() + " -> EATING");
                           
                            // Finished eating; releasing right fork on block exit
                        }
                    }
                    // 2. Acquire left fork
                    synchronized (leftFork) {
                        performAction("Picked up left Fork " + leftFork.getId());

                          // Thread.sleep(50);

                        // 3. Acquire right fork
                        synchronized (rightFork) {
                            performAction("Picked up right Fork " + rightFork.getId() + " -> EATING");
                           
                            // Finished eating; releasing right fork on block exit
                        }

                       
                        // Released left fork on block exit
                        performAction("Put down left Fork " + leftFork.getId());
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        final int NUM_PHILOSOPHERS = 5;

        Fork[] forks = new Fork[NUM_PHILOSOPHERS];
        Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];

        // Instantiate all shared forks
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new Fork(i);
        }

        // Instantiate philosophers with their adjacent left and right forks
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % NUM_PHILOSOPHERS];

            philosophers[i] = new Philosopher(i, leftFork, rightFork);
        }

        // Start thread execution for each philosopher
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            Thread t = new Thread(philosophers[i], "Philosopher-" + i);
            t.start();
        }
    }
}
