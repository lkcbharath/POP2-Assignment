function linearSearch(arr, elToFind) {
  for (var i=0; i<arr.length; i++) {
    if (arr[i] == elToFind) {
      return i;
    }
  } return null;
}
   
// Driver code 
let arr = [1, 3, 5, 7, 8, 9]; 
let x = 5; 

let bs = linearSearch(arr, x);
if (bs) 
    console.log("Element found! at position "+ bs); 
else console.log("Element not found!"); 