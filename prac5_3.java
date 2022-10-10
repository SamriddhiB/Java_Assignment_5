/*Write a program to transfer data from one file to another file so that if the destination file
does not exist, it is created.
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class prac5_3
{
 public static void main(String[] args) throws IOException
 {


 // creating a file
 File f1 = new File("C:\\Users\\91989\\Desktop\\java\\part 5\\prac5_3.txt");
 f1.createNewFile();
 // creating an object for reading and writing the file
     FileInputStream input = new FileInputStream("C:\\Users\\91989\\Desktop\\java\\part 5\\prac5_3.txt");
     FileOutputStream output = new FileOutputStream("C:\\Users\\91989\\Desktop\\java\\part 5\\copy.txt");
    
     int temp;
    
     // copying from first file and writing in another file
     while((temp = input.read()) != -1)
     {
       output.write((char) temp);
     }
    
     // closing both the files
     output.close();
     input.close();
   }
}