public class MyAnimalsList {
   private Animals[] animals = new Animals[5];
   private int nextIndex = 0;
   public void add(Animals a) {
	   if(nextIndex < animals.length) {
		   animals[nextIndex] = a;
		   System.out.println("Animals added to " + nextIndex);
		   nextIndex++;
	   }
   }
}
