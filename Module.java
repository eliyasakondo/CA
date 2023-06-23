
package application;


import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Md. Eliyas Akondo
 */
public class Module{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        while(true){
        System.out.println("================ ((Algorithms))====================");
        System.out.println(" 1) Data Structures\n"
                + " 2) Graph Algorithms");
        System.out.print("Enter your choice #> ");
        
        int choice = s.nextInt();
        System.out.println("====================================================");

        if (choice == 1) {
            System.out.println("================ ((Data Structures))====================");
            System.out.println(
            	     "  01) Bubble Sort\n"
                    + " 02)  Insertion Sort\n"
                    + " 03)  Selection Sort\n"
                    + " 04)  Marge Sort\n"
                    + " 05)  Quick Sort\n"
                    + " 06)  Counting Sort\n"
                    + " 07)  Radix Sort\n"
                    + " 08)  Heap Sort\n"
                    + " 09)  Bin Sort\n"
                    + " 10)  Shell Sort\n"
                    + " 11)  Linear Search\n"
                    + " 12)  Binary Search\n"
                    + " 13)  Euclidean GCD Algorithm\n"
                    + " 14)  Universal Hashing\n"
                    + " 15)  Stack\n"
                    + " 16)  Queue\n"
                    + " 17)  Linked List\n"
                    + " 18)  Fibonacci Numbers\n"
                    + " 19)  Recurrences");
            System.out.print("Enter your Data Sturcture choice #> ");
            int c1 = s.nextInt();
            switch (c1) {
                case 1:
                	BubbleSort bs=new BubbleSort();
                	bs.bubbleSort();
                    break;
                case 2:
                	//Insertion Sort
                	System.out.println("================ ((Insertion Sort))====================");
    InsertionSort insertionSort = new InsertionSort();
    insertionSort.insertionSort();
                	
                    break;
                case 3:
                	
                	 System.out.println("================ ((Selection Sort))====================");

                	SelectionSort ss =new SelectionSort();
                	ss.selectionSort();     	
                	
                    break;
                case 4:
                	 System.out.println("================ ((Merge Sort))====================");
                	MergeSort ms = new MergeSort();
  			 ms.mergeSort();
                    break;
                case 5:
                  System.out.println("================ ((Quick Sort))====================");
  			  QuickSort quickSort = new QuickSort();
 			   quickSort.quickSort();
                    break;
                case 6:
                	 System.out.println("================ ((Counting Sort))====================");
    			CountingSort countingSort = new CountingSort();
  			countingSort.countingSort();
                    break;
                case 7:
                 System.out.println("================ ((Radix Sort))====================");
   		 RadixSort radixSort = new RadixSort();
  		  radixSort.radixSort();
                    break;
                case 8:
                 System.out.println("================ ((Heap Sort))====================");
 		   HeapSort heapSort = new HeapSort();
 		   heapSort.heapSort();
                    break;
                case 9:
               		  System.out.println("================ ((Bin Sort))====================");
    			BinSort binSort = new BinSort();
  			  binSort.binSort();
                  	  break;
                case 10:
      		          System.out.println("================ ((Shell Sort))====================");
    			ShellSort shellSort = new ShellSort();
   			 shellSort.shellSort();
                
                    break;
                case 11:
                	//Linear Search
                	 System.out.println("================ ((Linear Search))====================");
  			  LinearSearch linearSearch = new LinearSearch();
   			  linearSearch.linearSearch();
                    break;
                case 12:
                		//Binary Search
                		System.out.println("================ ((Binary Search))====================");
   				 BinarySearch binarySearch = new BinarySearch();
  				  binarySearch.binarySearch();
                    break;
                case 13:
                
                    break;
                case 14:
                    break;
                case 15:
                		
                    break;
                case 16:
                	
                    break;
                case 17:
                 System.out.println("================ ((Linked List))====================");
    LinkedList linkedList = new LinkedList();
    linkedList.display();

                    break;
                case 18:
                System.out.println("================ ((Fibonacci Numbers))====================");
    FibonacciNumber fibonacciNumber = new FibonacciNumber();
    fibonacciNumber.main(new String[0]);
                    break;
                case 19:
                
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("====================================================");
        } else if (choice == 2) {
            System.out.println("================ ((Algorithms))====================");
            System.out.println("  01) Largest Common Subsequence\n"
                    + " 02)  Optimal Binary Search Tree\n"
                    + " 03)  Matrix Chain Multiplication\n"
                    + " 04)  Strassen's Matrix Muliplication Algorithm\n"
                    + " 05)  BFS\n"
                    + " 06)  DFS\n"
                    + " 07)  DAG\n"
                    + " 08)  Longest Increasing Subsequence\n"
                    + " 09)  Topological Sort\n"
                    + " 10)  Krushkal's Algorithm\n"
                    + " 11)  Prim's Algorithm\n"
                    + " 12)  Dijkastra's Algorithm\n"
                    + " 13)  Bellman Ford's Algorithm\n"
                    + " 14)  Worshall's Algorithm\n"
                    + " 15)  (0,1) KKnapsack Problem\n"
                    + " 16)  Naive String Matching Algorithms\n"
                    + " 17)  Rabin Krap String Matching Algorithm\n"
                    + " 18)  Activity Selection Problem\n"
                    + " 19)  MST Algorithms\n"
                    + " 20)  Max Flow Min Cut");
            System.out.print("Enter your Graph Algorithm choice #> ");
            int c1 = s.nextInt();
            switch (c1) {
                case 1:
                 	
                
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
			      System.out.print("Enter the number of vertices: ");
        int numVertices = s.nextInt();

        BFS bfs = new BFS(numVertices);

        System.out.print("Enter the number of edges: ");
        int numEdges = s.nextInt();

        System.out.println("Enter the edges (space-separated):");
        for (int i = 0; i < numEdges; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            bfs.addEdge(u, v);
        }
        System.out.print("Enter the starting vertex for BFS: ");
        int startVertex = s.nextInt();
        bfs.breadthFirstSearch(startVertex);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                Node<String> nodeF = new Node<>("F");

 	       nodeA.addAdjacentNode(nodeB, 2);
	        nodeA.addAdjacentNode(nodeC, 4);

	        nodeB.addAdjacentNode(nodeC, 3);
	        nodeB.addAdjacentNode(nodeD, 1);
	        nodeB.addAdjacentNode(nodeE, 5);

	        nodeC.addAdjacentNode(nodeD, 2);

	        nodeD.addAdjacentNode(nodeE, 1);
	        nodeD.addAdjacentNode(nodeF, 4);

	        nodeE.addAdjacentNode(nodeF, 2);

	        Dijkstra<String> dijkstra = new Dijkstra<>();
	        dijkstra.calculateShortestPath(nodeA);
	        dijkstra.printPaths(List.of(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF));
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("====================================================");

        } else {
            System.out.println("Invalid choice");
        }
    }

}
}
