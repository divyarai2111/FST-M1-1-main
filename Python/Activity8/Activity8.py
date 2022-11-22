##Given a list of numbers, return True if first and last number of a list is same.
list=list(input("Enter list seperated by commas").split(","))

if(list[0]==list[-1]):
    print("True")
else:
    print("False")