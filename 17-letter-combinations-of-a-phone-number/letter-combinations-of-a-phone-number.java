class Solution {

    private static final String[] MAP = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits == null || digits.length() == 0)
            return ans;

        backtrack(digits, 0, new StringBuilder(), ans);
        return ans;
    }

    private void backtrack(String digits, int index,
                           StringBuilder current,
                           List<String> ans) {

        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        String letters = MAP[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            current.append(letters.charAt(i));
            backtrack(digits, index + 1, current, ans);
            current.deleteCharAt(current.length() - 1);
        }
    }
}