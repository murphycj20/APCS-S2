public class Square{
    Square(){
    }
    public int SquareCalc(int N){
        if (N == 1){
            return 1;
        }
        else{
            return (N-1) + (2*N) - 1;
        }
    }
}