import java.io.*;
public class prac5_2_2
{
  public static void main(String[] args) throws IOException
  {
   
    FileInputStream sourceStream = null;
    FileOutputStream targetStream = null;
    try
    {
      sourceStream = new
FileInputStream("C:\\Users\\91989\\Desktop\\java\\part 5\\character.txt");
targetStream = new FileOutputStream
("C:\\Users\\91989\\Desktop\\java\\part 5\\byte.txt");
      // reading from character.txt and writing into byte.txt and printing the byte in the program
      int temp;
      while ((temp = sourceStream.read()) != -1)
      {
        System.out.println((byte)temp);
        targetStream.write((byte)temp);
      }
               
    }
    finally
    {
      //closing the file if it is null
      if (sourceStream != null)
      {
        sourceStream.close(); 
      }
           
      if (targetStream != null) 
      {
        targetStream.close();     
      }   
    } 
  }
}