public class Match{
    public static void main(String[] args) {
        System.out.println(Matcher("MOON", "M??N"));
    }

    public static boolean Matcher(String firstString, String secondString){
        if (firstString.length() != secondString.length()){
            return false;
        }
        if (firstString.length() == secondString.length()){
            return true;
        }
        if (firstString.charAt(0) == '?' || secondString.charAt(0) == '?' || firstString.charAt(0) == secondString.charAt(0)){
            return Matcher(firstString.substring(1), secondString.substring(1));
        }
        return false;
    }
}