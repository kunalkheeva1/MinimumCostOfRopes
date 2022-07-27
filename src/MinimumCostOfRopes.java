import java.util.PriorityQueue;

public class MinimumCostOfRopes {


    //add the elements in such a way so that the cost(addition) becomes the least
    static long minimumCostOfRopes(long []arr, int n){
        long cost = 0;
        //add the all the elements in min heap
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i = 0; i<n; i++){
            pq.add(arr[i]);
        }
        //remove the smallest two elements and store them in a variable
        //then add that variable in minHeap and repeat the process,
        // in the mean time store that sum in cost and update it with the new ones everytime

        while(pq.size()>1){
            long a = pq.poll();
            long b = pq.poll();

            long c = a+b;
            pq.add(c);

            cost +=c;


        }return cost;
    }
    public static void main(String[] args) {

    }
}
