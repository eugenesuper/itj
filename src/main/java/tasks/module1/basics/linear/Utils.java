package tasks.module1.basics.linear;

public class Utils {

    //Task 1
    public static int task1(int a, int b, int c) {
        return ((a-3) * b / 2) - c;
    }

    //Task 2
    public static double task2(double a, double b, double c) {
        return (b + Math.pow((Math.pow(b, 2) + 4 * a * c), 0.5)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    //Task 3
    public static double task3(double x, float y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
    }

    //Task 4
    public static double task4(double r) {
        int whole = (int) r;
        double fr = r * 1000 - whole * 1000;
        double res = fr + (double) whole/1000;
        return  res;
    }

    //Task 5
    public static void task5(int t) {
        int hours = (int) t / 3600;
        int min = (int) ((t - (double) hours *3600) / 60);
        int sec = (int) (t - (double) (hours *3600 + min * 60));
        System.out.println(hours + "ч " + min + "мин " + sec + "c." );
    }

    //Task 6
    public static boolean task6(int x, int y) {
        return ((x < 2) && (x > -2) && (y < 4) && (y >= 0)) || ((x < 4) && (x > -4) && (y > -3) && (y < 0));
    }
}
