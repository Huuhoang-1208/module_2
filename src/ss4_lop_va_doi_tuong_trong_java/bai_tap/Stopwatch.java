package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Random;

import static java.util.Arrays.sort;

public class Stopwatch {
    private long startTime;
    private long stoptime;

    public long getstartTime() {
            return startTime;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public long getstoptime(){
        return stoptime;
    }
    public void setStoptime(long stoptime){
        this.stoptime = stoptime;
    }
    public Stopwatch() {
        startTime = System.currentTimeMillis();
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        stoptime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return stoptime - startTime;
    }
        public static void main(String[] args) {
            int[] array = new int[100000];
            Random rand = new Random();

            for ( int i = 0; i < array.length; i++ ) {
                array[i] = rand.nextInt(10000);
            }
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.start();
            sort(array);
            stopwatch.stop();
            System.out.println("Thời gian cho bài toán sắp xếp trên là: " + stopwatch.getElapsedTime() + "miliseconds" );
        }
        public static void sort (int[] array) {
            int n = array.length;

            for (int i = 0; i < n - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < n; j++) {
                   if( array[j] < array[minIdx]) {
                   minIdx = j;
                   }
                }
                int temp = array[i];
                array [i] = array[minIdx];
                array [i] = temp;
            }
        }
    }
