function linearSearch(arr, elToFind) {
  for (var i=0; i<arr.length; i++) {
    if (arr[i] == elToFind) {
      return i;
    }
  } return null;
}

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the array of integers, followed by the integer to search for: ', (answer) => {
  // console.log(`Array is: ${answer}`);
    var array = answer.split(" ").map(Number);
    var element = array.pop();
  	
  	let result = linearSearch(array, element);

  	if (result) console.log('Element found! at position ' + result); 
	else console.log('Element not found!'); 

    rl.close();
});
