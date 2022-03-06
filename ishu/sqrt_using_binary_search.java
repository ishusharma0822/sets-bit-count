package com.ishu;

public class sqrt_using_binary_search {

    static int sqrt_binary(long n){
        if(n ==1 || n==0){
            return (int ) n;
        }
        long s =0;
        long e = n-1;
        long ans =0;
        long mid = s+ (e-s)/2;
        while(s<=e){
            if(mid == n/mid){
                return (int) mid;
            }
            else if(mid < n/mid){
                ans = mid ;
                s = mid +1;
            }
            else {
                e= mid -1;
            }
            mid = s+ (e-s)/2;
        }
        return (int) ans ;
    }

    static  double more_precision(int n, int it , double ans){
        double temp = ans ;
        double factor=1;
        for(int i =0; i< it ; i++){
            factor= factor/10;
            for(double j=ans; j*j < n ; j=j+factor){
                ans =  j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n= 7;
        int ans=sqrt_binary(n);
        System.out.println(ans);
        double sq = more_precision(n,3,ans);
        System.out.printf("%.2f", sq);
    }
}
