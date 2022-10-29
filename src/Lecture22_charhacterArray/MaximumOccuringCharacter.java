package Lecture22_charhacterArray;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String str = "Hiihowaretyou";
        System.out.println(findMajor(str));
        System.out.println("And count is " + countOfMaj(str));
    }


    static int countOfMaj(String str){
        int cnt  = 0;
        char ch = findMajor(str);
        for (int i = 0; i < str.length(); i++) {
            if (ch==str.charAt(i))
                cnt++;
        }
        return cnt;
    }
    static char findMajor(String str) {
        int count = 1;
        int majElement = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(majElement)) count++;
            else count--;

            if (count == 0) {
                majElement = i;
                count = 1;
            }
        }
//        int cnt = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == str.charAt(majElement))
//                cnt++;
//        }
        return str.charAt(majElement);
    }

}
