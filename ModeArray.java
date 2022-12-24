package interviewbasedquestion;

public class ModeArray {

	public static void main(String[] args) {
		int a[]= {9,1,1,6,7,6,8,6};
		int count,maxcount=0,maxvalue=0;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count = count + 1;
				}
			}
			if(count > maxcount)
			{
				maxcount = count;
				maxvalue = a[i];
			}
		}
		System.out.println("The mode in a given array is: "+maxvalue);
		
		}

}
