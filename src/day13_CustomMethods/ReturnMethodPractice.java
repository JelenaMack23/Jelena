package day13_CustomMethods;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        System.out.println(isOdd(100));

        // --------------------------------------------------------
        int num = 200;
        if (isEven(num)) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num);
        }

        //-----------------------------------------------------------------------------------
    }

    public static boolean isOdd(int num) {
        // return (num % 2 != 0)? true : false;

        if (num % 2 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isEven(int num) {
        return !isOdd(num);
    }

    public static int max(int n1, int n2) {
       // return n1 > n2? n1 : n2

        if(n1 > n2){
            return  n1;
        }else{
            return  n2;
        }
    }

}



/* Create a method named isOdd, that can return true if a number is an odd number
Create a method named isEven, that can return true if a number is an even number
Create a method named max, that can return true if a number between two numbers
Create a method named min, that can return true if a number is between two numbers
 */