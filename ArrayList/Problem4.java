import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] num = {1,4,7,6,5};

        Arrays.sort(num);

        int i = 0;
        int[] copy = new int[num.length];

        while (i != 5){
            if(i == 0){
                copy[i] = num[i+4];
                i++;
            }
            else{
                copy[i] = num[num.length-i];
                i++;
            }
        }
        System.out.println(Arrays.toString(copy));
    }
}