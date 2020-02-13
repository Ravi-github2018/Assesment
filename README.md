# Rabobank Customer Statement Processor
Rabobank receives monthly deliveries of customer statement records. This information is delivered in two formats, CSV and XML. These records need to be validated.

## Input
The format of the file is a simplified format of the MT940 format. The format is as follows:

Field  |Description
----|----
Transaction reference  | A numeric value
Account number   | An IBAN 
Account | IBAN 
Start Balance | The starting balance in Euros 
Mutation | Either and addition (+) or a deducation (-) 
Description | Free text 
End Balance | The end balance in Euros 

## Expected output
There are two validations:
* all transaction references should be unique
* the end balance needs to be validated

At the end of the processing, a report needs to be created which will display both the transaction reference and description of each of the failed records.

# Steps to run the application:
1.	Clone the project Rabobank (Spring REST project).
2.	Run maven command to install dependency.
3.	Run the project as springboot app.
4.	This Web service application have one active service to process Csv/Xml files. please find service url below,
http://localhost:8080/rabobank/processStatment
5.	Upload input csv/xml file in the service using postman client.
6.	The input file will be validated based on two conduction mentioned in the problem statment.(validation condition mentioned in expected output section)
      *	Duplicate Transaction key check, 
      *	End balance calculation check. (endbalance = startbalance – mutation)
7.  Finally invalid records will be getting as webservice response with status code. 

### Screen Shots



### Error scenario: 
1.	Handled the following error check in input file,
    *	Only Csv,Xml file can be Uploaded. Other file format will not be suported.
    *	Mandatory input check.
    *	Application runtime exception also handled using @ExceptionHandler.



### Test Cases:
Created test cases for all service classes in the application, (included in src/test/java/com/rabobank/testcase/TestCases.java)
PFB the test result,


