public class bitManipulation {

    // convert decimal to binary
    private static String convertToBinary(int n){
        String res = "";
        if(n == 0) return "0";
        while (n >= 1) {
            if (n % 2 == 1) {
                res += "1";
            }
            else{
                res += "0";
            }
            n = n / 2;
        }
        res = reverse(res);
        return res;
    }

    // convert binary to decimal
    private static int convertToDecimal(String binary){
        int len = binary.length() - 1;
        int num = 0;
        int p2 = 1;
        for(int i = len; i >= 0; i--){
            if (binary.charAt(i) == '1') {
                num = num + p2;
            }
            p2 = p2 * 2;
        }
        return num;
    }

    // reverse any string
    private static String reverse(String res){
        StringBuilder sb = new StringBuilder();
        int len = res.length() - 1;
        for(int i = len; i >= 0; i--){
            sb.append(res.charAt(i));
        }
        return sb.toString();
    }
    
    // swap two numbers without a third variable
    private static void swapNumbers(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // check if ith bit is set or not
    private static boolean checkIth(int n, int i){
        return(n & (1 << i)) != 0;
    }
    
    public static void main(String[] args) {

        // convert decimal to binary
        String result = convertToBinary(13);
        System.out.println("13 in binary is: " + result);

        // // convert binary to decimal
        // int decimal = convertToDecimal("1101");
        // System.out.println("1101 in decimal is: " + decimal);

        // // swap two numbers
        // swapNumbers(5, 6);

        // check ith bit 
        System.out.println("Bit at 1 set in 13? " + checkIth(13, 1));
    }
}
