import java.util.ArrayList;

public class SimpleDotComGame {
   public static void main(String[] args) {
	   int numOfGuesses = 0;
	   GameHelper helper = new GameHelper();
	   SimpleDotCom theDotCom = new SimpleDotCom();
	   int randomNum = (int) (Math.random() * 5);
	   int[] locations = {randomNum, randomNum + 1, randomNum + 2};
	   boolean isAlive = true;
	   while(isAlive == true) {
		   String guess = helper.getUserInput("Enter a number");
		   String result = theDotCom.checkYourself(guess);
		   numOfGuesses++;
		   if(result.equals("drowned")) {
			   isAlive = false;
			   System.out.println("You used " + numOfGuesses + "try(ies)");
		   }
	   }
   }
}
 