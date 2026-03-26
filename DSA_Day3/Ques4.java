package DSA_Day3;
public class Ques4 {
    public static void main(String[] args) {
        String s = "aabcccccaaa";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        String res = sb.toString();
        System.out.println(res.length() < s.length() ? res : s);
    }
}
