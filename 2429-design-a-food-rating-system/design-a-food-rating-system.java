class FoodRatings {
    class P {
        String food;
        String cuisine;
        int rating;

        P(String food, String cuisine, int rating) {
            this.food = food;
            this.cuisine = cuisine;
            this.rating = rating;
        }
    }

    Map<String, PriorityQueue<P>> cuisineToFood = new HashMap<>();
    Map<String, P> foodMap = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i=0; i<foods.length; i++) {
            String food = foods[i], cuisine = cuisines[i];
            int rating = ratings[i];

        if(!cuisineToFood.containsKey(cuisine)) cuisineToFood.put(cuisine, new PriorityQueue<>((p1,p2)->{
            if(p1.rating == p2.rating) return p1.food.compareTo(p2.food);
            return p2.rating-p1.rating;  
        }));

            P p = new P(food, cuisine, rating);

            cuisineToFood.get(cuisine).add(p);
            foodMap.put(food, p);
        }
    }
    
    public void changeRating(String food, int newRating) {
        P p = foodMap.get(food);
        P p2 = new P(food, p.cuisine, newRating);
        p.food = "";
        foodMap.put(food, p2);
        cuisineToFood.get(p2.cuisine).add(p2);
    }
    
    public String highestRated(String cuisine) {
        String food = cuisineToFood.get(cuisine).peek().food;
        while(food.equals("")) {
            cuisineToFood.get(cuisine).poll();
            food = cuisineToFood.get(cuisine).peek().food;
        }
        return food;
    }
}

