import java.io.*;

public class Pond implements Serializable{
   public Duck duck = new Duck();
   public static void main(String[] args) {
	   Pond myPond = new Pond();
	   try {
		   FileOutputStream fs = new FileOutputStream("fond.ser");
		   ObjectOutputStream os = new ObjectOutputStream(fs);
		   os.writeObject(myPond);
		   os.close();
	   } catch(Exception ex) {
		   ex.printStackTrace();
	   }
   }
}
