
import java.io.*;
public class prac5_4_2
{
 public static void main(String[] args) throws IOException
 {


 FileInputStream sourceStream = null;
 FileOutputStream targetStream = null;
 try
 {
 sourceStream = new
FileInputStream("C:\\Users\\91989\\Desktop\\java\\part 5\\prac5_4.txt");
 targetStream = new FileOutputStream("C:\\Users\\91989\\Desktop\\java\\part 5\\copy.txt");
 // reading from Practical_5_4.txt and writing in copy.txt and printing the byte in the program
 int temp;
 while ((temp = sourceStream.read()) != -1)
 {
 targetStream.write((byte)temp);
 }

 }
 finally
 {
 // closing the file if it is null
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