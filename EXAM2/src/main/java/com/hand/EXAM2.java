package com.hand;

public class EXAM2 {
    public static void main(String[] args){
        SingleObject user =SingleObject.getInstance();
        System.out.println("USERA所需交税: ");
        user.showMessage(5000-3500);
        System.out.println("USERB所需交税: ");
        user.showMessage(10000-3500);
        System.out.println("USERC所需交税: ");
        user.showMessage(15000-3500);
        System.out.println("USERD所需交税: ");
        user.showMessage(60000-3500);
    }
}
