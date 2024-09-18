package dad.java.thejourneybegins;

public class checkPalindrome {
    public static boolean solution(String inputString) {
        for(int i =0; i < inputString.length(); i++){
            if(inputString.charAt(i) != inputString.charAt(inputString.length() -1 -i)){
                return false;
            }
        }
        return true;
    }
}
