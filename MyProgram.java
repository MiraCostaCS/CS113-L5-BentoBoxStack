public class MyProgram{
    public static void main(String[] args) {
        // Example usage
        BentoBox myBento = new BentoBox();

        // add food Sushi
        // add Tempura
        // add Rice

        myBento.displayItems(); // Displays all items

        System.out.println("Peek: " + myBento.peekFood()); // Checks the top item

        myBento.removeFood(); // Removes the top item

        myBento.displayItems(); // Displays remaining items
    }
}
