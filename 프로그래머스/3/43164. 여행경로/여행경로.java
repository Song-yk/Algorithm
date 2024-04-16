import java.util.*;
class Solution {
    static String[] answer = {};
    static boolean visited [];
    static ArrayList<String> routes;
    static String route;
    static int count = 0;
    public String[] solution(String[][] tickets) {

        visited = new boolean[tickets.length];
        routes = new ArrayList<>();
        
        
        DFS("ICN","ICN", tickets,count);
        Collections.sort(routes);

        
        return answer = routes.get(0).split(" ");
    }
    
    static void DFS(String start, String route, String [][] tickets, int count){
        if(count == tickets.length){
            routes.add(route);
            return;
        }
        for(int i = 0; i < tickets.length; i++){
            if(!visited[i] && start.equals(tickets[i][0])){
                visited[i] = true;
                DFS(tickets[i][1], route+" "+tickets[i][1], tickets, count+1);
                visited[i] = false;
            }
        }
    }
}