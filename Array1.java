import java.util.*;
class Array1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int min,max;
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
min=a[0];max=a[0];
for(int i=0;i<n;i++)
{
if(min>a[i])
min=a[i];
}
for(int i=0;i<n;i++)
{
if(max<a[i])
max=a[i];
}
System.out.println(min);
System.out.println(max);
}
}
