class RandomizedSet {
    private HashSet<Integer> hs;
    private ArrayList<Integer> list;
    private Random rnd;

    public RandomizedSet() {
        hs = new HashSet<>();
        list = new ArrayList<>();
        rnd = new Random();
    }

    public boolean insert(int val) {
        if (!hs.contains(val)) {
            hs.add(val);
            list.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (hs.contains(val)) {
            hs.remove(val);
            list.remove(Integer.valueOf(val)); // Remove the Integer object, not the index
            return true;
        }
        return false;
    }

    public int getRandom() {
        int index = rnd.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */