import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        seconds = seconds % 86400;
        String time = (seconds / 3600) + ":" +
                String.format("%02d", (seconds % 3600 / 60)) +
                ":" +
                String.format("%02d", (seconds % 60));
        System.out.println(time);
    }
}
