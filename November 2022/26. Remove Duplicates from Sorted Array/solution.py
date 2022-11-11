# Asked on 11-11-2022
# Language: Python

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if(len(nums)==0 or len(nums)==1):
            return len(nums)
        j = 0
        for i in range(0, len(nums)-1):
            if(nums[i] != nums[i+1]):
                nums[j] = nums[i]
                j = j+1
        nums[j] = nums[len(nums) - 1];
        j = j+1
        return j
