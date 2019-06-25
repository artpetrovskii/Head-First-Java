import java.nio.charset.CharacterCodingException;
import java.text.ParseException;

import javax.naming.LinkException;

public class Washer {
   Laundry laundry = new Laundry();
   public void foo() throws CharacterCodingException, LinkException, ParseException{
	   laundry.doLaundry();
   }
   public static void main(String[] args) throws CharacterCodingException, LinkException, ParseException {
	   Washer a = new Washer();
	   a.foo();
   }
}
