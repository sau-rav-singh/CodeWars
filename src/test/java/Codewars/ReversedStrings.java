package Codewars;


public class ReversedStrings {

  //'world'  =>  'dlrow'

    public static String solution(String str) {

        char[] arr=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
