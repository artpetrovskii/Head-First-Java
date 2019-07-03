public class RyanAndMonicaJob implements Runnable{
   private BankAccount account = new BankAccount();
   public static void main(String[] args) {
	   RyanAndMonicaJob theJob = new RyanAndMonicaJob();
	   Thread one = new Thread(theJob);
	   Thread two = new Thread(theJob);
	   one.setName("Ryan");
	   two.setName("Monica");
	   one.start();
	   two.start();
   }
   public void run() {
	   for (int x = 0; x < 10; x++) {
		   makeWithdrawal(10);
		   if (account.getBalance() < 10) {
			   System.out.println("Limit exceeded!");
		   }
	   }
   }
   private synchronized void makeWithdrawal(int amount) {
	   if (account.getBalance() >= amount) {
		   System.out.println(Thread.currentThread().getName() + " is going to take money.");
		    try{
		      System.out.println(Thread.currentThread().getName() + " goes sleeping.");
		      Thread.sleep(500);
		    } catch(InterruptedException ex) {ex.printStackTrace(); }
		    System.out.println(Thread.currentThread().getName() + " wakes up.");
		    account.withdraw(amount);
		    System.out.println(Thread.currentThread().getName() + " finishies tranzaction.");
	        }
	      else {
	    	  System.out.println("Sorry, for client. " + Thread.currentThread().getName() + " not enough money.");
	      }
   }
}
