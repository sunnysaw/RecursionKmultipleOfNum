/*
Question : Given a number num and a value K.Print K multiple of num.
 */
import java.util.Scanner;
public class Main {
    static void multipleOfNumber(int number, int multiple){
       // base condition
        if (multiple == 0){
            return;
        }
        //recursive work
        multipleOfNumber(number,multiple-1);
        // self work
        System.out.print(number * multiple + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,multiples,initialization,increment = 1,storage = 0;
        System.out.println("Enter the first number :");
        number = sc.nextInt();
        System.out.println("Enter the value of k digit :");
        multiples = sc.nextInt();
        System.out.println("Printing the multiples of number without recursion");
        for (initialization = 1; initialization <= multiples; initialization++){
            storage = number * increment;
            increment++;
            System.out.print(storage + " ");
        }
        System.out.println();
        System.out.println("Now,printing the result by using recursion :");
        multipleOfNumber(number,multiples);
    }
}