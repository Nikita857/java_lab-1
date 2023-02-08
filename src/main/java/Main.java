import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //        Задание 1
        getName();
        //        Задание 2
        getDifference();
        //        Задание 3
        getNumbers();
        getSum();
        //        Задание 4
        setRadius();
    }
//    Задача 1
    public static String getName(){
//        System.out.print("Никита Бугаков");
        String name = "Никита Бугаков";
        return name;
    }
//    Задача 2
    public static void getDifference(){
        int value1 = 100;
        int value2 = 200;
        System.out.println(value2-value1);

    }
//    Задача 3
    public static int getNumbers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scan.nextInt();
        System.out.println("Введите второе число");
        int num2 = scan.nextInt();
        System.out.println("Введите третье число");
        int num3 = scan.nextInt();
        int sum = num1+num2+num3;
        return sum;

    }
    public static void getSum(){
        int sum = getNumbers();
        System.out.println("Получили сумму: " + sum);
    }
//    Задача 4

    public static void setRadius(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите радиус");
        double r = scan.nextDouble();
        double pi = 3.14;
        getSquare(r,pi);
        getLength(r,pi);
    }

    public static double getSquare(double r, double pi){
        double S = pi * Math.pow(r,2);
        System.out.println("Площадь круга"+" "+S+" "+"сантиметров");

        return S;

    }

    public static double getLength(double r, double pi){
        double L = 2*(pi*r);
        System.out.println("Длина окружности"+" "+L+" "+"сантиметров");
        return L;
    }

}
