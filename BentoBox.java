// STEP 1: Import any necessary classes.
// Even though Java's has built-in Stack, we're going to use our own custom LinkedListStack instead.



// STEP 2: Declare the BentoBox class.
// This class will represent a container (Bento Box) that stores food items in a LIFO (Last-In, First-Out) stack structure.


    // STEP 3: Declare an instance variable called foodItems.
    // This will be a custom stack (LinkedListStack<Food>) used to store the food items inside the BentoBox.



    // STEP 4: Create a constructor for the BentoBox class.
    // The constructor should initialize the foodItems stack as a new, empty LinkedListStack.

        // Instantiate the foodItems stack. This ensures the BentoBox is ready to accept food items.



    // STEP 5: Define a method called addFood.
    // This method should take a Food object as input and push it onto the top of the foodItems stack.
    // It should also print a confirmation message to let the user know the food was added.

        // Push the new food item onto the top of the stack.

        // Print confirmation message (calls food's toString() method).



    // STEP 6: Define a method called removeFood.
    // This method removes the top item from the BentoBox stack.
    // If the box is empty, it should notify the user and return null.

        // Check if the stack is not empty before attempting to remove an item.

            // Remove the top item from the stack using pop().

            // Notify the user which item was removed.

            // Return the removed item.

            // Inform the user that the box is empty and no removal can occur.



    // STEP 7: Define a method called peekFood.
    // This method allows you to see the food item at the top of the stack without removing it.

        // Check if the stack is not empty before peeking.

            // Return the top item (does not remove it from the stack).

            // Inform the user that the BentoBox is empty.



    // STEP 8: Define a method called isEmpty.
    // This method checks if the BentoBox currently contains any food.
    
        // Returns true if the stack is empty, false otherwise.



    // STEP 9: Define a method called getFoodCount.
    // This method returns the number of food items currently stored in the BentoBox.

        // Use the size() method from LinkedListStack to get the current count.



    // STEP 10: Define a method called displayItems.
    // This method will visually display the contents of the BentoBox in a nicely formatted output.
    // public void displayItems() {
        // First, check if the BentoBox is empty.
        // if (!foodItems.isEmpty()) {
            // Print a heading to show BentoBox contents.
            // System.out.println("Bento Box contents:");
            // System.out.println("+---------------------+");

            // Use an enhanced for-loop to iterate through the stack.
            // Note: Your LinkedListStack class must support iteration for this to work.
            // for (Food food : foodItems) {
                // Display the formatted food details using the display() method from the Food class.
                // System.out.println(food.display());
                // Print a visual separator between food items.
                // System.out.println("+---------------------+");
        //     }
        // } else {
            // If the stack is empty, let the user know.
        //     System.out.println("The Bento Box is empty.");
        // }
    // }


    
