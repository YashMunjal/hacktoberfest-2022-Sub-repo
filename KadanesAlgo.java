import java.util.Arrays;

public class KadanesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,-8,9,-9,10,-11,12};
		System.out.println(Arrays.toString(arr));
		System.out.println(kadanes(arr));
	}
public static int kadanes(int[] arr)
{
	int sum = 0;
	int maxsum = Integer.MIN_VALUE;
	
	for(int i = 0; i <= arr.length-1; i++)
	{
		sum = sum+arr[i];
		if(sum > maxsum) {
			maxsum = sum;
		}
		
		if(sum<0)
		{
			sum = 0;
		}
	}
	
	return maxsum;
}

// Output

// [8, -8, 9, -9, 10, -11, 12]
// 12
