import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class StringLesson {
    public static void main(String[] args) {
        toGenerateModes("numeric",4);
    }
    public static void  toGenerateModes(String mode, int length){


        switch (mode){
            case "alpha":
                int[]random=new int[length];
                char[] str=new char [length];
                String str2="";
                for(int i=0;i<random.length;i++){
                    random[i]=(int)(Math.random()*26+'A');
                    str[i]=(char)random[i];
                    String.valueOf(str[i]);
                    str2+=str[i]+"";

                }
                System.out.println(str2);
                break;
            case "numeric":
                int[]random1=new int[length];
                String[] str1=new String [length];
                String str3="";
                for(int i=0;i<random1.length;i++){
                    random1[i]=(int)(Math.random()*10);
                    str1[i]=String.valueOf(random1[i]);
                    str3+=str1[i]+"";
                }
                System.out.println(str3);
                break;
            case "alphanumeric":
                int[]random3=new int[length/2];
                char[]random4=new char[length/2];
                String[] str4=new String [length/2];
                String str5="";
                for(int i=0;i<random3.length;i++){
                    random3[i]=(int)(Math.random()*10);
                    random4[i]=(char)(Math.random()*26+'A');
                    str4[i]=String.valueOf(random3[i])+String.valueOf(random4[i]);
                    str5+=str4[i]+"";
                }
                System.out.println(str5);
                break;

        }


    }
}
