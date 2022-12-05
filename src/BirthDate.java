import java.util.Scanner;

public class BirthDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        String monthDate;

        System.out.println("What is your Birthday?");
        int year = SafeInput.getRangedInt(in, "Year",  1950,  2010);
        int month = SafeInput.getRangedInt(in, "Month",  1,  12);

        switch (month){
            case 1 -> {
                day = SafeInput.getRangedInt(in, "Day",  1,  31);
            }
            case 2 -> {
                day = SafeInput.getRangedInt(in, "Day",  1,  28);
            }
            case 3 -> {
                day = SafeInput.getRangedInt(in, "Day",  1,  31);
            }
            case 4 -> {
                day = SafeInput.getRangedInt(in, "Day",  1,  30);
            }
            case 5 -> {
                day = SafeInput.getRangedInt(in, "Day",  1,  31);
            }
            case 6 -> {
                day = SafeInput.getRangedInt(in, "Day",  1,  30);
            }
            case 7 -> {
                day = SafeInput.getRangedInt(in, "Day",  1,  31);
            }
            case 8 -> {
                day = SafeInput.getRangedInt(in, "Day",  1,  31);
            }
            case 9 -> {
                day = SafeInput.getRangedInt(in, "Day",  1,  30);
            }
            case 10 -> {
                day = SafeInput.getRangedInt(in, "Day", 1,  31);
            }
            case 11 -> {
                day = SafeInput.getRangedInt(in, "Day", 1,  30);
            }
            case 12 -> {
                day = SafeInput.getRangedInt(in, "Day",  1,  31);
            }
            default -> monthDate = "Enter a valid month";
        }

        int hours = SafeInput.getRangedInt(in, "Hour", 1,  24);
        int minutes = SafeInput.getRangedInt(in, "Minutes",  1,  59);

        System.out.println("Your Birthday is: " + month + "/" + day + "/" + year + "  " + hours + ":" + minutes);
    }
}