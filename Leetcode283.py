class Solution:
    def moveZeroes(self, n: List[int]) -> None:

        k=n.count(0)
        for i in range(0,k):
            n.remove(0)
            n.append(0)
