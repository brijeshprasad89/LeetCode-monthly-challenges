package com.leetcode.easy;

public class LicenseKey {

        public static void main(String x[]) {

            String s1 = licenseKeyFormatting("5F3Z-2e-9-w", 4); //5F3Z-2E9W
            String s2 = licenseKeyFormatting("2-5g-3-J", 2); //2-5G-3J, 25G3J
            System.out.println(s1);
            System.out.print(s2);
        }
        static String licenseKeyFormatting(String s, int k) {
            String finalString = "";
            int tempCount = 0;

            String withoutDashes = s.replaceAll("-", "").toUpperCase();
            for(int i = withoutDashes.length() -1 ; i>=0 ;i--) {
                if(tempCount == k) {
                    finalString = finalString + "-";
                    tempCount = 0;
                }
                if( tempCount <= k) {
                    finalString = finalString + withoutDashes.charAt(i);
                    tempCount ++;
                }
            }
            return new StringBuilder(finalString).reverse().toString();
        }

}
