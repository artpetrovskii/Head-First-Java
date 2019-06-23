public class Animals {
   Animals[] animals = new Animals[5];
   animals[0] = new Dog();
   animals[1] = new Cat();
   animals[2] = new Wolf();
   animals[3] = new DHippo();
   animals[4] = new Lion();
   for(int i = 0; i < animals.length; i++) {
	   animals[i].eat();
	   animals[i].roam();
   }
}
