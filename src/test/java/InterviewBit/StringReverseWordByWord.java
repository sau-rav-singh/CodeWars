package InterviewBit;

import org.testng.Assert;

public class StringReverseWordByWord {
    public static void main(String[] args) {
        Assert.assertEquals(solution("the sky is blue"),"blue is sky the");
    }

    public static String solution(String A) {
        A=A.trim();
        String[] splitStr=A.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=splitStr.length-1;i>=0;i--){
            sb.append(splitStr[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
