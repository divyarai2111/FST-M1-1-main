##Given a two list of numbers create a new list such that
#  new list should contain only odd numbers from the '
# first list and even numbers from the second list.

list1=list(input("Enter list seperated by commas").split(","))
list2=list(input("Enter list seperated by commas").split(","))
list3=[]
for x in list1:
    if(int(x)%2==0):
        list3.append(x);

for x in list2:
    if(int(x)%2!=0):
        list3.append(x);       

print(list3)


