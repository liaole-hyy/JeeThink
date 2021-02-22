package com.jeethink.project.test;

public class TestA {

    public TestA(){

    }
    private  char a;
    private  char b='\u0000';
    public static void main(String[] args){
        Integer number =new Integer(10);
        String str =(String) number.toString() ;

//        int[][] array = new int[6][];
//        int[][][] array1 = new int[7][5][4];
//        int[] i ={ '1','2',3};
//        String[] s ={"aaa","bbb","ccc"};
        /*for(int i=0; i<2 ; ){
            System.out.println(++i);
        }*/
//         int d;
//        short a ,b,c;
//        a= 1;
//        b= 2;
//        d= a + b;

/*        TestA a = new TestA();
        a.test();*/
//        System.out.println("aaaa"+a.a);
//        System.out.println("bbbb"+a.b);
    }

    public void method(int a,float b){
    }

    public String method(float b,int a){
        return "aaa";
    }

    public void test(){
        int a ;
        int b;
        int c;
        int d;
        a=7 >> 3;
        b=-7 >> 3;
        c=7/8 ;
        d = -7/(2*2*2);
        System.out.println(b);
        System.out.println(d);
    }
}
