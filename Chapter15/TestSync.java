public class TestSync implements Runnable{
   private int balance;
   public void run() {
	   for (int i = 0; i < 50; i++) {
		   increment();
		   System.out.println("Balance is " + balance);
	   }
   }
   public void increment() {
	   int i = balance;
	   balance = i + 1;
   }
}
