package DSA_Day3;

import java.util.regex.*;

public class Ques9 {
    public static void main(String[] args) {
        String html = "<a href=\"https://google.com\">Google</a> "
                    + "<a href=\"https://openai.com\">OpenAI</a>";
        Pattern pattern = Pattern.compile("<a[^>]*href=\"([^\"]*)\"");
        Matcher matcher = pattern.matcher(html);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
