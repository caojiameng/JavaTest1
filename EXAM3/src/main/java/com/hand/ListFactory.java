package com.hand;
//创建工厂,生成基于给定信息的实体类的对象
public class ListFactory {
    //使用getList获取类型的对象
   public ListIn getList(String listType){
       if(listType ==null){
           return null;
       }
       if (listType.equalsIgnoreCase("LIST1")){
           return new List1();
       }
       if (listType.equalsIgnoreCase("LIST2")){
           return new List2();
       }
       return null;
   }
}
