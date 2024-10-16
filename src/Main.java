import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin cho hình tam giác");
        System.out.print("Nhập độ dài cạnh 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh 3: ");
        double side3 = scanner.nextDouble();
        System.out.print("Chọn màu: ");
        String color =  scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle);
    }
}
