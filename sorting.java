// import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        
        // // Bubble sort
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of array: ");
        // int size = sc.nextInt();

        // int arr[] = new int[size];

        // System.out.println();
        // System.out.println("Enter " + size + " elements to the array: ");
        // for(int i = 0; i < size; i++){
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println();
        // System.out.println("Your given array: ");
        // for(int i = 0; i < size; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // for(int i = 0; i < size - 1; i++){
        //     for(int j = 0; j < size - i - 1; j++){
        //         if (arr[j] > arr[j+1]) {
        //             // swap
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }

        // System.out.println();
        // System.out.println();

        // System.out.println("Sorted array: ");
        // for(int i = 0; i < size; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // sc.close();





        // selection sort
        int arr[] = {7,8,3,1,2};

        for(int i = 0; i < arr.length - 1; i++){
            int smallest = i;
            for(int j = i+1; j < arr.length; j++){
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // swapping
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        // printing
        System.out.println();
        System.out.print("Sorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        




        // insertion sort
        
    }
}
