import java.text.ParseException;
import javax.naming.LinkException;

public class Foo1 {
   public void go() {
	   Laundry laundry = new Laundry();
	   try {
		   laundry.doLaundry();
	   } catch(ParseException pex) {
	   } catch(LinkException lex) {
    }
   }
}
