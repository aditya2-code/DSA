class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        char[] arr = new char[s.length()];
        int j = 0;

        // Reverse the entire string
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[j++] = s.charAt(i);
        }

        int i = 0;
        int l = 0;
        int r = 0;
        int n = arr.length;

        while (i < n) {
            // Copy the current word
            while (i < n && arr[i] != ' ') {
                arr[r++] = arr[i++];
            }

            // Reverse the copied word
            if (l < r) {
                int left = l;
                int right = r - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }

                // Add a space only if another word exists
                if (i < n) {
                    arr[r++] = ' ';
                    l = r;
                }
            }

            i++;
        }

        return new String(arr, 0, r);
    }
}