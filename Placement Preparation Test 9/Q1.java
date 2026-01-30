// Q.1) Count occurrence of letter ‘A’ with Big O(1) 
// Input:- String[] arr = { "A", "B", "C", "D", "E", "F", "F", "G", "A" };

import java.util.HashMap;

public class Q1 {

    public static void main(String[] args) {
        
        String[] arr = {"A", "B", "C", "D", "E", "F", "G", "A"};

        HashMap<String, Integer> freqMap = new HashMap<>();

        for(String item:arr){

            if(freqMap.containsKey(item)){
                freqMap.put(item, freqMap.get(item) + 1);
            } else{
                freqMap.put(item, 1);
            }
        }
        System.out.println("Count of A: " + freqMap.get("A"));
    }
}

