import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement: There is one meeting room in a firm.
 * You are given two arrays, start and end each of size N.
 * For an index ‘i’, start[i] denotes the starting time of the ith meeting while end[i]  will denote the ending time of the ith meeting.
 * Find the maximum number of meetings that can be accommodated if only one meeting can happen in the room at a  particular time.
 * Print the order in which these meetings will be performed.
 * <p>
 * Example:
 * <p>
 * Input:  N = 6,  start[] = {1,3,0,5,8,5}, end[] =  {2,4,5,7,9,9}
 * <p>
 * Output: 1 2 4 5
 */

public class NMeetingsInOneRoom {
    public static void main(String args[]) {
        Solution.run();
    }

    class Solution {
        public static void run() {
            int n = 6;
            List<Integer> start = List.of(1, 3, 0, 5, 8, 5);
            List<Integer> end = List.of(2, 4, 5, 7, 9, 9);
            List<Integer> meetings = new ArrayList<>();
            meetings.add(1);
            int limit = end.getFirst();

            for (int i = 1; i < n; i++) {
                if (start.get(i) > limit) {
                    meetings.add(i + 1);
                    limit = end.get(i);
                }
            }
            System.out.println("Printing Result");
            meetings.forEach(ele -> System.out.print(ele + " "));
        }
    }
}
