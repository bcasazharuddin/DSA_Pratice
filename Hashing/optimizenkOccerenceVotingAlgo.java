import java.util.*;
public class optimizenkOccerenceVotingAlgo {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {

        HashMap<Integer, Integer> m = new HashMap<>();
        int n = arr.length;

        // Step 1: Find candidate elements
        for (int i = 0; i < n; i++) {

            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            }
            else if (m.size() < k - 1) {
                m.put(arr[i], 1);
            }
            else {
                ArrayList<Integer> removeKeys = new ArrayList<>();
                for (Map.Entry<Integer, Integer> x : m.entrySet()) {
            
                    int c = x.getValue() - 1;
                    x.setValue(c);
            
                    if (c == 0) {
                        removeKeys.add(x.getKey());
                    }
                }
            
                for (int key : removeKeys) {
                    m.remove(key);
                }
            }
        }

        // Step 2: Verify actual frequencies
        int ans = 0;

        for (Map.Entry<Integer, Integer> x : m.entrySet()) {
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (x.getKey() == arr[i]) {
                    count++;
                }
            }

            if (count > n / k) {
                ans++;
            }
        }

        return ans;
    }
}