class Solution {
    int getParent(int[] arr, int i){
        if(arr[i] == i) return i;
        return getParent(arr, arr[i]);
    }

    void unionParent(int[] arr, int i, int j) {
        int a = getParent(arr, i);
        int b = getParent(arr, j);
        if(a < b) {
            arr[b] = a;
        } else {
            arr[a] = b;
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i;
        }

        for(int i = 0; i < edges.length; i++) {
            unionParent(arr, edges[i][0], edges[i][1]);
        }

        return getParent(arr, source) == getParent(arr, destination);
    }
}