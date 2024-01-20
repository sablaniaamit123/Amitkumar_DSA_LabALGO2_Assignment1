package labalgo2;
import java.util.Scanner;

class labassignment
{


private static final long NULL = 0;

public static void main(String[] args)
{	
System.out.println("Enter size of the transaction array");
Scanner a=new Scanner(System.in);
int size=a.nextInt();
int arr[]=new int[size];
for (int i = 0; i < size; i++) 
{
	System.out.println("Enter the valus of the array");

	Scanner s=new Scanner(System.in);
arr[i] = s.nextInt(); 
}
System.out.println("Enter the No. of target");

Scanner sc1=new Scanner(System.in);
int targetNo = sc1.nextInt(); 
for(int i=0;i<size;i++)
{

for(int j = 0;j<targetNo;j++)
{
	int flag = 0; 
	long target;
	System.out.println("enter the value of target");
	Scanner t=new Scanner(System.in);
	target = t.nextInt();
	int sum=0;
	int k;
	
do {
	
	sum+= arr[i];
	if(sum>=target)
	{
		System.out.println("target achived after"+(i+1)+"transactions");
	break;	
	}
	i++;
}
while(target!=NULL);
}}
}
}
