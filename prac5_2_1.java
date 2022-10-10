/*When to use Character Stream over Byte Stream? When to use Byte Stream over
Character Stream? Give example.
 */
import java.io.*;

public class prac5_2_1
{
public static void main(String[] args) throws IOException
{



FileReader sourceStream = null;
try
  {
   sourceStream = new FileReader("C:\\Users\\91989\\Desktop\\java\\part 5\\character.txt");
  
   // reading from the file character by character
   int temp;
   while ((temp = sourceStream.read()) != -1)
   {
    System.out.println((char)temp);
   }
    
  }
  finally
  {   
    // closing stream
    if (sourceStream != null) 
    {
     sourceStream.close();
    }  
       
  }
 }
}