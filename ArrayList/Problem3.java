import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int[] num = {1,5,7,6,5};

        int[] copy = new int[num.length+1];

        int i = 0;

        while (i != 5){
            copy[i] = num[i];
            if (i == 4){
                copy[5] = 9;
                i++;
            }
            else{
                i++;
            }
            System.out.println("Hi");
        }
        Arrays.sort(copy);

        System.out.println(Arrays.toString(copy));
    }
}