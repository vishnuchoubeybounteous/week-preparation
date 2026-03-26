package DSA_Day3;

public class Ques1 {
    public static void main(String[] args) {
    String s1="listen";
    String s2="silent";
    if(s1.length()!=s2.length()){
        System.out.println(false);
        return;
    }
    int[] hash=new int[26];
    for(int i=0;i<s1.length();i++){
        hash[s1.charAt(i)-'a']++;
        hash[s2.charAt(i)-'a']--;
    }
    for(int i=0;i<26;i++){
        if(hash[i]!=0){
            System.out.println(false);
            return;
        }
    }
    System.out.println(true);
}
}
