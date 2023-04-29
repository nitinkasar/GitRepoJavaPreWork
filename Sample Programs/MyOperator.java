public class MyOperator
{
 public static void main(String args[])
{
   int age = 20;
  boolean isEligible ;

    if ((age >= 24) && (age <= 100))
   {
       isEligible = true;
   } else
   {
      isEligible = false;
   }

String eligibleToVote;

   eligibleToVote = (isEligible)? "Yes, Can Vote" : "No, Cannot Vote";
   
  System.out.println("Eligible for Vote: " +eligibleToVote);

 }
}