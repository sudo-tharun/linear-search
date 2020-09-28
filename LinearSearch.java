/* Algorithm:

Step 1: Input the number of elements in which the number has to be searched.
Step 2: Now, read the list of elements.
Step 3: Input the element to search for.
Step 4: Using a loop, search for the element in the array or the list of elements.
Step 5: Exit loop. Stop.
*/

/* Pseudo code:

Input number of elements to variable n
Declare array, arr, that takes elements to it.

for i<-1 to n do
    input the elements to the array.
end for
input element to be searched to k
for j<-1 to n do
    if(arr[j]==k) then
    break the loop.
    end if.
end for
*/

import java.util.*;
class LinearSearch{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        int count=0,j;
    try{
        System.out.print("Enter the number of elements in the array: ");
        n=s.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        System.out.println("Enter the element to search for:");
        int k=s.nextInt();
        for(j=0;j<n;j++){
            count+=1;
            if(arr[j]==k)
                break;
        }
    }
    finally{
        s.close();
    }

        System.out.println("Number is found at position: " +  (j+1));
        System.out.println("No. of iterations: "+ count);
    }
}
