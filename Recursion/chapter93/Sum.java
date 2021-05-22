package chapter93;
public class Sum{
    public static void main(String[] args) {
        int[] testArray = {2,5,1,-2,9};
        System.out.println(sum(testArray));
    }

    public static int sum(int[] arr){
        return sum(arr, 0);
    }

    public static int sum(int[] arr, int index){
        if(index == arr.length){
            return 0;
        }
        return arr[index] + sum(arr, index+1);
    }
}