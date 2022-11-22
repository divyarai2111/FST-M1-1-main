##Write a recursive function to calculate the sum of numbers from 0 to 10
def calculateSum(n):
    if n!=0:
        return n+calculateSum(n-1)
    else:
        return 0
        
n=int(input("Enter num"))
sum=calculateSum(n)



# Print result
print(sum)
