package DSA_03_RECURSION_PROBLEMS;

public class dsa_02_josephus_problem {
    public static void main(String[] args) {

        System.out.println("Maut ka khel me swagat he \n\n");
        switch (josephus(5, 5)) {
            case 0:
                System.out.println("Saurabh Wins");
                break;
            case 1:
                System.out.println("Ayush Wins");
                break;
            case 2:
                System.out.println("Vaibhavi Wins");
                break;
            case 3:
                System.out.println("Rutuja Wins");
                break;
            case 4:
                System.out.println("Dhanashri Wins");
                break;
            case 5:
                System.out.println("Abhishek Wins");
                break;
            default:
                System.out.println("Ghar jaake sooja \n sab mar gaye ");

        }
    }

    static int josephus(int n, int k) {
        if (n == 1)
            return 0;
        return (josephus(n - 1, k) + k) % n;
    }
}
