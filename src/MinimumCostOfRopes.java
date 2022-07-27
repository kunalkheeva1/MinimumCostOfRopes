import java.util.PriorityQueue;

public class MinimumCostOfRopes {

    static long minimumCostOfRopes(long []arr, int n){
        long cost = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i = 0; i<n; i++){
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            long a = pq.poll();
            long b = pq.poll();

            long c = a+b;


        }
    }
    public static void main(String[] args) {

    }
}
