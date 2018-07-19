package com.hand;

public class Exam1 {

    public static void main(String[] args){
        int num=0;
        int a[]=new int[100];
        for(int i=101;i<=200;i++){
            if (result(i)==1){
                a[num]=i;
                num++;
            }
        }
        System.out.println("101-200之间总共有"+num+"个素数，分别是：");
        for (int j=0;j<num;j++){
            System.out.print(a[j]+",");
        }
    }

    public static int  result(int n){
        int i;
        for(i=2;i<n;i++){
            if (n%i==0){
                return 0;
            }
        }
        return 1;
    }
}
