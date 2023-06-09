package day15_whileLoop;

import java.awt.*;
import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    int max = -2147483648; //25

    for(int i = 0; i < 5; i++ ){   // i: 0, 1, 2, 3, 4
        System.out.println("Enter a number: ");
        int num = input.nextInt();  //

        if(num > max){  // if the user entered entry is greater than the current maximum number then we have
            max = num; // then user entered number should be maximum number
        }              // num is assigned to num
    }

        System.out.println("max = " + max);

    input.close();
}

}

/* Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */