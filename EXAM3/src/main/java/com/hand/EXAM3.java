package com.hand;

import java.util.List;

public class EXAM3 {
    public static void main(String[] args){
        ListFactory listFactory = new ListFactory();
        //获取list1对象，并调用他的sort方法
        ListIn list1 = listFactory.getList("List1");
        //调用list1的sort方法
        System.out.println(list1.getM());

        list1.sort();

        //获取list1对象，并调用他的sort方法
        ListIn list2 = listFactory.getList("List2");
        //调用list2的sort方法
        list2.sort();
    }
}
