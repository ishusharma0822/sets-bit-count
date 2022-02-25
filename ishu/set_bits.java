package com.ishu;

public class set_bits {
    public static void main(String[] args) {

        int a =5;
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
