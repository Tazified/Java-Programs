package encrytp;
import java.util.Scanner;


public class Encrypt {

    public static StringBuffer encrypt(String text, int s)
	{
		StringBuffer result= new StringBuffer();

		for (int i=0; i<text.length(); i++)
		{
			if (Character.isUpperCase(text.charAt(i)))
			{
				char ch = (char)(((int)text.charAt(i) +
								s - 65) % 26 + 65);
				result.append(ch);
			}
			else
			{
				char ch = (char)((((int)text.charAt(i) +
								s - 97) % 26 + 97)-32);
				result.append(ch);
			}
		}
		return result;
	}


	public static void main(String[] args)
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter Text");
		String text =sc.next();
    System.out.println("enter shift amount");
		int s =sc.nextInt();
		System.out.println("Text : " + text);
		System.out.println("Shift : " + s);
		System.out.println("Encrypted data: "+ encrypt(text, s));
	}
}
