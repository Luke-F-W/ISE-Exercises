import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreadsEx{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter end number: ");
        int targetNumber = obj.nextInt();
        System.out.println("Enter thread number: ");
        int threadNumber = obj.nextInt();

        List<SumTask> tasks = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();

        int chunkSize = targetNumber / threadNumber;
        int currentChunkBoundEnd = 0;
        int currentChunkBoundStart = 1;

        for(int p = 0; p < threadNumber; p++){
            if(p + 1 == threadNumber){
                currentChunkBoundEnd = targetNumber;
            }
            else{
                currentChunkBoundEnd += chunkSize;
            }
            SumTask ta1 = new SumTask(currentChunkBoundStart, currentChunkBoundEnd);
            Thread th1 = new Thread(ta1);
            tasks.add(ta1);
            threads.add(th1);

            currentChunkBoundStart = currentChunkBoundEnd + 1;
        }
        for(Thread x : threads){
            x.start();
        }

        for(Thread y : threads){
            try{
                y.join();
            }
            catch(Exception e){
                System.out.println("Error");
            }
        }
        long totalNo = 0;
        for(SumTask z : tasks){
            long toAdd = z.getPartialSum();
            totalNo += toAdd;
        }
        System.out.println("Total Number: " + totalNo);
    }        
}


class SumTask implements Runnable{

    private int start;
    private int end;
    private long partialSum;

    public SumTask(int start, int end){
        this.start = start;
        this.end = end;
    }
    
    public long getPartialSum(){
        return partialSum;
    }


    @Override
    public void run() {
        for(int i = start; i <= end; i++){
            partialSum = partialSum + i;
        }
    }
    
}
