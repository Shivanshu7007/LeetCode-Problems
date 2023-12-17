class FoodRatings {
    class Node{
        String food;
        String cuisine;
        int rating;
        
        Node(String food, int rating, String cuisine){
            this.food = food;
            this.rating = rating;
            this.cuisine = cuisine;
        }
    }

    Map<String, TreeSet<Node>> map = new HashMap<>();
    Map<String, Node> nodes = new HashMap<>();
    
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        Comparator<Node> comparator = (a,b) -> {
            return a.rating == b.rating ? a.food.compareTo(b.food) : b.rating - a.rating;
        };
        
        for(int i=0;i<foods.length;i++){
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            
            Node node = new Node(food, rating, cuisine);
            nodes.put(food, node);
                                                      
            map.computeIfAbsent(cuisine, a -> new TreeSet<Node>(comparator)).add(node);
        }
    }
    
    public void changeRating(String food, int newRating) {
        Node node = nodes.get(food);
        TreeSet<Node> set = map.get(node.cuisine);
        set.remove(node);
        node.rating = newRating;
        set.add(node);
    }
    
    public String highestRated(String cuisine) {
        return map.get(cuisine).first().food;
    }
}