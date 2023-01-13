package COMP3270;

//Cailyn Hyun
//COMP 3270 Programming Homework
//Due 7/21/2022
//phw_input.txt file should be placed in same JAVA PROJECT before running

/*before compiling the java file, location of the phw_input.txt should be placed in reader line inside java file. 
Ex)"/Users/cailynhyun/eclipse-workspace/MyJava/phw_input.txt"*/

//CailynHyun_phw_output.txt will be placed in macbook user home (not desktop) after running

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Cailyn_Hyun_Programming_HW {

	public static void main(String[] args) throws IOException, InterruptedException {
		//read text file saved in java JRE System Library
		BufferedReader buffer = new BufferedReader(new FileReader("phw_input.txt"));
		
		//declare arrays and variables
		int[] myArr = new int[10];
		String str = null;
		int i = 0;
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int max4 = 0;
		
		//read comma separated integers in text file
		//convert and save them into int array
		while((str = buffer.readLine()) != null) {
			//read text file between commas as string
			String[] strArr = str.split(",");
			
			//save those string into string array(size of 10)
			//convert them into int and sve into int array(size of 10)
			for (String line : strArr) {
				strArr[i] = line;
				myArr[i] = Integer.parseInt(strArr[i]);
				System.out.print(myArr[i] + " ");
				i++;
			}
		}//end converting string to int array
		System.out.println(" ");
		//ALGORITHM STARTS HERE
		int L = 0;
		int U = myArr.length-1;
		
		max1 = Algorithm_1(myArr);
		max2 = Algorithm_2(myArr);
		max3 = MaxSum(myArr, L, U);
		max4 = Algorithm_4(myArr);
		
		System.out.printf("%n%s%d%s%s%d%s%s%d%s%s%d","Algorithm-1: ",max1,";","Algorithm-2: ",max2,";","Algorithm-3: ",max3,";","Algorithm-4: ",max4);
		System.out.println("");
		
		//write output in text file
		PrintWriter outFile = new PrintWriter("CailynHyun_phw_output.txt");
		
		//generate 19 array with sequence of random integers
		Random rand = new Random();
		
		int[] A1 = new int[10];
		int[] A2 = new int[15];
		int[] A3 = new int[20];
		int[] A4 = new int[25];
		int[] A5 = new int[30];
		int[] A6 = new int[35];
		int[] A7 = new int[40];
		int[] A8 = new int[45];
		int[] A9 = new int[50];
		int[] A10 = new int[55];
		int[] A11 = new int[60];
		int[] A12 = new int[65];
		int[] A13 = new int[70];
		int[] A14 = new int[75];
		int[] A15 = new int[80];
		int[] A16 = new int[85];
		int[] A17 = new int[90];
		int[] A18 = new int[95];
		int[] A19 = new int[100];
		
		//19X8 array for run time
		long[] runTime = new long[19];
		
		//matrix array has 19 arrays
		int[][] matrix = {A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19};
		long avg1 = 0;
		int j = 0;
		long endTime1 = 0;
		long timeElapsed1 = 0;
		long endTime2 = 0;
		long timeElapsed2 = 0;
		long startTime1 = 0;
		long startTime2 = 0;
		
		outFile.println("Algorithm_1,Algorithm_2,Algorithm_3,Algorithm_4,T1(n),T2(n),T3(n),T4(n)");
		outFile.println("");
		//generate random values of each 19 arrays
		for (int[] row: matrix) {
			for(i = 0; i <row.length; i++) {
				row[i] = rand.nextInt(40+10)-20;
			}
			
			
						//calculate running time
						//running time for Algorithm 1
						startTime2 = 0;
						endTime2 = 0;
						timeElapsed2 = 0;
						timeElapsed1 = 0;
						for (int x = 0; x <= 1; x++) {
							startTime2 += startTime1;
							endTime2 += endTime1;
							timeElapsed2 += timeElapsed1;
				
							startTime1 = System.nanoTime();
							for(int k = 0; k <= 500; k++) {
								Algorithm_1(row);
							}
				
							TimeUnit.SECONDS.sleep(5);
							endTime1 = System.nanoTime();
							timeElapsed1 = endTime1 - startTime1;
						}
			
						//average running time
						avg1 = (timeElapsed1 + timeElapsed2)/1000;
						runTime[0] = avg1;
						outFile.print(avg1 + ",");
			
						//running time for algorithm 2
						startTime2 = 0;
						endTime2 = 0;
						timeElapsed2 = 0;
						timeElapsed1 = 0;
						for (int x = 0; x <= 1; x++) {
							startTime2 += startTime1;
							endTime2 += endTime1;
							timeElapsed2 += timeElapsed1;
				
							startTime1 = System.nanoTime();
							for(int k = 0; k <= 500; k++) {
								Algorithm_2(row);
							}
				
							TimeUnit.SECONDS.sleep(5);
							endTime1 = System.nanoTime();
							timeElapsed1 = endTime1 - startTime1;
							
						}
			
						//average running time
						avg1 = (timeElapsed1 + timeElapsed2)/1000;
						runTime[1] = avg1;
						outFile.print(avg1 + ",");
			
						//running time for algorithm 3
						L = 0;
						U = row.length-1;
						startTime2 = 0;
						endTime2 = 0;
						timeElapsed2 = 0;
						timeElapsed1 = 0;
						for (int x = 0; x <= 1; x++) {
							startTime2 += startTime1;
							endTime2 += endTime1;
							timeElapsed2 += timeElapsed1;
				
							startTime1 = System.nanoTime();
							for(int k = 0; k <= 500; k++) {
								MaxSum(row,L,U);
							}
				
							TimeUnit.SECONDS.sleep(5);
							endTime1 = System.nanoTime();
							timeElapsed1 = endTime1 - startTime1;
							
						}
			
						//average running time
						avg1 = (timeElapsed1 + timeElapsed2)/1000;
						runTime[2] = avg1;
						outFile.print(avg1 + ",");
			
						//running time for algorithm 4
						startTime2 = 0;
						endTime2 = 0;
						timeElapsed2 = 0;
						timeElapsed1 = 0;
						for (int x = 0; x <= 1; x++) {
							startTime2 += startTime1;
							endTime2 += endTime1;
							timeElapsed2 += timeElapsed1;
				
							startTime1 = System.nanoTime();
							for(int k = 0; k <= 500; k++) {
								Algorithm_4(row);
							}
							
							TimeUnit.SECONDS.sleep(5);
							endTime1 = System.nanoTime();
							timeElapsed1 = endTime1 - startTime1;
							
						}
			
						//average running time
						avg1 = (timeElapsed1 + timeElapsed2)/1000;
						runTime[3] = avg1;
						outFile.print(avg1+",");
						
						//theoretically calculated complexity 
						int n = row.length;
						runTime[4] = (long)Math.ceil(2*(Math.pow(n,3)) + 4*(Math.pow(n, 2)) + 4*n +2);
						runTime[5] = (long)Math.ceil(5*(Math.pow(n, 2)) + 9*n + 1);
						runTime[6] = (long)Math.ceil((14*n*(Math.log(n)/Math.log(2)))+14*n);
						runTime[7] = (long)Math.ceil((12*n)+4);
						outFile.println(runTime[4] +","+ runTime[5] + ","+runTime[6] + ","+runTime[7]);
						System.out.println("Done with A"+j);
					
	
						j++;	
			}
		
		
		buffer.close();
		outFile.close();
	}//end main

	
	
	
	
	private static int Algorithm_1(int[] X){
		int maxSoFar = 0;
		int sum = 0;
		
		for (int L = 0; L<X.length; L++) {
			for (int U = L; U<X.length; U++) {
				sum = 0;
				for (int I = L; I<=U; I++) {
					sum = sum + X[I];
				}//end I loop
				if (maxSoFar < sum) {
					maxSoFar = sum;
				}//end if
			}//end U loop
		}//end L loop
		
		//if maxSoFar is negative value, "MSCS is defined to be zero"
		if (maxSoFar < 0) {
			maxSoFar = 0;
		}
		
		return maxSoFar;
	}//end Algorithm_1
	
	private static int Algorithm_2(int[] X) {
		int maxSoFar = 0;
		int sum = 0;
		
		for (int L = 0; L<X.length; L++) {
			sum = 0;
			for (int U = L; U<X.length; U++) {
				sum = sum + X[U];
				
				if (maxSoFar < sum) {
					maxSoFar = sum;
				}//end if
			}//end U loop
		}//end L loop
		
		//if maxSoFar is negative value, "MSCS is defined to be zero"
		if (maxSoFar < 0) {
			maxSoFar = 0;
		}
		
		return maxSoFar;
	}//end Algorithm_2
	
	private static int MaxSum(int[] X, int L, int U) {
		if (L > U) {
			return 0;
		}
		//array has only one element
		else if (L == U) {
			if (X[L]>0) {
				return X[L];
			}
			return 0;
		}
		
		int sum = 0;
		int maxToLeft = 0;
		int maxToRight = 0;
		int maxCrossing = 0;
		int maxInA = 0;
		int maxInB = 0;
		
		int M = (L + U)/2;
		/*A is X[L to M] 
		 *B is X[M+1 to U]
		 */
		//Find max crossing to left
		for (int I = M; I>=L; I--) {
			sum += X[I];
			if (maxToLeft < sum) {
				maxToLeft = sum;
			}
		}//end max LEFT
		
		sum = 0;
		//Find max crossing to right
		for (int I = M+1; I<=U; I++) {
			sum += X[I];
			if (maxToRight < sum) {
				maxToRight = sum;
			}
		}
		
		maxCrossing = maxToLeft + maxToRight;
		maxInA = MaxSum(X,L,M);
		maxInB = MaxSum(X,M+1,U);
		
		if ((maxCrossing > 0)&&(maxCrossing > maxInA)&&(maxCrossing > maxInB)) {
			return maxCrossing;
		}
		else if ((maxInA > 0)&&(maxInA > maxInB)) {
			return maxInA;
		}
		else {
			if (maxInB > 0) {
				return maxInB;
			}
			return 0;
		}
	}//end Algorithm_3(MaxSum)
	
	private static int Algorithm_4(int[] X) {
		int maxSoFar = 0;
		int maxEndingHere = 0;
		int sum = 0;
		
		for (int I = 0; I<X.length; I++) {
			sum += X[I];
			
			//if sum becomes negative, restarting from current index
			if(sum < 0) {
				sum = 0;
			}
			else if (sum > 0) {
				maxEndingHere = sum;
			}
			
			if(maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
			}
		}
		
		//if maxSoFar is negative value, "MSCS is defined to be zero"
		if (maxSoFar < 0) {
			maxSoFar = 0;
		}
		
		
		return maxSoFar;
	}//end Algorithm_4

}//end class















