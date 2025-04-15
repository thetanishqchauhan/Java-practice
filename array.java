import java.util.Scanner;

public class array {

    // Second largest element in an array
    static void sLargestElement(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        sc.close();
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Array basics
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Input values to the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        
        System.out.println("Your array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }




        // // question
        // System.out.print("Enter the size of Array: ");
        // int size = sc.nextInt();

        // int arr[] = new int[size];

        // System.out.println("Input values to the array: ");
        // for(int i = 0; i < size; i++){
        //     arr[i] = sc.nextInt();
        // }

        // System.out.print("Enter the value to be searched: ");
        // int val = sc.nextInt();

        // for(int i = 0; i < size; i++){
        //     if (arr[i] == val) {
        //         System.out.print(val + " is at index " + i);
        //     }
        // }
        



        // 2D array
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns: ");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        System.out.println("Input " + rows*cols +  " values to the matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }




        // // question on 2d array
        // System.out.print("Enter the number of rows: ");
        // int rows = sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int cols = sc.nextInt();

        // int matrix[][] = new int[rows][cols];

        // System.out.println("Input " + rows*cols + " values to the matrix: ");
        // for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < cols; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        
        // System.out.print("Enter the value to be searched: ");
        // int x = sc.nextInt();

        // for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < cols; j++){
        //         if (matrix[i][j] == x) {
        //             System.out.print(x + " is at index (" + i + ", " + j + ")");
        //         }
        //     }
        // }




        // // Largest element in an array
        // int cnt = 0;
        // System.out.print("Enter the size of array: ");
        // int size = sc.nextInt();

        // int arr[] = new int[size];

        // System.out.println("Input " + size + " values into the array: ");
        // for(int i = 0; i < size; i++){
        //     arr[i] = sc.nextInt();
        // }

        // for(int i = 0; i < size; i++){
        //     if (arr[i] > cnt) {
        //         cnt = arr[i];
        //     }
        // }
        // System.out.print("The largest value in the array is " + cnt);
        
        
        
        sc.close();
        
    }
}
