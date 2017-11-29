import csv


with open('out.csv') as csvfile:
	readCSV = csv.reader(csvfile, delimiter=',')
	print(readCSV)

	for row in readCSV:
		print row