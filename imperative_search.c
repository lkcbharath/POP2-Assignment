#include <stdio.h> 

int search(int arr[], int n, int x) 
{ 
	int i; 
	for (i = 0; i < n; i++) 
		if (arr[i] == x) 
			return i; 
	return -1; 
} 

int main(void) { 
	int n,i,x;
	printf("Enter the number of elements in the array: ");
	scanf("%d",&n);
	int arr[n];
	printf("Enter the elements in the array:");
	for(i=0;i<n;++i){
		scanf("%d",&arr[i]);
	}
	printf("Enter the element to search for in the array:");
	scanf("%d",&x);
	int result = search(arr, n, x); 
	(result == -1) ? printf("Element is not present in array") 
				: printf("Element is present at index %d", 
							result); 
	return 0; 
} 
