import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Row? ");
        int row = scan.nextInt();
        System.out.print("Column? ");
        int col = scan.nextInt();

        System.out.println(tri(row, col));
    }

    public static int tri(int row, int col){
        if(col == 0 || row == col){
            return 1;
        } else {
            return tri(row - 1, col - 1) + tri(row - 1, col);
        }
    }
}