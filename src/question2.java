public class question2 {

    public static void main(String[] args) {
        int[] time = {1, 2, 3};
        int totalTrips = 5;
        System.out.println(minimumTime(time, totalTrips));
    }

    public static long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long min = time[0];
        for (int t : time) {
            min = Math.min(min, t);
        }
        long right = totalTrips * min;

        while (left < right) {
            long mid = (right - left) / 2 + left;
            long total = 0;
            for (int t : time) {
                total += mid / t;
            }
            if (total < totalTrips)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
