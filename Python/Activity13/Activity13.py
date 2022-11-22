#Write a function sum() such that it can accept 
# a list of elements and print the sum of all elements


def sum(l):
    sum1=0
    for x in l:
        print(x)
        sum1+=int(x)
    return sum1

n=list(input("Enter list ").split(","))
print(sum(n))
