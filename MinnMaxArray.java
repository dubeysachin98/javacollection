import java.util.Arrays;

public class MinnMaxArray {

	public static void main(String[] args) {
		try {
			int arr [] = {0,1,1,0,2,3,65,90, -10};
			
			Arrays.sort(arr);
			System.out.println("Minimun of array is: "+arr[0]+" Maximum of array is: "+arr[arr.length-1]);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
//Minimun of array is: -10 Maximum of array is: 90

