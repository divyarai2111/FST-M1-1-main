#Reading CSV Files



import pandas

dataframe = pandas.read_csv("sample.csv")
print(dataframe)
 
print("---------------------")
#Print the values only in the Usernames column
print(dataframe["Usernames"])

print("---------------------")
# Print the username and password of the second row
print(dataframe["Usernames"][1]+  " "+dataframe["Passwords"][1])

print("---------------------")
# Sort the Usernames column data in ascending order and print data
print(dataframe.sort_values("Usernames"))

print("---------------------")
# Sort the Passwords column in descending order and print data
print(dataframe.sort_values("Passwords",ascending=False))

