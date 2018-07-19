package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List2 implements ListIn{
    List<Integer> list =new ArrayList<Integer>();
    Map<Integer,Integer> map=new HashMap<Integer, Integer>();
    @Override
    public List<Integer> getL() {
        return null;
    }

    @Override
    public Map<Integer, Integer> getM() {

        int i=0;
        int j=0;
        for (i=0;i<50;i++){
            j=(int)(Math.random()*100);
            list.add(j);
        }
        for (int m=0;m<50;m++){
            if(list.get(m)/10==0){
                map.put(0,list.get(m));
            }else if(list.get(m)/10==1){
                map.put(1,list.get(m));
            }else if(list.get(m)/10==2){
                map.put(2,list.get(m));
            }else if(list.get(m)/10==3){
                map.put(3,list.get(m));
            }else if(list.get(m)/10==4){
                map.put(4,list.get(m));
            }else if(list.get(m)/10==5){
                map.put(5,list.get(m));
            }else if(list.get(m)/10==6){
                map.put(6,list.get(m));
            }else if(list.get(m)/10==7){
                map.put(7,list.get(m));
            }else if(list.get(m)/10==8){
                map.put(8,list.get(m));
            }else if(list.get(m)/10==9){
                map.put(9,list.get(m));
            }
        }
        return map;
    }



    @Override
    public void sort() {

    }
}
