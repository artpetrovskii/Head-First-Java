import java.util.*;

public class TestGenerics1 {
   public static void main(String[] args) {
	   new TestGenerics1().go();
   }
   public void go() {
	   Animal[] animals = {};
	   Dog[] dogs = {new Dog(), new Dog(), new Dog()};
	   takeAnimals(animals);
   }
   public void takeAnimals(Animal[] animals) {
	   for(Animal a: animals) {
		   a.eat();
	   }
   }
}
