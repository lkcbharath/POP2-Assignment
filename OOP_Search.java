import java.util.*;
import java.io.*; 

interface LinearSearch {
    int search(int item);
}

class LinearSearchObject implements LinearSearch {
    private int[] numbers;

    LinearSearchObject(int[] numbers){
        this.numbers = numbers;
    }

    @Override
    public int search(int item) {
        int i;
        int n = this.numbers.length;
        for (i=0;i<n;++i){
            if (this.numbers[i]==item){
                return i;
            }
        }
        return -1;
    }
}

class OOP_Search { 
    public static void main(String[] args) 
    { 
        Scanner scan = new Scanner(System.in);
        int i,n,item,result;

        System.out.println("Enter the size of the array of integers: ");
        n = scan.nextInt();
        if (n<1){
            System.out.println("Invalid size entered.");
            System.exit(0);
        }
        int arr[] = new int[n];
        System.out.println("Enter the array of integers: ");
        for (i=0;i<n;++i){
            arr[i] = scan.nextInt();
        }
        LinearSearchObject ls = new LinearSearchObject(arr);
        System.out.println("Enter the integer to search for in the array: ");
        item = scan.nextInt();
        result = ls.search(item);
        
        if(result!=-1) System.out.println("The position of the integer in the array is (0-indexed): " + result);
        else System.out.println("The integer is not present in the array!");
    } 
} 