//Writen by Franco Capangpangan
//code 4 temperature 

import java.util.Scanner;
public class twodimentional_act4 {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       

        int[][] data = new int[12][2];
        getData(data);
        averageHigh(data);
        averageLow(data);
        indexHighTemp(data);
        indexLowTemp(data);

      
    }

    //  read and store temperature data
    public static void getData(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter high temperature for month " + (i + 1) + ": ");
            data[i][0] = scanner.nextInt();
            System.out.print("Enter low temperature for month " + (i + 1) + ": ");
            data[i][1] = scanner.nextInt();
        }
    }

    // calculate and return the average high temperature
    public static void averageHigh(int[][] data) {
             int sum = 0;
        double ave;
        for(int row = 0; row < data.length; row++){
            sum += data[row][1];
        }
        ave = (double)sum / 12;
        System.out.printf("The average of the high temperature of the year is: %.2f\n", ave);
    }

    //  calculate and return the average low temperature
    public static void averageLow(int[][] data) {
             int sum = 0;
        double ave;
        for(int row = 0; row < data.length; row++){
            sum += data[row][0];
        }
        ave = (double)sum / 12;
        System.out.printf("The average of the low temperature of the year is: %.2f\n" , ave);
    }

    //  find and return the index of the highest temperature
    public static void indexHighTemp(int[][] data) {
             int max = Integer.MIN_VALUE;
        for(int row = 0; row < data.length; row++){
            if(data[row][1] > max){
                max = data[row][1];
                continue;
            }
        }
        System.out.print("The index of the highest temperature is in row ");
        for(int row = 0; row < data.length; row++){
            if(max == data[row][1]){
                System.out.print(row + " , ");
            }
        }
        System.out.println("column 1");
    }
   

       public static void indexLowTemp(int[][] data) {
             int index = 0;
        int min = Integer.MAX_VALUE;
        for(int row = 0; row < data.length; row++){
            if(data[row][0] < min){
                min = data[row][0];
                continue;
            }
        }
        System.out.print("The index of the lowest temperature is in row ");
        for(int row = 0; row < data.length; row++){
            if(min == data[row][0]){
                System.out.print(row + " , ");
            }
        }
        System.out.println("column 0");
    }
}
