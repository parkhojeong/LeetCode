function findContentChildren(g: number[], s: number[]): number {
    g.sort((a,b) => a-b);
    s.sort((a,b) => a-b);
    let idx = 0;
    let count = 0;
    
    g.forEach((value, index) => {
        while(idx < s.length) {
            if(value <= s[idx]) {
                idx += 1;
                count += 1;
                break;
            }
            idx += 1;
        }
    })
    
    return count;
};