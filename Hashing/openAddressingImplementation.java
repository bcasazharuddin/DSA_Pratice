
// Online Java Compiler
class MyHash {
    int[] arr;
    int cap, size;

    MyHash(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
        for (int i = 0; i < cap; i++) {
            arr[i] = -1; // -1 represents EMPTY
        }
    }

    int hash(int key) {
        return key % cap;
    }

    boolean insert(int key) {
        if (size == cap) {
            return false;
        }

        int i = hash(key);
        // Linear probing to find an empty slot (-1), a deleted slot (-2), or the key itself
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != key) {
            i = (i + 1) % cap;
        }

        if (arr[i] == key) {
            return false; // Key already exists
        }

        arr[i] = key;
        size++;
        return true;
    }

    boolean search(int key) {
        int h = hash(key);
        int i = h;
        while (arr[i] != -1) {
            if (arr[i] == key) {
                return true;
            }
            i = (i + 1) % cap;
            if (i == h) {
                return false;
            }
        }
        return false;
    }

    boolean erase(int key) {
        int h = hash(key);
        int i = h;
        while (arr[i] != -1) {
            if (arr[i] == key) {
                arr[i] = -2; // -2 represents DELETED (Tombstone)
                size--;      // CRITICAL: Decrement size to allow future inserts
                return true;
            }
            i = (i + 1) % cap;
            if (i == h) {
                return false;
            }
        }
        return false;
    }
}

public class openAddressingImplementation {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        MyHash mh = new MyHash(7);
        
        mh.insert(49); // hash(49) = 0
        mh.insert(56); // hash(56) = 0 -> collides, moves to index 1
        mh.insert(72); // hash(72) = 2
        
        // Search for 56
        if (mh.search(56)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // Erase 56
        mh.erase(56);
        
        // Try to erase 56 again (should fail)
        if (mh.erase(56)) {
             System.out.println("Yes");
        } else {
             System.out.println("No");
        }
    }
}