package com.lti.challenge;

import java.util.Arrays;

public class BinaryPeriod {

    public static void main(String[] args) {
        System.out.println("\nEx1: " + getBinaryPeriodForInt(102));
        System.out.println("\nEx2: " + getBinaryPeriodForInt(1651));
    }

    static int getBinaryPeriodForInt(int n) {
        int[] d = new int[30];
        int l = 0, res = -1;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        
        System.out.println(Arrays.toString(d));
        for (int p = 1; p < (1+l)/2; p++) {
            boolean ok = true;
            for (int i = 0; i < l - p; i++) {
                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                res = p;
            }
        }

        return res;
    }
}
