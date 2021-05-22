import java.util.Arrays;

public class Problem0{
    public static void main(String[] args) {
        String[] fruit = {"Apple", "Avocado", "Banana", "Blueberry", "Cantaloupe", "Cherry", "Dragonfruit", "Grape", "Honeydew"};
        String[] veggie = {"Broccoli", "Brussels Sprouts", "Carrots", "Cauliflower", "Celery", "Cucumber", "Eggplant", "Garlic", "Leeks", "Lettuce"};

        int fLen = fruit.length;
        int vLen = veggie.length;

        int mLen = fLen + vLen;
        String[] master = new String[mLen];

        System.arraycopy(fruit, 0, master, 0, fLen);
        System.arraycopy(veggie, 0, master, fLen, vLen);

        Arrays.sort(master);

        System.out.println(Arrays.toString(master));
    }
}