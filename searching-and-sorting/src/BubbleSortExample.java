
public class BubbleSortExample {
	public static void bubbleSort(int arr[]) {
		int n=arr.length-1;
		int temp=0;
		for(int i=0; i<n; i++) {
			for(int j=0;j<(n-i);j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void printArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {5,4,1,3,2};
       bubbleSort(arr);
       printArr(arr);
	}

}
