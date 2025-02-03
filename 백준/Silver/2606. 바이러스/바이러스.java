/*
1번 컴퓨터가 웜 바이러스에 걸렸을 때
네트워크 상에서 연결된 다른 컴퓨터들도 감염됨
1번 컴퓨터를 통해 감염되는 컴퓨터의 수를 구하면 됨

직접 연결된 컴퓨터뿐만 아니라 간접적으로 연결된 컴퓨터도 감염됨
이미 감염된 컴퓨터는 다시 세면 안 됨
1번 컴퓨터는 카운트에서 제외해야 함
*/

import java.io.*;
import java.util.*;

public class Main {
    static int cpuCnt; 
    static int[][] network; 
    static boolean[] visited; 
    static int infectedCnt; 
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        cpuCnt = Integer.parseInt(br.readLine()); 
        
        int connections = Integer.parseInt(br.readLine()); 
        
        network = new int[cpuCnt + 1][cpuCnt + 1];
        visited = new boolean[cpuCnt + 1]; 
        
        for(int i = 0; i < connections; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); 
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken()); 
            
            network[a][b] = network[b][a] = 1; 
        }
        
        dfs(1);
        
        System.out.println(infectedCnt - 1);
    }
    
    static void dfs(int cpu) {
        visited[cpu] = true;
        infectedCnt++; 
        
        for (int i = 1; i <= cpuCnt; i++) {
            if(network[cpu][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}

