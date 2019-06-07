package rooms;

import cohort.Cohort;

import java.util.ArrayList;
import java.util.Random;

public class Kitchen {

    ArrayList<foodAndDrink> foodStuffs;
    ArrayList<Cohort> students;

    public Kitchen(ArrayList<Cohort> students) {
        this.students = students;
        this.foodStuffs = new ArrayList<foodAndDrink>();
        this.populateArray();
    }

    public ArrayList<foodAndDrink> getFood(){
        return this.foodStuffs;
    }

    private void populateArray(){
        for(Cohort student : this.students) {
            foodAndDrink foodStuff = this.getRandomFood();
            this.foodStuffs.add(foodStuff);
        }
    }

    private foodAndDrink getRandomFood() {
        foodAndDrink[] food = foodAndDrink.values();
        Random random = new Random();
        return food[random.nextInt(food.length)];
    }

    public void eat(){
        for(Cohort student : students){
            int index = students.indexOf(student);
            foodAndDrink foodItem = foodStuffs.get(index);
            student.decreaseTiredness(foodItem.value);
        }
    }
}
