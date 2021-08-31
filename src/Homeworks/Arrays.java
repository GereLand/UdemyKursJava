package Homeworks;

public class Arrays {
    public static void main(String[] args) {
        int[] numberForHM = new int[901];
        for (int i = 0, j = 100; i < numberForHM.length; i++){
            numberForHM[i] = j++;
        }

        int[] numberFinal = new int[numberForHM.length];
        for (int i = 0, j = 900; i < numberFinal.length; i++, j--){
            numberFinal[i] = numberForHM[j];
        }

        for (int i: numberFinal) {
            System.out.println(i);
        }
    }
}
