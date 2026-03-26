package DSA_Day3;
import java.util.*;
public class Ques2 {
    public static void main(String[] args) {
        String s="abcabcbb";
        Map<Character,Integer> map=new HashMap<>();
        int len=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            len=Math.max(len,i-left+1);
        }
        System.out.println(len);

    }
}
