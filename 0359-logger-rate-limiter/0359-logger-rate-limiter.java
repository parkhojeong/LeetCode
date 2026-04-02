class Logger {

    Map<String, Integer> timestampMap = new HashMap<>();

    public Logger() {
        
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        int nextTimestamp = timestampMap.getOrDefault(message, 0);
        if(timestamp < nextTimestamp) return false;

        timestampMap.put(message, timestamp + 10);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */