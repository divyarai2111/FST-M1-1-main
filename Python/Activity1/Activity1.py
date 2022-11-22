##Write a program that asks the user to enter their name and their age.
##Print out a message addressed to them that tells them the year that they will turn 100 years old.


name=input("Name?")
age=int(input("Age?"))
print(name +" will turn 100 years old in "+ str(2020+100-age))