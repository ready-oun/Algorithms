import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        int N = Integer.parseInt(br.readLine());
        int[] original = new int[N]; 
        
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(st.nextToken()); 
        }
        
        ArrayList<Integer> sorted = new ArrayList<>(); 
        for (int num : original) {
            sorted.add(num); 
        }
        Collections.sort(sorted); 
        
        HashMap<Integer, Integer> rankMap = new HashMap<>(); 
        int rank = 0; 
        for (int i = 0; i < sorted.size(); i++) {
            if(!rankMap.containsKey(sorted.get(i))) {
                rankMap.put(sorted.get(i), rank++);
            }
        }
        
        StringBuilder sb = new StringBuilder(); 
        for (int num : original) {
            sb.append(rankMap.get(num)).append(" "); 
        }
        System.out.println(sb); 
        br.close(); 
    }
}