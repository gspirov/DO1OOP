package arrayStarter;

public class ArrayStarter {
    private static final String[] months = {
        "January",
        "February",
        "March",
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December"
    };

	public static void main(String[] args) {
		// a new array is populated with twelve integers showing monthly rainfall in mm in Birmingham
		// the first figure is for January, the second is for February, and so on
		int[] numbers = { 72, 55, 51, 57, 61, 68, 66, 68, 68, 81, 79, 84 };

        System.out.print("1) Reversed order: ");
        outputReversed(numbers);
        System.out.println();

        System.out.print("2) Values greater than 65: ");
        outputIntegersGreaterThanNumber(numbers, 65);
        System.out.println();

        System.out.println("3) Month names: ");
        outputMonthsWithRainfall(numbers);

        System.out.printf(
            "4) %s.",
            formatDoubleOutput(calculateSumRainfall(numbers), "Total rainfall: %.2f", "Total rainfall: %d")
        );

        System.out.println();
        System.out.printf(
            "5) %s during %s.",
            formatDoubleOutput(getHighestRainfallValue(numbers), "Highest rainfall (%.2f)", "Highest rainfall (%d)"),
            getHighestRainfallMonth(numbers)
        );

        double average = getAverageRainfall(numbers);

        System.out.println();
        System.out.printf(
            "6) %s.",
            formatDoubleOutput(average, "Average rainfall %.2f", "Average rainfall %d")
        );

        int numberOfMonthsAboveAverage = 0;
        String monthNamesAboveAverage = "";

        for (int i = 0; i < numbers.length; i++) {
            if ((double) numbers[i] > average) {
                numberOfMonthsAboveAverage++;
                monthNamesAboveAverage += months[i] + " ";
            }
        }

        System.out.println();
        System.out.printf("7) Number of months above average: %s.", numberOfMonthsAboveAverage);

        System.out.println();
        System.out.printf("8) Month names above average: %s", monthNamesAboveAverage);
	}

    public static String formatDoubleOutput(double doubleValue, String doubleFormat, String intFormat) {
        if (doubleValue == Math.floor(doubleValue)) {
            return String.format(intFormat, (int) doubleValue);
        }

        return String.format(doubleFormat, doubleValue);
    }

    public static void outputReversed(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void outputIntegersGreaterThanNumber(int[] array, int greaterThan) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > greaterThan) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void outputMonthsWithRainfall(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i <= months.length - 1) {
                System.out.printf("%s: %d\n", months[i], array[i]);
            }
        }
    }

    public static double calculateSumRainfall(int[] array) {
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int getHighestRainfallIndex(int[] array) {
        double highestRainfall = 0.0;
        int highestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > highestRainfall) {
                highestRainfall = array[i];
                highestIndex = i;
            }
        }

        return highestIndex;
    }

    public static double getHighestRainfallValue(int[] array) {
        int index = ArrayStarter.getHighestRainfallIndex(array);

        if (intArrayContainsKey(array, index)) {
            return array[index];
        }

        return 0.0;
    }

    public static String getHighestRainfallMonth(int[] array) {
        int index = ArrayStarter.getHighestRainfallIndex(array);

        if (intArrayContainsKey(array, index)) {
            return months[index];
        }

        return "";
    }

    public static boolean intArrayContainsKey(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (i == key) {
                return true;
            }
        }

        return false;
    }

    public static double getAverageRainfall(int[] array) {
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return (double) total / array.length;
    }
}
