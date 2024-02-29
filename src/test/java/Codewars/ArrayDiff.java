package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {

    //Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
    public static void main(String[] args) {
        int[] ans = arrayDiff(new int[]{1, 2, 2, 2, 3,3}, new int[]{2});
        for (int a : ans) {
            System.out.println(a);
        }
    }

    public static boolean isPresent(int[] array,int num){
        return Arrays.stream(array).anyMatch(i->i==num);
    }

    public static int[] arrayDiff(int[] a, int[] b){
        List<Integer> arrayList=new ArrayList<>();
        for(int i:a){
            if(!isPresent(b,i)){
                arrayList.add(i);
            }
        }
        return arrayList.stream().mapToInt(i->i).toArray();
    }
}
