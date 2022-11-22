#Writing Excel Files
	
from pandas import ExcelWriter
import pandas
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
dataframe = pandas.DataFrame(data)
print(dataframe)

writer=ExcelWriter('act19.xlsx')
dataframe.to_excel(writer, 'Sheet1')
writer.save()