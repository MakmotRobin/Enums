public class MonthTest {
    public static void main(String[] args) {
        // Define the Month enumeration
        enum Month {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
        }

        // Iterate over all values of the enumeration
        for (Month month : Month.values()) {
            String monthName = month.name();
            if (monthName.endsWith("y")) {
                System.out.println(monthName + " ends with y");
            } else {
                System.out.println(monthName + " doesn't end with y");
            }
        }
    }
}