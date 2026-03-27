package DSA_Day4;
import java.util.*;
public class Ques11 {
    public static void generate(String str, int idx, StringBuilder temp, List<String> result) {
        if (idx == str.length()) {
            result.add(temp.toString());
            return;
        }
        temp.append(str.charAt(idx));
        generate(str, idx + 1, temp, result);
        temp.deleteCharAt(temp.length() - 1);
        generate(str, idx + 1, temp, result);
    }

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        generate("abc", 0, new StringBuilder(), result);
        System.out.println(result);
    }
}
