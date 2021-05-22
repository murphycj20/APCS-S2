public class MaxElement{
    public static void main(String[] args) {
        System.out.println(Max(new int[] {2,6,7,10,0,-2,1}));//10
    }

    public static int Max(int[] array){
        return Max(array, array[0], 1);
    }
    
    public static int Max(int[] array, int currentMaximum, int index ) {
        if (index == array.length){
            return currentMaximum;
        }
        if (array[index] > currentMaximum){
            return Max(array, array[index], index+1);
        }
        return Max(array, currentMaximum, index+1);
    }
}