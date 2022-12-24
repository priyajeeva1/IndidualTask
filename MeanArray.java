package interviewbasedquestion;

public class MeanArray {

	public static void main(String[] args) {
		int a[]= {9,1,1,6,7,5,8,3,3,6,6,6,6};
            int sum=0;
			int average;
			for(int i=0;i<a.length;i++)
			{
			sum=sum+a[i];
			}
			average=sum/a.length;
			System.out.println("Average of given Array: " +average);
		
	
	}
}

		