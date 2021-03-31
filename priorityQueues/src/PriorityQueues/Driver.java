package PriorityQueues;

import java.util.*;
import java.io.*;
import DataTypes.*;

public class Driver {
    
    public static void main(String[] args) {
        DefaultComparator<Integer> comp = new DefaultComparator<>();
        UnsortedArray<Integer, String> unsortArray = new UnsortedArray<>(comp);
        UnsortedList<Integer, String> unsortList = new UnsortedList<>(comp);
        SortedArray<Integer, String> sortArray = new SortedArray<>(comp);
        SortedList<Integer, String> sortList = new SortedList<>(comp);

        Scanner keyboard = new Scanner(System.in);
        String file = "elements_test_file1.txt";
        BufferedReader inputStream = null;
        String line;
        try {
            inputStream = new BufferedReader(new FileReader(file));
            // for n = 10

            // for unsorted array
            long startTime = System.currentTimeMillis();
            for (int n = 0; n < 10; n++) {
                if(inputStream.readLine() != null){
                    line = inputStream.readLine();
                    unsortArray.insert(n, line);
                }
            }
            long endTime = System.currentTimeMillis();
            long elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10; n++) {
                unsortArray.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            // for unsorted list
            
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10; n++) {
                if(inputStream.readLine() != null){
                    line = inputStream.readLine();
                    unsortList.insert(n, line);
                }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10; n++) {
                unsortList.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();
            

            // for sorted array
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10; n++) {
                if(inputStream.readLine() != null){
                    line = inputStream.readLine();
                    sortArray.insert(n, line);
              }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQSortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10; n++) {
                sortArray.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQSortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            // for sorted list
            
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10; n++) {
                if(inputStream.readLine() != null){
                    line = inputStream.readLine();
                    sortList.insert(n, line);
                }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10; n++) {
                sortList.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();
            
            /*
            //for n = 100
             // for unsorted array
             startTime = System.currentTimeMillis();
             for (int n = 0; n < 100; n++) {
                // while ((line = inputStream.readLine()) != null) {
                     line = inputStream.readLine();
                     unsortArray.insert(n, line);
               //  }
             }
             endTime = System.currentTimeMillis();
             elapsed = endTime - startTime;
             System.out.println("MyPQUnsortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");
 
             startTime = System.currentTimeMillis();
             for (int n = 0; n < 100; n++) {
                 unsortArray.removeMin();
             }
             endTime = System.currentTimeMillis();
             elapsed = endTime - startTime;
             System.out.println("MyPQUnsortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
             inputStream.close();
 
             // for unsorted list
             
             inputStream = new BufferedReader(new FileReader(file));
             startTime = System.currentTimeMillis();
             for (int n = 0; n < 100; n++) {
                 while ((line = inputStream.readLine()) != null) {
                     line = inputStream.readLine();
                     unsortList.insert(n, line);
                 }
             }
             endTime = System.currentTimeMillis();
             elapsed = endTime - startTime;
             System.out.println("MyPQUnsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");
 
             startTime = System.currentTimeMillis();
             for (int n = 0; n < 100; n++) {
                 unsortList.removeMin();
             }
             endTime = System.currentTimeMillis();
             elapsed = endTime - startTime;
             System.out.println("MyPQUnsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
             inputStream.close();
             
 
             // for sorted array
             inputStream = new BufferedReader(new FileReader(file));
             startTime = System.currentTimeMillis();
             for (int n = 0; n < 100; n++) {
                // while ((line = inputStream.readLine()) != null) {
                     line = inputStream.readLine();
                     sortArray.insert(n, line);
               //  }
             }
             endTime = System.currentTimeMillis();
             elapsed = endTime - startTime;
             System.out.println("MyPQSortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");
 
             startTime = System.currentTimeMillis();
             for (int n = 0; n < 100; n++) {
                 sortArray.removeMin();
             }
             endTime = System.currentTimeMillis();
             elapsed = endTime - startTime;
             System.out.println("MyPQSortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
             inputStream.close();
 
             // for sorted list
             
             inputStream = new BufferedReader(new FileReader(file));
             startTime = System.currentTimeMillis();
             for (int n = 0; n < 100; n++) {
               //  while ((line = inputStream.readLine()) != null) {
                     line = inputStream.readLine();
                     sortList.insert(n, line);
                 //}
             }
             endTime = System.currentTimeMillis();
             elapsed = endTime - startTime;
             System.out.println("MyPQsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");
 
             startTime = System.currentTimeMillis();
             for (int n = 0; n < 100; n++) {
                 sortList.removeMin();
             }
             endTime = System.currentTimeMillis();
             elapsed = endTime - startTime;
             System.out.println("MyPQsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
             inputStream.close();


             //for n = 1000
              // for unsorted array
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
               // while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    unsortArray.insert(n, line);
              //  }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
                unsortArray.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            // for unsorted list
            
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
                while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    unsortList.insert(n, line);
                }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
                unsortList.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();
            

            // for sorted array
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
               // while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    sortArray.insert(n, line);
              //  }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQSortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
                sortArray.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQSortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            // for sorted list
            
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
              //  while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    sortList.insert(n, line);
                //}
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
                sortList.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();


            //for n = 10000
            // for unsorted array
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
               // while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    unsortArray.insert(n, line);
              //  }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
                unsortArray.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            // for unsorted list
            
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
                while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    unsortList.insert(n, line);
                }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
                unsortList.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();
            

            // for sorted array
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
               // while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    sortArray.insert(n, line);
              //  }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQSortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
                sortArray.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQSortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            // for sorted list
            
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
              //  while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    sortList.insert(n, line);
                //}
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 1000; n++) {
                sortList.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            //for n = 100000
            // for unsorted array
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
               // while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    unsortArray.insert(n, line);
              //  }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
                unsortArray.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            // for unsorted list
            
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
                while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    unsortList.insert(n, line);
                }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
                unsortList.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();
            

            // for sorted array
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
               // while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    sortArray.insert(n, line);
              //  }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQSortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
                sortArray.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQSortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            // for sorted list
            
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
              //  while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    sortList.insert(n, line);
                //}
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
                sortList.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            //for n = 1000000
            // for unsorted array
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
               // while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    unsortArray.insert(n, line);
              //  }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
                unsortArray.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            // for unsorted list
            
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
                while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    unsortList.insert(n, line);
                }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
                unsortList.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQUnsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();
            

            // for sorted array
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
               // while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    sortArray.insert(n, line);
              //  }
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQSortedArray, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
                sortArray.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQSortedArray, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();

            // for sorted list
            
            inputStream = new BufferedReader(new FileReader(file));
            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
              //  while ((line = inputStream.readLine()) != null) {
                    line = inputStream.readLine();
                    sortList.insert(n, line);
                //}
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQsortedList, for N = 10, insert(K,V) took " + elapsed + " ms");

            startTime = System.currentTimeMillis();
            for (int n = 0; n < 10000; n++) {
                sortList.removeMin();
            }
            endTime = System.currentTimeMillis();
            elapsed = endTime - startTime;
            System.out.println("MyPQsortedList, for N = 10, removeMin(K,V) took " + elapsed + " ms");
            inputStream.close();
            */

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        
        keyboard.close();
    }

}
