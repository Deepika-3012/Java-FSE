
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the week.");
                break;
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Weekday.");
        }
    }
}
