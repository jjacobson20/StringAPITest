public class StringAPITest
{
	public static void main(String[] args)
	{
		String firstString = "Are you new?";
		String secondString = "cool string";
		String thirdString = "";
		
		System.out.println("6th char is: " + firstString.charAt(5));
		System.out.println(firstString.toUpperCase());
		
		System.out.println(secondString.length());
		System.out.println(secondString.getBytes());
		
		System.out.println(thirdString.isEmpty());
		
		System.out.println(firstString.concat(secondString));
	}
}
