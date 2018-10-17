import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения сторон предполагаемого треугольника: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        Triangle triangle = new Triangle();
        boolean res = triangle.check(a,b,c);
        if(res==true) {
            System.out.println("Треугольник существует.");
        }
        else {
            System.out.println("Треугольник не может существовать.");
        }
    }
}