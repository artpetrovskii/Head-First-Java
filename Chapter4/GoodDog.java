public class GoodDog {
   private int size;
   public int getSize() {
	   return size;
   }
   public void setSize(int s) {
	   size = s;
   }
   void bark() {
	   if (size > 60) {
		   System.out.println("Gav gav!");
	   } else if (size > 14) {
		   System.out.println("Wuf wuf!");
	   } else {
		   System.out.println("Taf taf!");
	   }
   }
}
