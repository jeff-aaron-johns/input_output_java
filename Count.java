import java.io.FileInputStream;

public class Count {

	public static void main(String[] args) {
		try
		{
			FileInputStream rd=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\javatext2.txt");
			int i=0;
			int letter=0,space=0,spchar=0,number=0;
			
			while((i=rd.read())!=-1)
			{
				if(Character.isLetter(i))
				{
					letter=letter+1;
				}
		 
			else if (Character.isDigit(i))
			{
				number=number+1;
				
			}
			
			else if (Character.isSpaceChar(i))
			{
				space=space+1;
			}
			else
			{
				spchar=spchar+1;
				
			}
			}
			

 System.out.println("Alphabets = " +letter);
 System.out.println("Numbers = " + number);
 System.out.println("Special Symbols = " +spchar);
 
 rd.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

		
 