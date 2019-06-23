public class MovieTestDrive {
   public static void main(String[] args) {
	   Movie one = new Movie();
	   one.title = "How to burn on share";
	   one.genre = "Tragedy";
	   one.rating = -2;
	   Movie two = new Movie();
	   two.title = "Lost in office";
	   two.genre = "Comedy";
	   two.rating = 5;
	   two.playIt();
	   Movie three = new Movie();
	   three.title = "Bite-club";
	   three.genre = "Tragedy, but mostly happy";
	   three.rating = 127;
   }
}
