/*WAP to show use of character and byte stream.
*/

import java.io.*;

public class prac5_4
{
  public static void main(String[] args) throws IOException
  {
   
    FileReader sourceStream = null;
    try
    {
      sourceStream = new FileReader("C:\\Users\\91989\\Desktop\\java\\part 5\\prac5_4.txt");
     
      // reading from the file character by character
      int temp;
      while ((temp = sourceStream.read()) != -1)
      {
        System.out.println((char)temp);
      }
         
    }
    finally
    {     
        // closing stream as no longer in use
        if (sourceStream != null)   
        {
          sourceStream.close();
        } 
             
    }
  }
}