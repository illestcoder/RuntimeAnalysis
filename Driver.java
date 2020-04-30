import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

public class Driver {
    // Global variable to be referenced
    static int input;
    static int count = 0;
    static double averager = 0.0;
    static int SIZE;
    static int k;

    public static void main(String[] args) throws IOException {
        System.out.println("Average times are in order with respect to Algorithm numbering scheme: 1, 2, 3, 4");
        System.out.println("********* K=1 *********");
        kn1();
        System.out.println("********* K=n/4 *********");
        kn4();
        System.out.println("********* K=n/2 *********");
        kn2();
        System.out.println("********* K=3n/4 *********");
        k3n4();
        System.out.println("********* K=n*********");
        kn();

        // testing select 2 vs select 3
        // need to manually adjust valid inputs read from file at avgRuntime() method
//        twoVSthree();

        // testing runtime for populating array
//        run_array(40000000);
//        run_array(50000000);
//        run_array(60000000);
//        run_array(70000000);
//        run_array(80000000);
//        run_array(90000000);
//        run_array(100000000);
//        run_array(110000000);
//        run_array(120000000);
//        run_array(140000000);
//        run_array(160000000);
//        run_array(180000000);
//        run_array(200000000);

    }

    /** runSingle()
     *  Input: integers 1, 2, 3, 4
     *  Output: Algorithm runtime separately based on input
     **/
    public static void runSingle() {
        System.out.print("1, 2, 3, 4: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

        while(input != -1) {
            if(input == 1) {
                /** ALGORITHM 1 **/
                run_algorithm1(SIZE, k);
            } else if(input == 2) {
                /** ALGORITHM 2 **/
                run_algorithm2(SIZE, k);
            } else if(input == 3) {
                /** ALGORITHM 3 **/
                run_algorithm3(SIZE, k);
            } else if(input == 4){
                /** ALGORITHM 4 **/
                run_algorithm4(SIZE, k);
            } else {
                double trueAvg = averager/5.0;
                System.out.printf("Average Runtime %.9f", trueAvg);
                averager = 0.0;
            }
            System.out.print("\n1, 2, 3, 4: ");
            sc = new Scanner(System.in);
            input = sc.nextInt();
        }
    }

    /** Below functions will run all test cases.
     *  Each function name is representative of k=1, k=n/4, k=n/2, k=3n/4, k=n respectively.
     */
    public static void kn1() throws IOException {
        SIZE = 10;
        k = 1;
        infoOut();

        SIZE = 100;
        k = 1;
        infoOut();

        SIZE = 1000;
        k = 1;
        infoOut();

        SIZE = 10000;
        k = 1;
        infoOut();

        SIZE = 100000;
        k = 1;
        infoOut();

        SIZE = 1000000;
        k = 1;
        infoOut();

        SIZE = 2000000;
        k = 1;
        infoOut();

        SIZE = 3000000;
        k = 1;
        infoOut();

        SIZE = 4000000;
        k = 1;
        infoOut();

        SIZE = 5000000;
        k = 1;
        infoOut();

        SIZE = 6000000;
        k = 1;
        infoOut();

        SIZE = 8000000;
        k = 1;
        infoOut();

        SIZE = 10000000;
        k = 1;
        infoOut();

        SIZE = 20000000;
        k = 1;
        infoOut();

        SIZE = 30000000;
        k = 1;
        infoOut();

        SIZE = 40000000;
        k = 1;
        infoOut();
    }
    public static void kn4() throws IOException {
        SIZE = 10;
        k = SIZE/4;
        infoOut();

        SIZE = 100;
        k = SIZE/4;
        infoOut();

        SIZE = 1000;
        k = SIZE/4;
        infoOut();

        SIZE = 10000;
        k = SIZE/4;
        infoOut();

        SIZE = 100000;
        k = SIZE/4;
        infoOut();

        SIZE = 1000000;
        k = SIZE/4;
        infoOut();

        SIZE = 2000000;
        k = SIZE/4;
        infoOut();

        SIZE = 3000000;
        k = SIZE/4;
        infoOut();

        SIZE = 4000000;
        k = SIZE/4;
        infoOut();

        SIZE = 5000000;
        k = SIZE/4;
        infoOut();

        SIZE = 6000000;
        k = SIZE/4;
        infoOut();

        SIZE = 8000000;
        k = SIZE/4;
        infoOut();

        SIZE = 10000000;
        k = SIZE/4;
        infoOut();

        SIZE = 20000000;
        k = SIZE/4;
        infoOut();

        SIZE = 30000000;
        k = SIZE/4;
        infoOut();

        SIZE = 40000000;
        k = SIZE/4;
        infoOut();
    }
    public static void kn2() throws IOException {
        SIZE = 10;
        k = SIZE/2;
        infoOut();

        SIZE = 100;
        k = SIZE/2;
        infoOut();

        SIZE = 1000;
        k = SIZE/2;
        infoOut();

        SIZE = 10000;
        k = SIZE/2;
        infoOut();

        SIZE = 100000;
        k = SIZE/2;
        infoOut();

        SIZE = 1000000;
        k = SIZE/2;
        infoOut();

        SIZE = 2000000;
        k = SIZE/2;
        infoOut();

        SIZE = 3000000;
        k = SIZE/2;
        infoOut();

        SIZE = 4000000;
        k = SIZE/2;
        infoOut();

        SIZE = 5000000;
        k = SIZE/2;
        infoOut();

        SIZE = 6000000;
        k = SIZE/2;
        infoOut();

        SIZE = 8000000;
        k = SIZE/2;
        infoOut();

        SIZE = 10000000;
        k = SIZE/2;
        infoOut();

        SIZE = 20000000;
        k = SIZE/2;
        infoOut();

        SIZE = 30000000;
        k = SIZE/2;
        infoOut();

        SIZE = 40000000;
        k = SIZE/2;
        infoOut();
    }
    public static void k3n4() throws IOException {
        SIZE = 10;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 100;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 1000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 10000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 100000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 1000000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 2000000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 3000000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 4000000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 5000000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 6000000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 8000000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 10000000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 20000000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 30000000;
        k = 3*SIZE/4;
        infoOut();

        SIZE = 40000000;
        k = 3*SIZE/4;
        infoOut();
    }
    public static void kn() throws IOException {
        SIZE = 10;
        k = SIZE-1;
        infoOut();

        SIZE = 100;
        k = SIZE-1;
        infoOut();

        SIZE = 1000;
        k = SIZE-1;
        infoOut();

        SIZE = 10000;
        k = SIZE-1;
        infoOut();

        SIZE = 100000;
        k = SIZE-1;
        infoOut();

        SIZE = 1000000;
        k = SIZE-1;
        infoOut();

        SIZE = 2000000;
        k = SIZE-1;
        infoOut();

        SIZE = 3000000;
        k = SIZE-1;
        infoOut();

        SIZE = 4000000;
        k = SIZE-1;
        infoOut();

        SIZE = 5000000;
        k = SIZE-1;
        infoOut();

        SIZE = 6000000;
        k = SIZE-1;
        infoOut();

        SIZE = 8000000;
        k = SIZE-1;
        infoOut();

        SIZE = 10000000;
        k = SIZE-1;
        infoOut();

        SIZE = 20000000;
        k = SIZE-1;
        infoOut();

        SIZE = 30000000;
        k = SIZE-1;
        infoOut();

        SIZE = 40000000;
        k = SIZE-1;
        infoOut();
    }
    public static void twoVSthree() throws IOException {
        SIZE = 40000000;
        k = SIZE/2;
        infoOut();

        SIZE = 50000000;
        k = SIZE/2;
        infoOut();

        SIZE = 60000000;
        k = SIZE/2;
        infoOut();

        SIZE = 70000000;
        k = SIZE/2;
        infoOut();

        SIZE = 80000000;
        k = SIZE/2;
        infoOut();

        SIZE = 90000000;
        k = SIZE/2;
        infoOut();

        SIZE = 100000000;
        k = SIZE/2;
        infoOut();

        SIZE = 110000000;
        k = SIZE/2;
        infoOut();

        SIZE = 120000000;
        k = SIZE/2;
        infoOut();

        SIZE = 140000000;
        k = SIZE/2;
        infoOut();

        SIZE = 160000000;
        k = SIZE/2;
        infoOut();

        SIZE = 180000000;
        k = SIZE/2;
        infoOut();

        SIZE = 200000000;
        k = SIZE/2;
        infoOut();
    }


    // Output: info on SIZE and kth index chosen. Runs avgRuntime() method
    public static void infoOut() throws IOException {
        System.out.println("\n");
        System.out.println("SIZE: " + SIZE);
        System.out.print("k: " + k);
        avgRuntime();
    }

    // avgRuntime()
    // Utilizes file utility method to read text file as input to automate testing process
    // Output: updates global averager value and outputs runtime
    public static void avgRuntime() throws IOException {
        File f = new File("C:\\Users\\Gary\\IdeaProjects\\CS3310_Project2\\src\\input");
        FileInputStream fis = new FileInputStream(f);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        if (f.exists()) {
//            System.out.println("File Found");

            while(f.exists() && count != 24) {
                String something = br.readLine().trim();
                input = Integer.parseInt(something);
                if(input == 1) {
                    /** ALGORITHM 1 **/
//                    run_algorithm1(SIZE, k);
                } else if(input == 2) {
                    /** ALGORITHM 2 **/
                    run_algorithm2(SIZE, k);
                } else if(input == 3) {
                    /** ALGORITHM 3 **/
//                    run_algorithm3(SIZE, k);
                } else if(input == 4){
                    /** ALGORITHM 4 **/
//                    run_algorithm4(SIZE, k);
                } else {
                    double trueAvg = averager/5.0;
                    System.out.printf("\nAverage Runtime %.9f", trueAvg);
                    averager = 0.0;
                }
                count++;
            }
            fis.close();
            count = 0;
//            br.close();
        }
        else
            System.out.println("File Not Found");
    }

    /** Below functions run are responsible for calling Algorithm methods from classes defined in program **/
    public static void run_algorithm1 (int SIZE, int k) {
        Algorithm1 a1 = new Algorithm1();
        int[] arr = generateArr(SIZE);
//        printArr(arr);

        int i = 0;                  // for tracking time
        int totalTime = 0;
        long startTime, endTime;
        while (i!=1) {
//            System.out.println("Run #: " + i);
            startTime = System.nanoTime();
            a1.getK(arr, k);                   // algorithm runs here 5 times
            endTime = System.nanoTime();
            totalTime += endTime-startTime;
            i++;
        }

        double seconds = totalTime/1.0;
        seconds = seconds/1_000_000_000;
        averager+=seconds;
//        System.out.printf("Average Runtime %.9f", seconds);
//        System.out.print("\n");
    }
    public static void run_algorithm2 (int SIZE, int k) {
        Algorithm2 a2 = new Algorithm2();
        int[] arr2 = generateArr(SIZE);
//        printArr(arr2);

        int i = 0;                  // for tracking time
        int totalTime = 0;
        long startTime, endTime;
        while (i!=1) {
//            System.out.println("Run #: " + i);
            startTime = System.nanoTime();
            a2.getK(arr2, k);
//            printArr(arr2);
            endTime = System.nanoTime();
            totalTime += endTime-startTime;
            i++;
        }

        double seconds = totalTime/1.0;
        seconds = seconds/1_000_000_000;
        averager+=seconds;
//        System.out.printf("Average Runtime %.9f", seconds);
//        System.out.print("\n");
    }
    public static void run_algorithm3 (int SIZE, int k) {
        Algorithm3 a3 = new Algorithm3();
        int[] arr3 = generateArr(SIZE);
//        printArr(arr3);

        int i = 0;                  // for tracking time
        int totalTime = 0;
        long startTime, endTime;
        while (i!=1) {
//            System.out.println("Run #: " + i);
            startTime = System.nanoTime();
            a3.getK(arr3, k);
            endTime = System.nanoTime();
            totalTime += endTime-startTime;
            i++;
        }

        double seconds = totalTime/1.0;
        seconds = seconds/1_000_000_000;
        averager+=seconds;
//        System.out.printf("Average Runtime %.9f", seconds);
//        System.out.print("\n");
    }
    public static void run_algorithm4 (int SIZE, int k) {
        Algorithm4 a4 = new Algorithm4();
//        Test a4 = new Test();
        int[] arr4 = generateArr(SIZE);
//        printArr(arr4);

        int i = 0;                  // for tracking time
        int totalTime = 0;
        long startTime, endTime;
        while (i!=1) {
//            System.out.println("Run #: " + i);
            startTime = System.nanoTime();
            a4.getK(arr4, k);
//            a4.kthSmallest(arr4, 0, arr4.length-1,1);
            endTime = System.nanoTime();
            totalTime += endTime-startTime;
            i++;
        }

        double seconds = totalTime/1.0;
        seconds = seconds/1_000_000_000;
        averager+=seconds;;
//        System.out.printf("Average Runtime %.9f", seconds);
//        System.out.print("\n");
    }
    public static void run_array (int SIZE) {
        int totalTime = 0;
        long startTime, endTime;
        startTime = System.nanoTime();
        int[] arr = generateArr(SIZE);
        endTime = System.nanoTime();
        totalTime += endTime-startTime;
        double seconds = totalTime/1.0;
        seconds = seconds/1_000_000_000;
        averager+=seconds;
        System.out.printf("Average Runtime %.9f", seconds);
        System.out.print("\n");
    }

    // generateArr
    // Input: SIZE of array
    // Output: initializes and populates array
    public static int[] generateArr(int SIZE) {
//        System.out.println();
        int[] arr = new int[SIZE];
        Random r = new Random();
        for (int i=0; i<SIZE; i++) {
            arr[i] = r.nextInt(SIZE)+1;
        }
        return arr;
    }

    // printArr - for debugging
    // Input: arr of choice
    // Output: array values
    public static void printArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i] + " ]\n");
                break;
            }
            if (i == 0) {
                System.out.print("[ " + arr[i] + ", ");
            }
            else {
                System.out.print(arr[i] + ", ");
            }
        }
    }


}
