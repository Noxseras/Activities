package activity3n4;

public class Main {

    public static void main(String[] args) {
        // CREATE an empty array and call "store" method
        int[] array = Duplicates.store(new int[10]);

        // Create another array to store, the non duplicated elements(if there are any duplicates)
        int[] copy = new int[array.length];

        // CALL the sort method
        Duplicates.sort(array);

        //Check for duplicates
        Duplicates.duplicateElements(array, copy);

        // call the Calculation method
        Calculations.calculate(array);

        /*
                    //Display the arrays before and after sorting and removing the duplicates
        for (int i:array) System.out.print(i + " ");
        System.out.println();
        for (int i:copy) System.out.print(i + " ");

         */
    }

}

