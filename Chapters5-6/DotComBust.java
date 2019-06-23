import java.util.*;

public class DotComBust {
   private GameHelper helper = new GameHelper();
   private ArrayList<SimpleDotCom> dotComsList = new ArrayList<SimpleDotCom>();
   private int numOfGuesses = 0;
private void setUpGame() {
	SimpleDotCom one = new SimpleDotCom();
	one.setName("Pets.com");
	SimpleDotCom two = new SimpleDotCom();
	two.setName("eToys.com");
	SimpleDotCom three = new SimpleDotCom();
	three.setName("Go2.com");
	dotComsList.add(one);
	dotComsList.add(two);
	dotComsList.add(three);
	System.out.println("Your goal is to drown three sites.");
	System.out.println("Pets.com, eToy.com, Go2.com");
	System.out.println("Try to drown them as minimal tries.");
	for(SimpleDotCom dotComToSet: dotComsList) {
		ArrayList<String> newLocation = helper.placeSimpleDotCom(3);
		dotComToSet.setLocationCells(newLocation);
	}
   }
private void startPlaying() {
	while(!dotComsList.isEmpty()) {
		String userGuess = helper.getUserInput("Make a move.");
		checkUserGuess(userGuess);
	}
	finishGame();
   }
private void checkUserGuess(String userGuess) {
	numOfGuesses++;
	String result = "pass";
	for(SimpleDotCom dotComToTest : dotComsList) {
		result = dotComToTest.checkYourself(userGuess);
		if(result.equals("got it")) {
			break;
		}
		if(result.equals("drowned")) {
			dotComsList.remove(dotComToTest);
			break;
		}
	}
	System.out.println(result);
   }
private void finishGame() {
	System.out.println("All sites are drowned! Your shares cost nothing.");
	if(numOfGuesses <= 18) {
		System.out.println("It took just only " + numOfGuesses + " tries.");
		System.out.println("You got out before you investment drowned.");
	} else {
		System.out.println("It took you much time." + numOfGuesses + "tries.");
		System.out.println("Fish dance around your investments.");
	}
   }
public static void main(String[] args) {
	DotComBust game = new DotComBust();
	game.setUpGame();
	game.startPlaying();
   }
}












