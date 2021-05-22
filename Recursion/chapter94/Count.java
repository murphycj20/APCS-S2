public class Count{
    public static void main(String[] args) {
        System.out.println(Counter("XaaaYaaaZaaaYaaaY", 'X')); // 1
    }

    public static int Counter(String String, char Character){
        if (String.length() == 0){
            return 0;
        }
        if (String.charAt(0) == Character) {
            return 1 + Counter(String.substring(1), Character);
        }
        return Counter(String.substring(1), Character);
    }
}