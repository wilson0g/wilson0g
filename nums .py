#can edit the elements in the array
nums=[8,9,20,24,25,27]
for i in range(len(nums)):
    if nums[i]%2==0:
        print("Even", nums[i])
    elif nums[i]%3==0:
        print("Odd", nums[i])
    else:
        print(nums[i])
    
