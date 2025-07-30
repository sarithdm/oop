public class Box {
    // Data members
    private double height;
    private double width;
    private double depth;
    
    // Constructor to initialize the box dimensions
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    // Default constructor
    public Box() {
        this.height = 0.0;
        this.width = 0.0;
        this.depth = 0.0;
    }
    
    
    
    // Member function to calculate volume
    public double volume() {
        return height * width * depth;
    }
    
    // Getter methods
    public double getHeight() {
        return height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getDepth() {
        return depth;
    }
    
    // Setter methods
    public void setHeight(double h) {
        height = h;
    }
    
    public void setWidth(double w) {
        width = w;
    }
    
    public void setDepth(double d) {
        depth = d;
    }
    
    // Method to display box information
    public void displayBox() {
        System.out.println("Box dimensions:");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
        System.out.println("Volume: " + volume());
    }
    
    // Main method to test the Box class
    public static void main(String[] args) {
        // Create a box using parameterized constructor
        Box box1 = new Box(10.5, 8.0, 6.5);
        System.out.println("Box 1:");
        box1.displayBox();
        
        System.out.println();
        
        // Create another box using default constructor
        Box box2 = new Box();
        box2.setHeight(5.0);
        box2.setWidth(4.0);
        box2.setDepth(3.0);
        System.out.println("Box 2:");
        box2.displayBox();
        
        System.out.println();
        
        // Calculate and display volumes
        System.out.println("Volume of Box 1: " + box1.volume());
        System.out.println("Volume of Box 2: " + box2.volume());
    }
}
