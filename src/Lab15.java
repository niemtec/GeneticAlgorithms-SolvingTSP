import java.util.ArrayList;
import java.util.List;

/**
 * The Travelling Salesperson Problem
 * Laboratory 15 Worksheet
 * CS2004 Algorithms and their Applications
 * Brunel University London
 * Created by Jakub Adrian Niemiec (@niemtec) on 2017-03-25.
 * Student ID: 1500408
 */

/**
 * SA, RRHC, SHC, RMHC
 */

public class Lab15 {
    //Determine the length of the array first by loading it temporarily and measuring it
    static double[][] matrixDimensionCountArray = TSP.ReadArrayFile("data/TSP_48.txt", " ");
    static int matrixSize = matrixDimensionCountArray.length;
    //Create the array object
    public static double[][] distanceArray = new double[matrixSize][matrixSize];

    public static void main(String args[]) {
        //Load the array to memory
        distanceArray = TSP.ReadArrayFile("data/TSP_48.txt", " ");

        //Representation vector
        int[] representation = new int[matrixSize];

        //TODO TESTING AREA >>>
        List<Integer> a = new ArrayList<>();
        a = Utilities.PopulateCities(3);
        System.out.println(a);
        a = Utilities.PermuteTour(a);
//		System.out.println(a);
//		a = Permutation.RandPerm(3);
//		System.out.print(a);
    }


}
