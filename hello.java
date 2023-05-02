class libraryMangement{

String bookName;
String dateOfIssue;
String dateOfReturn;
int lateFeePerDay;
int totalLateFee;

void bookIssue(String bookName,String dateOfIssue)
{
  if(bookName)
  {
   System.out.println("Book Issued");
  }
  
}

void bookReturn(String bookName,String dateOfReturn)
{
   if(todaydate=dateOfReturn)
   {
      System.out.println("Book Returned");
   }
   else{
     totalLateFee=noOfExtradays*lateFeePerDay;
	 System.out.println("Book Returned with Late Fee to be Paid"+totalLateFee);
   }
}

public static void main(String[] args)
{
    bookIssue("Rich Dad Poor Dad","28/04/2023");
    bookReturn("Rich Dad Poor Dad","15/05/2023");
}
}