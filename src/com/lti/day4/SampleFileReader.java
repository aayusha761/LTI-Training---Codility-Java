package com.lti.day4;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;  
public class SampleFileReader  
{    
	static List<String> dateReceived=new ArrayList<String>();
	static List<String> product=new ArrayList<String>();
	static List<String> subProduct=new ArrayList<String>();
	static List<String> issue=new ArrayList<String>();
	static List<String> subIssue=new ArrayList<String>();
	static List<String> company=new ArrayList<String>();
	static List<String> state=new ArrayList<String>();
	static List<Integer> zipCode=new ArrayList<Integer>();
	static List<String> submittedVia=new ArrayList<String>();
	static List<String> dateSentToCompany=new ArrayList<String>();
	static List<String> companyRespomseToConsumer=new ArrayList<String>();
	static List<String> timelyResponse=new ArrayList<String>();
	static List<String> consumerDisputed=new ArrayList<String>();
	static List<Integer> complaintId=new ArrayList<Integer>();
	
	
	public static void main(String[] args)  
	{  
		CSVReader reader = null;  
		try {  
			//parsing a CSV file into CSVReader class constructor  
			reader = new CSVReader(new FileReader("/Users/aayusharora/Downloads/complaints.csv"));  
			String [] nextLine;  
			//reads one line at a time  
			while ((nextLine = reader.readNext()) != null) {  
//				 ADD DATE TO LIST
				String ld = nextLine[0].replace("-", "/");
				System.out.println(ld);
				dateReceived.add(ld);
				
				//ADD PRODUCT TO LIST
				product.add(nextLine[1]);
				
				//subProduct
				subProduct.add(nextLine[2]);
				
//				issue
				issue.add(nextLine[3]);
				
//				subIssue
				subIssue.add(nextLine[4]);
				
//				company
				company.add(nextLine[5]);
				
//				state
				state.add(nextLine[6]);
				
//				zipCode
				zipCode.add(Integer.parseInt(nextLine[7]));
				
//				submittedVia
				submittedVia.add(nextLine[8]);
				
//				dateSentToCompany
				dateSentToCompany.add(nextLine[9]);
				
//				companyRespomseToConsumer
				companyRespomseToConsumer.add(nextLine[10]);
				
//				timelyResponse
				timelyResponse.add(nextLine[11]);
				
//				consumerDisputed
				consumerDisputed.add(nextLine[12]);
				
//				complaintId
				complaintId.add(Integer.parseInt(nextLine[13]));
			}  
		}  
		catch (Exception e) {  
			e.printStackTrace();  
		}  
	}  
}