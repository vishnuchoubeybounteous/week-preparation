package DSA_Day4;

import java.util.regex.*;

public class Demo {
    public static void main(String[] args) {
    Pattern pattern=Pattern.compile("\\[([cd][cd])(ab)\\]");   
    Matcher matcher=pattern.matcher("[dcab]");
    System.out.println(matcher.matches());
    System.out.println(matcher.group(2));
    // while(matcher.find()){
    //     System.out.println(matcher.start()+"----"+matcher.end()+"------"+matcher.group());
    // }
}
    
}
