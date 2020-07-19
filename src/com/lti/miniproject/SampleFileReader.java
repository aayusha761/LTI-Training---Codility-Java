package com.lti.miniproject;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	static List<String> zipCode=new ArrayList<String>();
	static List<String> submittedVia=new ArrayList<String>();
	static List<String> dateSentToCompany=new ArrayList<String>();
	static List<String> companyResponseToConsumer=new ArrayList<String>();
	static List<String> timelyResponse=new ArrayList<String>();
	static List<String> consumerDisputed=new ArrayList<String>();
	static List<String> complaintId=new ArrayList<String>();
	
	
	public static void main(String[] args)  
	{  
		Scanner console = new Scanner(System.in);

		CSVReader reader = null;  
		try {  
			//parsing a CSV file into CSVReader class constructor  
			reader = new CSVReader(new FileReader("/Users/aayusharora/Downloads/complaints.csv"));  
			String [] nextLine;  
			//reads one line at a time  
			while ((nextLine = reader.readNext()) != null) {  
//				 ADD DATE TO LIST
				String ld = nextLine[0].replace("-", "/");
//				System.out.println(ld);
				dateReceived.add(ld);
				
				//ADD PRODUCT TO LIST
//				System.out.println(nextLine[1]);
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
				zipCode.add(nextLine[7]);
				
//				submittedVia
				submittedVia.add(nextLine[8]);
				
//				dateSentToCompany
				dateSentToCompany.add(nextLine[9]);
				
//				companyRespomseToConsumer
				companyResponseToConsumer.add(nextLine[10]);
				
//				timelyResponse
				timelyResponse.add(nextLine[11]);
				
//				consumerDisputed
				consumerDisputed.add(nextLine[12]);
				
//				complaintId
				complaintId.add(nextLine[13]);
			}  
		}  
		catch (Exception e) {  
			e.printStackTrace();  
		}
		
		dateReceived.remove(0);
		product.remove(0);
		subProduct.remove(0);
		issue.remove(0);
		subIssue.remove(0);
		company.remove(0);
		state.remove(0);
		zipCode.remove(0);
		submittedVia.remove(0);
		dateSentToCompany.remove(0);
		companyResponseToConsumer.remove(0);
		timelyResponse.remove(0);
		consumerDisputed.remove(0);
		complaintId.remove(0);
		
		System.out.println("Welcome");
		System.out.println("Tell us what do you want to do");
		System.out.println("1. Display Complaints based on Given Date\n 2. Display complaints based on the name of the bank provided by the user\n 3. Display complaints based on the complaint id provided by the user\n");
		System.out.println("Enter your choice : ");
		
		
		int choice = Integer.parseInt(console.nextLine());
		
		switch(choice) {
			case 1:
				fun1();
				break;
			case 2:
				fun2();
				break;
			case 3:
				fun3();
				break;
			default:
				System.out.println("Enter correct choice");
		}
		
	}


	private static void fun3() {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter COMPLAINT ID to fetch the complaint details : ");
		String cid = console.nextLine();
		String c = complaintId.get(0);
//		System.out.println(c);
//		System.out.println(cid);
		
		for(int i = 0;i<complaintId.size();i++) {
			if(complaintId.get(i).equals(cid)) {
				System.out.println(issue.get(i));
			}
		}
	}


	private static void fun2() {
		// TODO Auto-generated method stub
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter name of the bank to fetch the complaint details : ");
		String bankName = console.nextLine();
		String c = company.get(0);
//		System.out.println(c);
//		System.out.println(bankName);
		
		for(int i = 0;i<company.size();i++) {
			if(company.get(i).equals(bankName)) {
				System.out.println(complaintId.get(i));
			}
		}
		
	}


	private static void fun1() {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Enter Year for which you want to fetch the complaint details : ");
		String inputYear = console.nextLine();
		String date = dateReceived.get(0);
//		System.out.println(date);
//		System.out.println(inputYear);
		
		for(int i = 0;i<dateReceived.size();i++) {
			if(dateReceived.get(i).substring(6).equals(inputYear)) {
				System.out.println(complaintId.get(i));
			}
		}
		
	}  
}