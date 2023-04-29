public class NarrowCast
{
  public static void main(String args[])
  {
     short SVar = 10000;
     byte bVar = 125;
      short sVar1 = bVar;

      System.out.println("The Byte in Short "+sVar1);   

      byte bVar1 = (byte)SVar;
   System.out.println("The Short in Byte "+bVar1);
  }
}