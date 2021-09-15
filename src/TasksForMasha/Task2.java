package TasksForMasha;

public class Task2 {
    public static void main(String[] args) {
        int days = 1000;
        int speed = 300000;
        long seconds = days * 24 * 60 * 60;
        long distance = speed * seconds;
        System.out.println(distance);
    }
}

/*
Задача:
Дано количество дней 1000, скорость света равна 300 000 км/сек, какое расстроение пройдёт свет за это время?
 */