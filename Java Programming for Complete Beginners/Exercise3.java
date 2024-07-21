
public class Exercise3 {

    public static int convertHoursToMinutes(int hours) {
        return hours < 0 ? -1 : hours * 60;
    }

    public static int convertDaysToMinutes(int days) {
        return days < 0 ? -1 : days * 24 * 60;
    }

    public static void main(String[] args) {
        int hoursToMin = Exercise3.convertHoursToMinutes(24);
        int daysToMinutes = Exercise3.convertDaysToMinutes(24);
        System.out.println("10 hrs into min is equla to " + hoursToMin + " mins");
        System.out.println("10 days into min is equal to " + daysToMinutes + " mins");
    }
}
