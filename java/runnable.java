 class MyRunnable implements Runnable{//runnable is a interface
public void run(){
 System.out.println("Thread is running");
}
public static void main(String[] args){
    Thread thread = new Thread(new MyRunnable());
    thread.start();//start the thread
}
}