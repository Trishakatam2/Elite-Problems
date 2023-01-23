class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.lstrip()
        sign = 1
        if s and (s[0] == '-' or s[0] == '+'):
            sign = -1 if s[0] == '-' else 1
            s = s[1:]
        digit = re.findall(r'^\d+', s)
        if not digit:
            return 0
        else:
            digit = digit[0]

        num = int(digit)

        int_min = -2**31
        int_max = 2**31-1
        if num*sign  < int_min:
            return int_min
        elif (num*sign > int_max):
            return int_max
        else:
            return num*sign