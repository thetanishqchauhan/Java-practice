import java.util.Scanner;

public class basics {

    // public static void main(String[] args) {
    // int value = 7;
    // String name = "Dhoni";
    // String no = "07";
    // System.out.println(value);
    // System.out.println(name);
    // System.out.println(Integer.parseInt(no) + 10);
    // }



    // public static void main(String[] args) {
    // // boolean x = true;
    // // boolean y = false;

    // // if (x || y) {
    // // System.out.println("TRUE");
    // // }
    // // else {
    // // System.out.println("FALSE");
    // // }

    // int x = 100;

    // String result = (x == 10) ? "X is 10" : "X is not 10";
    // System.out.println(result);

    // }



    // // --------------------------- Increment/Decrement -------------------------
    // //
    // public static void main(String[] args) {

    // int a = 3;
    // a = a++;
    // System.out.println("Post-Increment a: " + a);

    // a = ++a;
    // System.out.println("Pre-Increment a: " + a);

    // a = a--;
    // System.out.println("Post-Decrement a: " + a);

    // a = --a;
    // System.out.println("Pre-Decrement a: " + a);
    // }



    // // ------------------------------ switch case --------------------------- //

    // public static void main(String[] args) {

    // int day;
    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Enter a number (1-7): ");
    // day = scanner.nextInt();

    // switch (day) {
    // case 1:
    // System.out.println("Sunday");
    // break;
    // case 2:
    // System.out.println("Monday");
    // break;
    // case 3:
    // System.out.println("Tuesday");
    // break;
    // case 4:
    // System.out.println("Wednesday");
    // break;
    // case 5:
    // System.out.println("Thursday");
    // break;
    // case 6:
    // System.out.println("Friday");
    // break;
    // case 7:
    // System.out.println("Saturday");
    // break;
    // default:
    // System.out.println("Enter a valid day (1-7)");
    // break;
    // }

    // scanner.close();
    // }



    // public static void main(String[] args) {
    //     int x = 2;
    //     int y = 3;

    //     switch (x) {
    //         case 1:
    //             System.out.println("x is 1");
    //             switch (y) {
    //                 case 1:
    //                     System.out.println("y is 1");
    //                     break;
    //                 default:
    //                     System.out.println("y is not 1");
    //                     break;
    //             }
    //             break;
    //         default:
    //             System.out.println("x is not 1");
    //             break;
    //     }

    // }



    // ---------------------------- For loop -------------------------- //

    // public static void main(String[] args) {
    //     for(int i = 0; i < 3; i++){
    //         for(int j = 0; j < 3; j++){
    //             System.out.println("i = " + i + ", j = " + j);
    //         }
    //     }
    // }
    


    // --------------------------- While loop ---------------------------- //
    public static void main(String[] args) {

        int n;
        int fact = 1;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        n = scanner.nextInt();

        while (n > 0) {
            fact = fact * n;
            n--;
        }

        System.out.println("Factorial of the number is " + fact);
        
        scanner.close();
    }
    
}