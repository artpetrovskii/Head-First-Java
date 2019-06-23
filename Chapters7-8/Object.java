public class Object {
   public void equals(Object o) {
	   Dog a = new Dog();
	   Cat c = new Cat();
	   if(a.equals(c)) {
		   System.out.println("true");
	   } else {
		   System.out.println("false");
	   }
   public void getClass() {
	   Cat c = new Cat();
	   System.out.println(c.getClass());
    }
   public void hashCode() {
	   Cat c = new Cat();
	   System.out.println(c.hashCode());
    }
   public void toString() {
	   Cat c = new Cat();
	   System.out.println(c.oString());
    }
   }
}
