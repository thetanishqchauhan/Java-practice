// import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {

        // 1
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        // 3
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


        // 4
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }


        // 5
        for(int i = 5; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 5 again
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
               System.out.print("*");
            }
            System.out.println();
        }


        // 6
        for(int i = 5; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        

        // 7
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for(int k = 0; k < i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }


        // 8
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i-1; j++){
                System.out.print(" ");
            }
            for(int k = 5; k >= i; k--){
                System.out.print("*");
            }
            for(int k = 4; k > i - 1; k--){
                System.out.print("*");
            }
            System.out.println();
        }


        // 10
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= 4; i++){
            for(int j = 4; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }


        // 11
        int start;
        for(int i = 1; i <= 5; i++){

            if(i % 2 == 0){
                start = 0;
            } else{
                start = 1;
            }
            
            for(int j = 1; j <= i; j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
        

        // 12
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();

        // int spaces = 2*(N - 1);

        // for(int i = 1; i <= N; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     for(int j = 1; j <= spaces; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = i; j >= 1; j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        //     spaces -= 2;
        // }
        // sc.close();


        // 13
        int count = 1;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }


        // 14
        for(int i = 0; i < 5; i++){
            for(char ch = 'A'; ch <= 'A'+i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }


        // 15
        for(int i = 4; i >= 0; i--){
            for(char ch = 'A'; ch <= 'A' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        

        // 16
        for(char ch = 'A'; ch <= 'A' + 4; ch++){
            for(char i = 'A'; i <= ch; i++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        

        // 17
        for(int i = 0; i <= 3; i++){
            for(int j = 2; j >= i; j--){
                System.out.print("_");
            }
            for(char ch = 'A'; ch <= 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        
    }
}
