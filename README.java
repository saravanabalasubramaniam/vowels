import java.io.*;
import java.util.*;
class Vowels
{
  public static void main(String args[])
   {
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	int flag=0;
	for(int i=0;i<a.length();i++)
	{
	 	if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||

a.charAt(i)=='O'||a.charAt(i)=='U'||a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)

=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
		{
			flag=1;
		}
	}
                  if(flag==1)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
   }
}
