package dad.java.exploringthewaters;

public class AreSimilar {

    public static boolean solution(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    return true;
                }
            }
        }
            return false;
    }

}
