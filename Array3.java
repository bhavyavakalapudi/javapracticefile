import java.util.*;
class Array3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int flag=0;
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n;i++)
{
	char c=(char)a[i];
	System.out.println(c);
}
}
}
