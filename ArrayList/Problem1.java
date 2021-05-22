    import java.util.Arrays;
    public class Problem1 {

    public static void main(String[] args) {
        String[] fruit = {"Apple", "Avocado", "Banana", "Blueberry", "Cantaloupe", "Cherry", "Dragonfruit", "Grape", "Honeydew"};
        String[] fruit1 = {"Apple", "Avocado", "Blackberries", "Breadfruit", "Cantaloupe", "Clementine", "Date", "Grapefruit", "Orange"};

        int fLen = fruit.length;
        int f1Len = fruit1.length;

        int mLen = fLen + f1Len;
        String[] master = new String[mLen];

        System.arraycopy(fruit, 0, master, 0, fLen);
        System.arraycopy(fruit1, 0, master, fLen, f1Len);
        
        Arrays.sort(master);

        String[] copy = new String[master.length - 1];
        int i = 0;
        int j = 0;

        while (i != 17){
            if (master[i].equals(master[i+1])){
                System.out.println("Hi");
                i++;
                System.out.println(i);
                System.out.println(master.length);

            }
            else {
                System.out.println("Hello");
                copy[j++] = master[i];
                i++;
                System.out.println(i);
                System.out.println(master.length);
            }
            
        }
        System.out.println(Arrays.toString(copy));
    }
}

