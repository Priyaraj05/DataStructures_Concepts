package DS.HashTablesDemo;

public class HashMain {
    public static void main(String[] args) {
        // HashTableScratch hashTableScratch = new HashTableScratch();
        // hashTableScratch.put(123, "rosy");
        // hashTableScratch.put(1,"john");
        // hashTableScratch.put(123,"riya");
        // hashTableScratch.put(11,"joe");
        // System.out.println(hashTableScratch.get(123));
        // hashTableScratch.remove(1);
        // //hashTableScratch.remove(111); // throws illegal state exception
        NonRepeatedFirstChar nrfc = new NonRepeatedFirstChar();
        var ch = nrfc.NonRepCharFn("greeng");
        System.out.println(ch);
        
    }
}
