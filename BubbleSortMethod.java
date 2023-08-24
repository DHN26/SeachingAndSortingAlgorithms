package classprograms;

public class BubbleSortMethod {
	void method(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			int help;
			for(int j=0;j<=(arr.length-2-i);j++) {
				if(arr[j]>arr[j+1]) {
					help=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=help;
				}
			}
		}
	}

}
