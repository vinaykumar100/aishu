import java.util.Scanner;
public class aishu
{
	public static void main(String [] args)
	{
		int num1,num2,num3,larg,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 nos");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
                                temp=num1 > num2 ? num1:num2;
                                larg=num3 > temp ? num3:temp;
                                System.out,println("the largest among 3numbers are"+large);   