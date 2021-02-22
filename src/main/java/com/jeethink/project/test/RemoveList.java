package com.jeethink.project.test;

import org.springframework.beans.factory.BeanFactory;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveList {

    public static void main(String[] args) {
//        final int a = 3;
//        System.out.println(a);
        Map<String,Object> map=new HashMap<String,Object>();
        ConcurrentHashMap map1 = new ConcurrentHashMap();
        List<String> listRemove = new ArrayList<>();
        listRemove.add("1");
        listRemove.add("2");
        listRemove.add("3");
        listRemove.add("4");
        listRemove.add("chengang");
        listRemove.remove("chengang");
//        String obj = "3";
//        for(int i =0 ;i< listRemove.size(); i++){
//            if( obj.equals(listRemove.get(i))){
//                listRemove.remove(obj);
//            }
//        }
//        for(Iterator it =listRemove.iterator() ; it.hasNext();){
//            String str = (String) it.next();
//            if(str.equals("chengang")){
//                listRemove.remove(str);
//            }
//        }
//        for(Iterator it =listRemove.iterator() ; it.hasNext();){
//            String str = (String) it.next();
//            if(str.equals("chengang")){
//                it.remove();
//            }
//        }
        System.out.println(listRemove.toString());
    }
}
