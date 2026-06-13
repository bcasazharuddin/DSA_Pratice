class DATHashing {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        DAT dat = new DAT();
        dat.insert(10);
        dat.insert(20);
        dat.insert(19);
        System.out.println(dat.search(10));
        System.out.println(dat.search(20));
        dat.del(119);
        System.out.println(dat.search(119));
    }
}

class DAT{
    int[] table = new int[1000];
    void insert(int i){
        table[i] = 1;
    }
    void del(int i){
        table[i] = 0;
    }
    
    int search(int i){
        return table[i];
    }
}