import java.io.FileInputStream;
import java.util.Scanner;


public class Reverse {

	public static void main(String[] args) 
	{
		try
		{ 
			FileInputStream rs=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\javatext1.txt");
			
			String a,b=" ";
			Scanner scan=new Scanner(rs);
			a=scan.nextLine();
			int n=a.length();
			
			for(int i=n-1;i>=0;i--)
			{
				b=b+a.charAt(i);
			}
			
			System.out.println(b);
			rs.close();
		}
		
		catch(Exception e)
		
		{
			System.out.println(e);
		}
	}

}


