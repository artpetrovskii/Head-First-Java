public class Loopy {
   public static void main (String[] args) {
   int x = 1;
   System.out.println("Before cycle beginning");
   while (x < 4) {
	   System.out.println("Inside the cycle");
	   System.out.println("The x value is " + x);
	   x = x - 1;
	 }
   System.out.println("After cycle ending");
   }
}
