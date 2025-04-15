public class recursion {

    static void printTillN(int n, int cnt){
        if(cnt == n) return;
        cnt++;
        System.out.print(cnt + " ");
        printTillN(n,cnt);
    }

    static int cnt = 0;
    static void printName(int n, String name){
        if(cnt == n) return;
        System.out.println(name);
        cnt++;
        printName(n, name);
    }

    static void sumTillN(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.print(sum);
    }

    static void factorial(int n){
        int fact = 1;
        while (n > 1) {
            fact = fact * n;
            n--;
        }
        System.out.print(fact);
    }

    static void reverseArray(int arr[], int start, int end){
        if(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }

    static void printArray(int arr[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void fibonacci(int fibArr[], int n, int i){
        if (i == n) return;
        fibArr[i] = fibArr[i-1] + fibArr[i-2];
        fibonacci(fibArr, n, i+1);
    }

    static void printFibonacci(int fibArr[], int n, int i){
        if(i==n) return;
        System.out.print(fibArr[i] + " ");
        printFibonacci(fibArr, n, i+1);
    }

    public static void main(String[] args) {
        // printTillN(10, 0);
        // printName(10, "Tanishq");
        // sumTillN(5);
        // factorial(5);

        // int arr[] = {1,2,3,4,5};
        // int n = arr.length;
        // reverseArray(arr, 0, n-1);
        // printArray(arr, n);

        int fibArr[] = new int[8];
        fibArr[0] = 0;
        fibArr[1] = 1;
        fibonacci(fibArr, 8, 2);
        printFibonacci(fibArr, 8, 0);
        
    }
    
}
