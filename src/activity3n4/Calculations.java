package activity3n4;

public class Calculations {

    // CALCULATE the sum, average, min and max
    public static void calculate(int[] arr) {

        int sum = 0;
        int average = 0;
        int min = arr[0];
        int max = arr[0];

        //Calculate the sum
        for (int j : arr) {
            sum += j;
        }

        //Calculate the average
        average = sum / arr.length;

        //Calculate the min and max of the array
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;

            }
        }

        //Print the results
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);
        System.out.println("The min of the array is: " + min);
        System.out.println("The max of the array is: " + max);
    }

}
// TODO: remove the print from all methods and pass the results to another method to print all the results together
