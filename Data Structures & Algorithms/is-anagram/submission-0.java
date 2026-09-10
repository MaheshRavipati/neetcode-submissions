class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arr = s.toCharArray();

        char[] brr = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

        boolean result = Arrays.equals(arr,brr);

        return result;

    }
}
