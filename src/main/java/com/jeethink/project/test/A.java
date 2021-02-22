package com.jeethink.project.test;

import io.swagger.models.auth.In;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class A {

    public static void swap(int a,int b){
        int temp =a ;
        a =b;
        b=temp;
    }
    public static void swap(Integer a,Integer b) throws NoSuchFieldException, IllegalAccessException {
         Field field =Integer.class.getDeclaredField("value");
         field.setAccessible(true);
         int tmp =a.intValue();
         field.setInt(a,b.intValue());
         field.setInt(b,tmp);
//        Integer temp =a ;
//        a =b;
//        b=temp;
    }

    public static void swap(String str1 ,String str2)  {
       str1="456";
       str2="123";
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//         int  a= 1;
//         int b=2;
//         System.out.println("before:"+"a="+a+";"+"b="+b);
//         swap(a,b);
//        System.out.println("after:"+"a="+a+";"+"b="+b);
//        ConcurrentHashMap
        Integer  a= 1;
        Integer b=2;
        System.out.println("before:"+"a="+a+";"+"b="+b);
        swap(a,b);
        System.out.println("after:"+"a="+a+";"+"b="+b);

        String  str1= "123";
        String str2="345";
        System.out.println("before:"+"str1="+str1+";"+"str2="+str2);
        swap(str1,str2);
        System.out.println("after:"+"str1="+str1+";"+"str2="+str2);

        Integer i1= 1;
        Integer i2= 200;
        System.out.println("i1==i2"+(i1==i2));

        int temp=i1.intValue() ;
        System.out.println("temp="+temp);
        System.out.println("temp="+Integer.valueOf(temp));
    }
}
