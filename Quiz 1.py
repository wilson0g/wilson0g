#can edit the elements in the array
"""
1. assign a variable to the array
2.loop through the array
3. if each number in the array , if number is divisible by 2 without a reminder,
it should print "even" and the number and if number is divisible by 3 withouta reminder, 
it should print "odd" and the number, 
and if otherwise it should just print the number.
"""

nums=[8,9,20,24,25,27]
for i in range(len(nums)):
    if nums[i]%2==0:
        print("Even", nums[i])
    elif nums[i]%3==0:
        print("Odd", nums[i])
    else:
        print(nums[i])
    

