package src;

import java.util.Set;
import java.util.HashSet;
public class TwoStrings {
    public  String twoStrings(String s1, String s2) {
        //optimized way..
        Set<Character> list=new HashSet<>();
        for(int index=0;index<s1.length();index++){
            list.add(s1.charAt(index));
        }
        for(int index=0;index<s2.length();index++){
            if(list.contains(s2.charAt(index))){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String str1="hello";
        String str2="world";
        TwoStrings obj=new TwoStrings();
        System.out.println(obj.twoStrings(str1,str2));
    }
}
