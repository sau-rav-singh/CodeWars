package Codewars;
import java.util.ArrayList;

public class ArrayDiff {

    public static void main(String[] args) {
        int[] ans = arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2});
        for (int a : ans) {
            System.out.println(a);
        }
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> resultList=new ArrayList<>();

        for(int i:a){
            boolean found=false;
            for(int j:b){
                if(i==j){
                    found=true;
                    break;
                }
            }
            if(!found){
                resultList.add(i);
            }
        }
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
