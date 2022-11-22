
tuple1=tuple(input("Enter list seperated by commas").split(","))

for x in tuple1:
    if(int(x)%5==0):
        print(x)