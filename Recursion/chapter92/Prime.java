public class Prime{
    public static void main(String[] args){
        System.out.println(prime(4));
        System.out.println(prime(7));
    }

    public static boolean prime(int N, int D){
        if (D==1){
            return true;
        }

        if (N % D == 0){
            return false;
        }
        return prime(N, D-1);
    }

    public static boolean prime(int N){
        return prime(N, N/2);
    }
}