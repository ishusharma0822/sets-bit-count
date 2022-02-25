package com.ishu;

import java.util.ArrayList;
import java.util.Arrays;

public class longest_increasing_subsequence {
    public static  void main(String[] args){
        int i=1;
        ArrayList<Integer> LIS = new ArrayList<>(Arrays.asList(11,24,6,46,21,49,48,72,7,8,5,6,90));
        int temp = LIS.get(0);
       while(i<LIS.size()){
            if(LIS.get(i)<temp){
                LIS.remove(i);
            }
            else{
                temp = LIS.get(i);
                i++;
            }
        }
        System.out.println(LIS);
    }
}
