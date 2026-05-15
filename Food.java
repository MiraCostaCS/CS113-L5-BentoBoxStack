import java.util.ArrayList;
import java.util.Arrays;

public class Food {
    /*** CONSTANT VARIABLES ***/
    private final static ArrayList<String> DEFAULT_ORIGIN = new ArrayList<>(Arrays.asList("Mexico"));
    private final static String DEFAULT_CELEBRATION = "Christmas";
    private final static String DEFAULT_NAME_OF_DISH = "Tamales";
    private final static String DEFAULT_DESCRIPTION = "Savory, dough filled with chicken and a green spicy sauce.";

    /*** INSTANCE VARIABLES ***/
    private ArrayList<String> origin;
    private String celebration;
    private String nameOfDish;
    private String description;

    /*** CONSTRUCTOR METHODS ***/
    public Food(){
        this.origin = new ArrayList<>(DEFAULT_ORIGIN);
        this.celebration = DEFAULT_CELEBRATION;
        this.nameOfDish = DEFAULT_NAME_OF_DISH;
        this.description= DEFAULT_DESCRIPTION;
    }

    public Food(ArrayList<String> origin, String celebration, String nameOfDish, String description){
        if(!this.setAll(origin, celebration, nameOfDish, description))
        {
            System.out.println("ERROR: Bad data given to full constructor. \nShutting down . . .");
            System.exit(0);
        }
    }

    public Food(Food original){
        if(original != null){
            this.setAll(new ArrayList<>(original.origin), original.celebration, original.nameOfDish, original.description);
        }else {
            System.out.println("ERROR: copy constructor given NULL. Shutting down...");
            System.exit(0);
        }
    }

    /*** MUTATOR METHODS (SETTERS) ***/
    public boolean setOrigin(ArrayList<String> origin) {
        if (origin != null && !origin.isEmpty()) {
            this.origin = new ArrayList<>(origin); // Assign a new list to prevent external modification
            return true;
        } else {
            return false;
        }
    }

    public boolean setCelebration( String celebration){
        if(!celebration.isEmpty() && celebration!= null){
            this.celebration = celebration;
            return true;
        } else {
            return false;
        }
    }

    public boolean setNameOfDish(String nameOfDish) {
        if (nameOfDish != null && !nameOfDish.isEmpty()) {
            this.nameOfDish = nameOfDish;
            return true;
        } else {
            return false;
        }
    }

    public boolean setDescription(String description) {
        if (description != null && !description.isEmpty()) {
            this.description = description;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAll(ArrayList<String> origin, String celebration, String nameOfDish, String description) {
        return setOrigin(origin) & setCelebration(celebration) & setNameOfDish(nameOfDish) & setDescription(description);
    }

    /*** ACCESSOR METHODS (GETTERS) ***/
    public ArrayList<String> getOrigin() {
        return new ArrayList<>(origin);
    }

    public String getCelebration() {
        return celebration;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    /*** OTHER REQUIRED METHODS ***/
    /**
     * String of all instance variables, no newline character at end of String.
     *
     * @return String containing description and date, separated by a space
     */
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        str.append("Dish Name: ").append(nameOfDish).append("\n")
                .append("Origin: ").append(String.join(", ", origin)).append("\n")
                .append("Celebration: ").append(celebration).append("\n")
                .append("Description: ").append(description);
        return str.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Food && obj != null) {
            Food otherFood = (Food) obj;
            return origin.equals(otherFood.origin) &&
                    celebration.equals(otherFood.celebration) &&
                    nameOfDish.equals(otherFood.nameOfDish) &&
                    description.equals(otherFood.description);
        }
        return false;
    }


}
