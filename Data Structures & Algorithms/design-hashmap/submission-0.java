class MyHashMap {

    int[] arr;
    boolean[] exists;

    public MyHashMap() {
        arr = new int[1000001];
        exists = new boolean[1000001];
    }

    public void put(int key, int value) {
        arr[key] = value;
        exists[key] = true;
    }

    public int get(int key) {
        if (exists[key]) {
            return arr[key];
        }
        return -1;
    }

    public void remove(int key) {
        exists[key] = false;
    }
}