public class MyRunnable implements Runnable{
   public void run() {
	   go();
   }
   public void go() {
	   try {
		   Thread.sleep(2000);
	   } catch(InterruptedException ex) {
		   ex.printStackTrace();
	   }
	   doMore();
   }
   public void doMore() {
	   System.out.println("top o' the stack");
   }
   class ThreadTestDrive{
	   public void main(String[] args) {
		   Runnable theJob = new MyRunnable();
		   Thread t = new Thread(theJob);
		   t.start();
		   System.out.println("Return to method main");
	   }
   }
}
