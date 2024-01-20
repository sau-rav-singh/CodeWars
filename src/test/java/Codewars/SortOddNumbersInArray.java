package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortOddNumbersInArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortOddNumbers(new int[]{11,1,3,4,6,8,9})));
    }

    public static int[] sortOddNumbers(int[] array){
        List<Integer> oddList= new ArrayList<>();
        for(Integer c:array){
            if(c%2==1){
                oddList.add(c);
            }
        }
        Collections.sort(oddList);
        int[] result=new int[array.length];
        for(int i=0,count=0;i<array.length;i++){
            result[i]=array[i]%2!=0?oddList.get(count++):array[i];
        }
        return result;
    }
}
