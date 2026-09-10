class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
            return false;

        char arr[]=s.toCharArray();
        char brr[]=t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(brr);

    
        return Arrays.equals(arr,brr);

    }
}
