import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new int[M];

        BackTracking(0,1);

        bw.write(sb.toString());

        br.close();
        bw.close();
    }

    static void BackTracking(int depth, int start){

        if(depth == M){
            for(int i=0;i<M;i++){
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
        }
        else{
            for(int i=start;i<=N;i++){
                result[depth] = i;
                BackTracking(depth+1, i);
            }
        }
    }

}
