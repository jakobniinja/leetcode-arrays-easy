package arrays;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    final int TOTAL_BUCKETS =  769;
     List<Integer>[] buckets;

    public MyHashSet() {
        buckets = new ArrayList[TOTAL_BUCKETS];

        for(int index = 0; index < TOTAL_BUCKETS; ++index)
            buckets[index] = new ArrayList<Integer>();
    }

    public void add(int key) {
        if(contains(key)){
            return;
        }
        int hashIndex = hashCode(key);
        buckets[hashIndex].add(key);
    }

    private int hashCode(int key) {
        return key % TOTAL_BUCKETS;
    }

    public void remove(int key) {
        int hasIndex =hashCode(key);
        List<Integer> rBucket = buckets[hasIndex];

        if(rBucket.size() == 0){
            return;
        }

        for (int i = 0; i < rBucket.size(); i++) {
            if(rBucket.get(i) == key)
                rBucket.remove(i);
        }
    }

    public boolean contains(int key) {
        int hasIndex = hashCode(key);
        List<Integer> rBucket = buckets[hasIndex];

        if(rBucket.size() == 0)
            return false;

        for (Integer slot: rBucket){
            if(slot == key)
                return true;
        }
        return false;
    }
}

