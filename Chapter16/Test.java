import java.util.TreeSet;

class Test {
   public void go() {
	   Book b1 = new Book("How are cats made");
	   Book b2 = new Book("Build your body again");
	   Book b3 = new Book("Finding Emo");
	   BookCompare bCompare = new BookCompare();
	   TreeSet<Book> tree = new TreeSet<Book>();
	   tree.add(new Book("How are cats made"));
	   tree.add(new Book("Finding Emo"));
	   tree.add(new Book("Build your body again"));
	   System.out.println(tree);
   }
}
