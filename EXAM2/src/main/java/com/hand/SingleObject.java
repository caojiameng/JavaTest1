package com.hand;

public class SingleObject {
    //创建一个对象
   private static SingleObject instance = new SingleObject();
   private SingleObject(){}
   public static SingleObject getInstance(){
       return instance;
   }

    public void showMessage(int money){
        if (money<=1500){
            System.out.println(money*0.03);
        }else if(money<=4500){
            System.out.println(1500*0.03+(money-1500)*0.1);
        }else if(money<=9000){
            System.out.println(1500*0.03+3000*0.1+(money-4500)*0.2);
        }else if(money<=35000){
            System.out.println(1500*0.03+3000*0.1+4500*0.2+(money-9000)*0.25);
        }else if(money<=55000){
            System.out.println(1500*0.03+3000*0.1+4500*0.2+26000*0.25+(money-35000)*0.3);
        }else if(money<=80000){
            System.out.println(1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+(money-55000)*0.35);
        }else {
            System.out.println(1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35+(money-80000)*0.45);
        }

    }
}
