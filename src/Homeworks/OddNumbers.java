package Homeworks;

public class OddNumbers {
    public static void main(String[] args) {
        int num = 100;
        while (num <= 1000) {
            if (num % 5 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}