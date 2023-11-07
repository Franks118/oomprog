import java.util.Scanner;

public class TemperatureAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a 2D array to store temperatures for each month
        double[][] temperatureData = new double[12][2];

        // Call the getData method to read and store temperature data
        getData(temperatureData, scanner);
      

        // Calculate and display average high and low temperatures
        double averageHigh = averageHigh(temperatureData);
      
        System.out.println("Average High Temperature: " + averageHigh);
          double averageLow = averageLow(temperatureData);
        System.out.println("Average Low Temperature: " + averageLow);

        // Find and display the highest and lowest temperatures
        int highestTempIndex = indexHighTemp(temperatureData);
        int lowestTempIndex = indexLowTemp(temperatureData);
        System.out.println("Highest Temperature of the Year: " + temperatureData[highestTempIndex][0]);
        System.out.println("Lowest Temperature of the Year: " + temperatureData[lowestTempIndex][1]);

        scanner.close();
    }

    // Method to read and store temperature data
    public static void getData(double[][] data, Scanner scanner) {
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter high temperature for month " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter low temperature for month " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
    }

    // Method to calculate and return the average high temperature
    public static double averageHigh(double[][] data) {
        double totalHigh = 0;
        for (int i = 0; i < data.length; i++) {
            totalHigh += data[i][0];
        }
        return totalHigh / data.length;
    }

    // Method to calculate and return the average low temperature
    public static double averageLow(double[][] data) {
        double totalLow = 0;
        for (int i = 0; i < data.length; i++) {
            totalLow += data[i][1];
        }
        return totalLow / data.length;
    }

    // Method to find and return the index of the highest temperature
    public static int indexHighTemp(double[][] data) {
        int highestIndex = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i][0] > data[highestIndex][0]) {
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    // Method to find and return the index of the lowest temperature
    public static int indexLowTemp(double[][] data) {
        int lowestIndex = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i][1] < data[lowestIndex][1]) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }
}
