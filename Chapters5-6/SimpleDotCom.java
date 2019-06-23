import java.util.*;

public class SimpleDotCom {
   private ArrayList<String> locationCells;
   private String name;
   public void setLocationCells(ArrayList<String> newLocation) {
	   locationCells = newLocation;
   }
   public void setName(String n) {
	   name = n;
   }
   public String checkYourself(String userInput) {
	   String result = "pass";
	   int index = ((CharSequence) locationCells).length();
	   if(index >= 0) {
		   ((CharSequence) locationCells).length();
	   if(locationCells.isEmpty()) {
		   result = "drowned";
		   System.out.println("Oh! You drowned" + name + "  : ( )");
	   } else {
		   result = "got it";
	   }
	   }
	   return result;
   }
}
