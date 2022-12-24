package interviewbasedquestion;

public class RangeArray {

	public static void main(String[] args) {
		int a[]= {9,1,1,6,7,5,8,3,3,6,6,6,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println();
		}
		int range = a[a.length-1] - a[0];
		System.out.println("Range in the given array is : "+range);

	}

}
