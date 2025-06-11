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
    
    public static void main(String[] args) {
        String result = convertToBinary(12);
        System.out.println("12 in binary is: " + result);
        int decimal = convertToDecimal("1101");
        System.out.println("1101 in decimal is: " + decimal);
    }
}
