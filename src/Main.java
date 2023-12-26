import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите MAC-адрес: ");
        String inputMac = scanner.nextLine();

        if (isMac(inputMac)) {
            System.out.println("Введенный MAC-адрес является правильным.");
        } else {
            System.out.println("Введенный MAC-адрес является не правильным.");
        }

        scanner.close();
    }

    public static boolean isMac(String mac) {

        String macPattern = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";


        Pattern pattern = Pattern.compile(macPattern);


        Matcher matcher = pattern.matcher(mac);


        return matcher.matches();
    }
}
