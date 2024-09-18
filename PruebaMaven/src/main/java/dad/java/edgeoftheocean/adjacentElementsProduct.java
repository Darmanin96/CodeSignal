package dad.java.edgeoftheocean;

public class adjacentElementsProduct {
    public  static int  solution(int[] inputArray) {
        int maximo = inputArray[0] * inputArray[1];
        for (int i = 1; i < inputArray.length-1; i++) {
            int actual = inputArray[i] * inputArray[i+1];
            if (actual > maximo) {
                maximo = actual;
            }
        }
        return maximo;
    }
}
