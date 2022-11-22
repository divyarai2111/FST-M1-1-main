#Create a Python dictionary that contains a bunch of fruits and their prices.

# Write a program that checks if a certain fruit is available or not.

dict1={
    "apple":1,
    "banana":2
}

user=input("Check which fruit? ")
if(user in dict1):
    print("Exists")
else:
    print("Does not exists")