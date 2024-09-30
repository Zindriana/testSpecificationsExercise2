import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Skriv en dag \n");
        String dayName = in.nextLine().toLowerCase(Locale.ROOT);
        System.out.println(Days.isWeekday(dayName));

    }

}