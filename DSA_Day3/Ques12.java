package DSA_Day3;

import java.util.*;
import java.util.regex.*;

public class Ques12 {
    public static void main(String[] args) {
        String[] logs = {
            "[2023-10-27 14:32:01] [ERROR] User login failed for IP: 192.168.0.155 - Timeout",
            "[2023-10-27 14:35:10] [INFO] User logged in from IP: 192.168.0.100",
            "[2023-10-27 14:40:22] [ERROR] Payment failed for IP: 192.168.0.155",
            "[2023-10-27 14:50:00] [ERROR] Timeout for IP: 10.0.0.1"
        };

        Pattern pattern = Pattern.compile("\\[(.*?)\\]\\s\\[(.*?)\\].*IP:\\s(\\d+\\.\\d+\\.\\d+\\.\\d+)");
        int errorCount = 0;
        Set<String> uniqueIPs = new HashSet<>();
        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);
            if (matcher.find()) {
                //String dateTime = matcher.group(1);
                String level = matcher.group(2);
                String ip = matcher.group(3);
                if (level.equals("ERROR")) {
                    errorCount++;
                    uniqueIPs.add(ip);
                }
            }
        }
        System.out.println("Total ERROR logs: " + errorCount);
        System.out.println("Unique IPs causing ERROR:");

        for (String ip : uniqueIPs) {
            System.out.println(ip);
        }
    }
}
