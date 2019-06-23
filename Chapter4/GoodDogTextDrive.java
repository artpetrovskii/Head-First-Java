public class GoodDogTextDrive {
   public static void main(String[] args) {
	   GoodDog one = new GoodDog();
	   one.setSize(70);
	   GoodDog two = new GoodDog();
	   two.setSize(8);
	   System.out.println("The first dog: " + one.getSize());
	   System.out.println("The second dog: " + two.getSize());
	   one.bark();
	   two.bark();
   }
}
