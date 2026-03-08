class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        if(rowIndex == 0) return row;

        for(int i = 0; i < rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for(int j = 0; j <= i-1; j++) {
                newRow.add(row.get(j) + row.get(j+1));
            }
            newRow.add(1);
            row = newRow;
        }

        return row;
    }
}
