import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        String[] animal = {"Cat", "Dog", "Bird", "Horse", "Bear", "Monkey", "Cat", "Fish", "Bird", "Bear"};

        Arrays.sort(animal);

        String[] copy = new String[animal.length - 1];
        int i = 0;
        int j = 0;

        while (i != 9){
            if (animal[i].equals(animal[i+1])){
                System.out.println("Hi");
                i++;
                System.out.println(i);
                System.out.println(animal.length);

            }
            else {
                System.out.println("Hello");
                copy[j++] = animal[i];
                i++;
                System.out.println(i);
                System.out.println(animal.length);
            }
            
        }
        System.out.println(Arrays.toString(copy));
    }
}