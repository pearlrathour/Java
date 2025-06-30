import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException{
        //1
        //IO exception
        int num=  System.in.read();    // gives ASCII value for number entered
        System.out.println(num);
        System.out.println(num-48);
        // but for 55 gives 5 as reads only 1 value at a time


        //2
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader bf= new BufferedReader(in);
        // int num1= bf.readLine();  //gives string
        int num1= Integer.parseInt(bf.readLine());
        System.out.println(num1);

        // bf.close();  // no error but good practice to close a resouces


        //3
        Scanner sc= new Scanner(System.in);
        int num3= sc.nextInt();
        System.out.println(num3);
    }
}
