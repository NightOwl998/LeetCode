class RandomizedSet {
    HashSet<Integer> elements;

    public RandomizedSet() {
        this.elements=new HashSet<>();
        
    }
    
    public boolean insert(int val) {
        return this.elements.add(val);
        
    }
    
    public boolean remove(int val) {
        return this.elements.remove(val);
        
    }
    
    public int getRandom() {
        Random rand=new Random();
        int randi=rand.nextInt(this.elements.size());
        List<Integer> elements_=new ArrayList<>(this.elements);
        return elements_.get(randi);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */