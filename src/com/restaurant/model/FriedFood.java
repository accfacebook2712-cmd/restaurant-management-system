public class FriedFood {
    // Attributes of FriedFood class
    private String name;
    private String type;
    private int calories;

    // Constructor
    public FriedFood(String name, String type, int calories) {
        this.name = name;
        this.type = type;
        this.calories = calories;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}