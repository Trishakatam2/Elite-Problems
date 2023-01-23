class Solution:
    def firstUniqChar(self, s: str) -> int:
        res = set()
        for i in set(s):
            if s.count(i)==1:
                res.add(s.index(i))
        if res:
            return min(res)
        return -1