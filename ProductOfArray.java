class ProductOfArray { 
    public static void main(String[] args) 
	{ 
		ProductOfArray p = new ProductOfArray(); 
		int arr[] = { 1, 2, 3, 4, 5 }; 
		int n = arr.length;  
		p.prodArray(arr, n); 
	} 
	
	void prodArray(int arr[], int n) 
	{  
 
		int left[] = new int[n]; 
		int right[] = new int[n]; 
		int prod[] = new int[n]; 

		int i, j; 

		left[0] = 1; 
        right[n - 1] = 1; 
        for (i = 1; i < n; i++) 
			left[i] = arr[i - 1] * left[i - 1]; 

		
		for (j = n - 2; j >= 0; j--) 
			right[j] = arr[j + 1] * right[j + 1]; 

		
		for (i = 0; i < n; i++) 
			prod[i] = left[i] * right[i]; 

	
		for (i = 0; i < n; i++) 
			System.out.print(prod[i] + " "); 

		return; 
	} 

	
} 
