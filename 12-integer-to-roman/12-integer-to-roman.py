class Solution:
    def intToRoman(self, x: int) -> str:
        intCode=[1000,900,500, 400, 100, 90 ,50,  40,  10, 9,   5,  4,   1]
        strCode=['M','CM','D','CD', 'C','XC','L','XL','X','IX','V','IV','I']
        op=""
        for i in range(0,len(intCode)):
            while x>=intCode[i]:
                op+=strCode[i]
                x-=intCode[i]
        return op