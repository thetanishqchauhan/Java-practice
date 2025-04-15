import java.util.Scanner;

public class basicMaths {
    public static void main(String[] args) {

        // count digits
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();

        int count = 0;
        
        while (N > 0) {
            int digit = N % 10;
            System.out.println(digit);
            N = N / 10;
            count++;
        }

        System.out.println("There are " + count + " digits");





        // // Reverse a number
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number N: ");
        // int N = sc.nextInt();

        // int rev = 0;
        // while (N > 0) {
        //     int digit = N % 10;
        //     rev = (rev * 10) + digit;
        //     N = N / 10;
        // }
        
        // System.out.println("Reversed number: " + rev);





        // // Palindrome of a number
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();
        // int N = num;
        // int rev = 0;
        
        // while (num > 0) {
        //     int digit = num % 10;
        //     rev = (rev * 10) + digit;
        //     num = num / 10;
        // }
        
        // System.out.println("Reversed number: " + rev);

        // if (N == rev) {
        //     System.out.println("This is a palindrome number");
        // } else{
        //     System.out.println("This is not a palindrome number");
        // }





        // // Armstrong number
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int N = sc.nextInt();
        // int sum = 0;
        // int num = N;

        // while (N > 0) {
        //     int digit = N % 10;
        //     sum = sum + (digit * digit * digit);
        //     N = N / 10;
        // }
        
        // if (num == sum) {
        //     System.out.println("This is an armstrong number");
        // }
        // else{
        //     System.out.println("This is not an armstrong number");
        // }

        



        // //Print all divisors
        // System.out.print("Enter any number: ");
        // int N = sc.nextInt();

        // for(int i = 1; i <= N; i++){
        //     if (N % i == 0) {
        //         System.out.print(i + " ");
        //     }
        // }




        // // check for prime
        // System.out.print("Enter any number: ");
        // int N = sc.nextInt();
        // int num = N;
        // int count = 0;

        // for(int i = 1; i*i <= N; i++){
        //     if (N % i == 0) {
        //         count++;
        //         if ((N/i) != i) {
        //             count++;
        //         }
        //     }
        // }

        // if (count == 2) {
        //     System.out.println(num + " is a prime number");
        // }
        // else{
        //     System.out.println(num + " is not a prime number");
        // }




        // // gcd or hcf
        // System.out.print("Enter first number: ");
        // int N1 = sc.nextInt();
        // System.out.print("Enter second number: ");
        // int N2 = sc.nextInt();

        // int gcd = 1;

        // for(int i = 1 ; i <= N1; i++){
        //     if (N1 % i == 0 && N2 % i == 0) {
        //         gcd = i;
        //     }
        // }
        // System.out.println("GCD = " + gcd);

        

        sc.close();
    }
}
