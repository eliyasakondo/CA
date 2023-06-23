package application;
//importing scanner package
import java.util.*;
//class Bubble Sort
class BubbleSort{
	//method bubble Sort
	public void bubbleSort(){
		//array declaration with constant value
		/*
		//int arraySet[]={1,5,3,2,9};
		*/
		//dynamic input from Input Class
		/*
		Input entry=new Input();
		entry.input();
		*/
		//Input from Keyboard......
		//declare package in top
		//import java.util.*;
		//creating object of Scanner class
		Scanner s=new Scanner(System.in);
		System.out.print("Enter size of your array  ~$ ");
		int arraysize=s.nextInt();
		//Array Initializing and size declearing.
		int arr[]=new int[arraysize];
		for(int i=0; i<arraysize; i++){
		System.out.print("Index["+i+"] :~$ ");
			arr[i]=s.nextInt();
		}
		//sorted method
		sort(arr);
	}
	public void sort(int array[]){
		//value printing before sorting.
		for(int i=0;i<array.length;i++){
			System.out.println("array ["+i+"] = "+array[i]);
		}
		//array size contains to variable n
		int n=array.length;
		//outer loop
		for(int i=0;i<n-1;i++){
			//pass using only for printing phases...
			int pass=i;
			System.out.println("Pass : "+ ++pass);
			//inner loop (n-i-1); ith times sorted 
			for(int j=0;j<n-i-1;j++){
				if(array[j]>array[j+1]){
					//swap
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;	
				}
				System.out.print("\t");
				//nothing happened logical; showcase;
				for(int k=0;k<n;k++){
					System.out.print(array[k]+" ");
				}
				System.out.println("");
			}		
		}
		//manual print after sorted ASC
		/* 
		//comments.....
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		*/
	}
}
