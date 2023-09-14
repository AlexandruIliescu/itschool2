package session15.enums;

public class EnumsPractice {

    public static void main(String[] args) {
        printEnumValues();
        printDayMessage(Day.MONDAY);
    }

    private static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY -> System.out.println("Start of the week!");
            case TUESDAY -> System.out.println("Second day of the week!");
            default -> System.out.println("Invalid day.");
        }
    }

    private static void printEnumValues() {
        for (Day day : Day.values()) {
            System.out.println(day + " is a weekday? " + day.isWeekday());
        }
    }
}