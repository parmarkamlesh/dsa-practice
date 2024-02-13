class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        for st in words:
            if st==st[::-1]:
                return st
        return ""
        