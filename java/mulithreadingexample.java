 class MultiThreadExample implements Runnable {
    public void run() {
        // Code to be executed in the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
            
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create and start multiple threads
        Thread thread1 = new Thread(new MultiThreadExample());
        Thread thread2 = new Thread(new MultiThreadExample());
        Thread thread3 = new Thread(new MultiThreadExample());
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
