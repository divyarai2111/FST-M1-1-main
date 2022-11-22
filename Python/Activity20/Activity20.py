#Reading Excel Files

#Print the number of rows and columns
# Print the data in the emails column only
# Sort the data based on FirstName in ascending order and print the data

import pandas
dataframe = pandas.read_excel('act19.xlsx')
	
print(dataframe)

print(dataframe.shape)
 
print(dataframe["Email"])

print(dataframe.sort_values("FirstName"))
 