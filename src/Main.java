import java.util.Scanner;
/*
дана строка в двоичном виде.
удалить все нулевые биты и вернуть соответствующее число
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в двоичном виде");
        String bin = scanner.nextLine();
        bin = bin.replace("0", "");
        int num = Integer.parseInt(bin, 2);
        System.out.println(num);
    }
}