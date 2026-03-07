class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        rows.add(row);
        if(numRows == 1) return rows;

        for(int i = 1; i < numRows; i++){
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            List<Integer> prevRow = rows.get(i-1);
            for(int j = 0; j < prevRow.size()-1; j++){
                int val = prevRow.get(j) + prevRow.get(j+1);
                newRow.add(val);
            }
            newRow.add(1);
            rows.add(newRow);
        }

        return rows;
    }
}