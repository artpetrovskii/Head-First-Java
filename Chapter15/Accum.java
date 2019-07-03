class Accum {
private static Accum a = new Accum();
   private int counter = 0;
   public Accum() {}
	   public static Accum getAccum() {
		   return a;
	   }
	   public void updateCounter(int add) {
		   counter += add;
	   }
	   public int getCount() {
		   return counter;
	   }
}

