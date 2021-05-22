public class Log{
    Log(){
    }
    public int sum(int N){
        if (N == 1){
            return 0;
        }
        else{
            return 1 + sum(N/2);
        }
    }

}