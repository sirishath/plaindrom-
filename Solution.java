class Solution {
    public boolean isPalindrome(int x) {
        String first_num = Integer.toString(x);
        String reversedNum = "";
        
        for (int i = first_num.length(); i > 0; i--) {
            int z = i - 1;
            reversedNum += first_num.charAt(z);
        }

        return first_num.equals(reversedNum);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(121);
        System.out.println(result);
    }
}
