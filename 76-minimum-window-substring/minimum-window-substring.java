class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Store frequency of each char in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                int oc = map.get(ch);
                map.put(ch, oc + 1);
            } else {
                map.put(ch, 1);
            }
        }

        HashMap<Character, Integer> windowmap = new HashMap<>();
        int left = 0;
        int right = 0;
        int minlength = Integer.MAX_VALUE;
        int minstart = 0;

        // Step 2: Start expanding the window
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (windowmap.containsKey(ch)) {
                int oc = windowmap.get(ch);
                windowmap.put(ch, oc + 1);
            } else {
                windowmap.put(ch, 1);
            }

            // Step 3: Check if current window is valid
            boolean isvalid = true;
            for (char key : map.keySet()) {
                if (!windowmap.containsKey(key) || windowmap.get(key) < map.get(key)) {
                    isvalid = false;
                    break;
                }
            }

            // Step 4: Shrink the window from the left if valid
            while (isvalid) {
                if ((right - left + 1) < minlength) {
                    minlength = right - left + 1;
                    minstart = left; // store the start of the minimum window
                }
                // shrinking of the window

                char leftchar = s.charAt(left);
                int freq = windowmap.get(leftchar);
                windowmap.put(leftchar, freq - 1);

                if (windowmap.get(leftchar) == 0) {
                    windowmap.remove(leftchar);
                }

                left++;

                // Recheck validity
                isvalid = true;
                for (char key : map.keySet()) {
                    if (!windowmap.containsKey(key) || windowmap.get(key) < map.get(key)) {
                        isvalid = false;
                        break;
                    }
                }
            }

            right++;
        }

        // Step 5: Return result
        if (minlength == Integer.MAX_VALUE) {
            return ""; // no valid window found
        } else {
            return s.substring(minstart, minstart + minlength);
        }
    }
}
