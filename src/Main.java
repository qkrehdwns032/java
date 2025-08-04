import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int M = Integer.parseInt(br.readLine());

            if(maxHeap.isEmpty() || M <= maxHeap.peek()){
                maxHeap.add(M);
            } else {
                minHeap.add(M);
            }

            if(maxHeap.size() > minHeap.size() + 1){
                minHeap.add(maxHeap.poll());
            } else if(minHeap.size() > maxHeap.size()){
                maxHeap.add(minHeap.poll());
            }

            bw.write(maxHeap.peek() + "\n");
        }

        br.close();
        bw.close();
    }
}
