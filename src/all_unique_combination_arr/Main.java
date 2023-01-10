package all_unique_combination_arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void findCombinations(int ind,
                                 int[] arr,
                                 int targetValue,
                                 List <List<Integer>> ans,
                                 List<Integer> ds) {
        //exit from recursion if equalValue is 0
        if (targetValue == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            /*
            // arr[i] == arr[i - 1] - check if two numbers are the same
            if (i > ind && arr[i] == arr[i - 1]) {
                continue;
            }
            */
            //exit from recursion
            if (arr[i] > targetValue) {
                System.out.println("arr[i] : " + arr[i] + " , targetValue : " + targetValue);
                break;
            }

            ds.add(arr[i]);
            findCombinations(i + 1, arr, targetValue - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    /**
     * to sort array and find all unique combination
     * @param unsorterArray - unsorted array
     * @param equalValue - equal value
     * @return - result of array combination
     */
    public static List < List < Integer >> combinationSum(int[] unsorterArray, int equalValue) {
        //create empty array
        List <List < Integer >> allCombinationArray = new ArrayList <>();
        //to sort unsorterArray
        Arrays.sort(unsorterArray);
        findCombinations(0, unsorterArray, equalValue, allCombinationArray, new ArrayList <> ());
        return allCombinationArray;
    }

    public static void main(String args[]) {
        int[] unsorterArray ={4,1,3,2};
        int equalValue = 2;
        List < List < Integer >> comb = combinationSum(unsorterArray, equalValue);
        System.out.println(comb.toString().replace(",", " "));
    }
}
