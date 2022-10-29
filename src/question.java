public class question {
    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend", "at", "attend"};
        String prefix = "at";
        System.out.println(count(words, prefix));
    }


    static int count(String[] words, String prefix) {
        int cnt = 0;
        String name = "";
        for (int i = 0; i < words.length; i++) {
            name = words[i].substring(0, prefix.length());
            if (words[i].length() > prefix.length()) {
                if (name.equals(prefix))
                    cnt++;
            }
        }
        return cnt;
    }
}