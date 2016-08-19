import java.io.*;
import java.util.*;
public class bin_sort
{
public static void main(String[] args)
{

Map<Integer,Integer> three=new HashMap<Integer,Integer>();

int i,j=0;
Scanner in = new Scanner(System.in);
int len=in.nextInt();
int[] a=new int[len];
int[] a1=new int[len];
int[] a2=new int[len];
for(int k=0;k<len;k++)
{
	a[k]=in.nextInt();
		
}
for(i=0;i<len;i++)
{
	String s=new String(Integer.toBinaryString(a[i]));
	String temp1=s.replaceAll("0","");
	int temp=temp1.length();
	three.put(a[i],temp);
	a1[i]=a[i];
	a2[i]=temp;
	
}

for(i=0;i<len;i++)
{
	for(j=0;j<len-1;j++)
	{
		if(a2[j]<a2[j+1])
		{
                                                int temp2=a2[j];
			a2[j]=a2[j+1];
			a2[j+1]=temp2;


			int temp=a1[j];
			a1[j]=a1[j+1];
			a1[j+1]=temp;
		}

		
	}
}
for(int k=0;k<len;k++)
{
	for(int l=0;l<len-1;l++)
	{
		if(a2[l]==a2[l+1])
		{
		if(a1[l]<a1[l+1])
{
		int temp3=a1[l];
		a1[l]=a1[l+1];
		a1[l+1]=temp3;
}
		}
	}
}
System.out.println("\n\n");
for(int ii=0;ii<len;ii++)
System.out.println(a1[ii]);		
	

	}
}