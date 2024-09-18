package dad.java.edgeoftheocean;

import java.util.Scanner;

public class commonCharacterCount {

    public static int solution(String s1, String s2) {
        int contador=0;
        for(int i =0; i < s1.length(); i++){
            for(int j =0; j < s2.length(); j++){
                if (s1.charAt(i) == s2.charAt(j)){
                    contador++;
                }
            }
        }
        return contador;
    }

}
