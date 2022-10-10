/*Write a program to enter any 15 numbers from the user and store only even numbers in a file named “Even.txt”. And display the contents of this file on the console. (BufferedReader / BufferedWriter). 
*/

import java.io.*;
import java.util.*;

public class prac5_5 {
    public static void main(String[] args) throws IOException {
        // creating objects
        FileWriter writer = new FileWriter("C:\\Users\\91989\\Desktop\\java\\part 5\\Even.txt");
        BufferedWriter buffer = new BufferedWriter(writer);

        // getting 15 numbers from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 15 whole numbers: ");

        int[] num = new int[15];
        for (int i = 0; i < 15; i++) {
            num[i] = in.nextInt();
        }
        // printing even numbers in the file
        for (int i = 0; i < 15; i++) {
            if (num[i] % 2 == 0) {
                buffer.write(num[i]);
            }
        }

        buffer.close();
        System.out.println("Content in the file is: ");

        // creating objects
        FileReader reader = new FileReader("C:\\Users\\91989\\Desktop\\java\\part 5\\Even.txt");
        BufferedReader read = new BufferedReader(reader);
        int i;
        // printing the content in the output
        while ((i = read.read()) != -1) {
            System.out.println(i);
        }
    }
}