class Solution {
    Set<Integer> visited = new HashSet<>();
    Map<Integer, Set<Integer>> edgeMap = new HashMap<>();

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n == 1) return true;

        for(int i = 0; i < n; i++){
            edgeMap.put(i, new HashSet<>());
        }
        for(int i = 0; i < edges.length; i++){
            edgeMap.get(edges[i][0]).add(edges[i][1]);
            edgeMap.get(edges[i][1]).add(edges[i][0]); 
        }

        return dfs(source, destination);
    }
 
    boolean dfs(int source, int destination) {
        Set<Integer> set = edgeMap.get(source);
        if(set.contains(destination)) return true;

        for(int target: set) {
            if(visited.contains(target)) continue;
            visited.add(target);

            if(dfs(target, destination)) return true;
        }

        return false;
    }
}