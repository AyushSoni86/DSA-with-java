package Lecture22_charhacterArray;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
       char ch[] = {'a','a','b','b','c','c','c','a','a'};

        System.out.println(Arrays.toString(compress1(ch)));
    }

    static int compress(char[] chars) {

        int i = 0;
        int ansIndex = 0;
        int n = chars.length;

        while(i < n){
            int j = i + 1 ;

            while( j < n && chars[i] == chars[j] ) j++;

            chars[ansIndex++] = chars[i];

            int count = j - i;

            if(count > 1){
                String cnt = String.valueOf(count);
                for(int k = 0 ; k < cnt.length() ; k++)
                    chars[ansIndex++] = cnt.charAt(k);

            }
            i = j;
        }
        return ansIndex;
    }

    static char[] compress1(char[] ch) {
        char[] chars = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            chars[i] = ch[i];
        }
        int i = 0;
        int ansIndex = 0;
        int n = chars.length;

        while(i < n){
            int j = i + 1 ;

            while( j < n && chars[i] == chars[j] ) j++;

            chars[ansIndex++] = chars[i];

            int count = j - i;

            if(count > 1){
                String cnt = String.valueOf(count);
                for(int k = 0 ; k < cnt.length() ; k++)
                    chars[ansIndex++] = cnt.charAt(k);

            }
            i = j;
        }
        return chars;
    }
}
