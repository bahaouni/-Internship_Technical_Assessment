package org.example;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        String test = "Madam, in Eden, I'm Adam";
        String test2 = "Complete the project report" ;
        boolean res = isPalindrom(test);
        boolean res1 = isPalindrom(test2);
        System.out.println(res);
        System.out.println(res1);
    }
    static boolean isPalindrom(String s ){
        Set<Character> Skip = new HashSet<>();
        Skip.add(',');
        Skip.add(' ');
        Skip.add('!');
        Skip.add('?');
        Skip.add('\'');
        String x = s.toLowerCase();
        StringBuilder ss= new StringBuilder(x);
        int index = 0 ;
        for(int i=0;i<x.length();i++){
            if(Skip.contains(x.charAt(i))  && index>=0){
                ss.delete(index,index+1) ;
            }
            else {
                index++;
            }
        }
        System.out.println(ss);
        String description = ss.toString();
        String reversedDescription =  ss.reverse().toString();


        return  description.equals(reversedDescription) ;

    }

}