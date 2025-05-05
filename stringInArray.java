import java.util.Arrays;

public class stringInArray {
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        Arrays.sort(strs);

        for(int i = 0; i < strs.length; i++){
            System.out.println(strs[i]);
        }
    }
}
