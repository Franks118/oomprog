import java.util.Scanner;

public class INsertionact3{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double[] numbers = new double[5];
        boolean exit = false;
 

        while (!exit) {
            System.out.println("Enter five decimal numbers:");
            for (int i = 0; i < 5; i++) {
                numbers[i] = k.nextDouble();
            }

            System.out.println("Choose a sorting option:");
            System.out.println("1.Bubblesort Ascending");
            System.out.println("2.Bubblesort Descending");
            System.out.println("3.Insertionsort Ascending");
            System.out.println("4.Insertionsort Descending");
            System.out.println("0.End");

            int u = k.nextInt();

            switch (u) {
                case 1:
                    bubbleSortAscending(numbers);
                    break;
                case 2:
                    bubbleSortDescending(numbers);
                    break;
                case 3:
                    insertionSortAscending(numbers);
                    break;
                case 4:
                    insertionSortDescending(numbers);
                    break;
                case 0:
                    System.out.println("Exit.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid.");
                    break;
            }

            if (u != 0) {
                System.out.println("the array is sorted:");
                for (double num : numbers) {
                    System.out.print(num +" ");
                }
                System.out.println();
            }
        }
        k.close();
    }

   
    public static void bubbleSortAscending(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
       
            for (int j = 0; j < n - i - 1; j++)
            {
           
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
         
         
            }
        }
    }

   
    public static void bubbleSortDescending(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
               
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
           
           
            }
        }
    }

   
    public static void insertionSortAscending(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public static void insertionSortDescending(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
       
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
