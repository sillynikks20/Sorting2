package sorting;
public class NewSort1 {

	public static void main(String[] args) {
		int arr[] = {1, 3, 4, 2, 6, 7};
		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
		for(int i=0; i < arr.length; i++) {
        	System.out.print(arr[i]+ " ");
        }
	}

}