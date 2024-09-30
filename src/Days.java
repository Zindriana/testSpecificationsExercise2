public class Days {

    private static final String[] DAYS =  {
            "monday", "tuesday", "wednesday", "thursday", "friday"
    };

    public static boolean isWeekday(String dayName) {
        for (String day : DAYS) {
            if (day.equals(dayName)) {
                return true;
            }
        } return false;
    }

}