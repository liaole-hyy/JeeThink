package com.jeethink.project.test;

import java.io.*;

public class TestReader {

    public static void main(String[] args) {
        //读取当前目录下，该类的源文件
        File f = new File("src/main/java/com/jeethink/project/test/TestReader.java");
        System.out.println(f.getAbsolutePath());
        //输出当前目录下的out.java ,系统会自动创建该文件
        File f1 =  new File("out.java");
        FileReader fr = null;
        FileWriter fw = null ;
        BufferedReader  br = null ;
        PrintWriter pw = null ;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            fw = new FileWriter(f1);
            pw = new PrintWriter(fw);

            String ss =  br.readLine();
            while( ss !=null && !ss.equals("exit")){
                pw.println(ss);
                ss =br.readLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                if(br != null){
                    br.close();
                }
                if(pw != null){
                    pw.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
