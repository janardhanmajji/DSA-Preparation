package Strings.Easy;

import java.util.Scanner;

public class DefangingIp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ipAddress = sc.next();

        System.out.println(defangIpaddr(ipAddress));

        sc.close();
    }

    public static String defangIpaddr(String address) {
        String ans = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                ans += address.charAt(i);
            } else {
                ans += "[.]";
            }
        }

        return ans;
    }
}
