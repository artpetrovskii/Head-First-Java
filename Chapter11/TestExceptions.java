public class TestExceptions {
   public static void main(String[] args) {
	   String test = "No";
	   try {
		   System.out.println("Try beginning");
		   doRisky(test);
		   System.out.println("Try ending");
	   } catch(Exception se) {
		   System.out.println("Terrible exception");
	   } finally {
		   System.out.println("finally");
	   }
	   System.out.println("Main end");
   }
   static void doRisky(String test) throws Exception{
	   System.out.println("Dangerous method beginning");
	   if("yes".equals(test)) {
		   throw new Exception();
	   }
	   System.out.println("Dangerous method ending");
	   return;
   }
}
