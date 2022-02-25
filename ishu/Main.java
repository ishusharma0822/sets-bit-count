package com.ishu;

import jdk.jfr.Unsigned;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {

        int a =0;
        int  b=2;
        int count = 0;
        while (a != 0 || b!=0) {
            if ((a & 1) == 1) {
                count++;

            }
            if((b&1) ==1){
                count++;
            }
            b = b>>1;
            a = a >> 1;

        }
        System.out.println(count);
    }
}



