package week4.day1;
//*Polymorphism in Java To understand and implement the concept of Overloading in Java by creating a class and implementing method with different sets of input arguments*//
public class AutomationTesting {
	public void reportstep(String message, String status)
	{
	System.out.println("1st method Message: " + message + "\n1st method Status: " +status);
}
	public void reportstep(String message, String status, boolean snap)
	{
	System.out.println("2nd method Message: " + message + "\n2nd method Status: " + status + "\n2nd method Take Snapshot: " + snap);
	}
	public static void main(String[] args) {
		 AutomationTesting test = new AutomationTesting();
		 test.reportstep("Login Successfull", "PASS");
test.reportstep("Login Failed", "FAIL", false);
	}

}
