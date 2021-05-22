public class QuestionMarkMatch {
    public static void main(String[] args) {
        System.out.println(match("Apple", "Peas"));
        System.out.println(match("Apple", "Apple"));
        System.out.println(match("???", "???"));
        System.out.println(match("W?zar?", "?izard"));
        System.out.println(match("W?zar?", "?izada"));
    }
    public static boolean match(String s1, String s2){
        if(s1.length() == 1 && s2.length() == 1){
            return s1.equals(s2) || s1.equals("?") || s2.equals("?");
        } else if (s1.charAt(0) == s2.charAt(0) || s1.charAt(0) == '?' || s2.charAt(0) == '?'){
            return match(s1.substring(1), s2.substring(1));
        } else {
            return false;
        }
    }
}