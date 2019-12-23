import java.util.*;
class Array2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int flag=0,c=0;
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("Enter number to be searched");
int s=sc.nextInt();
for(int i=0;i<n;i++)
{
	if(a[i]==s){
	flag=i+1;}
	else
	flag=-1;
}
System.out.println(flag);
}
}
