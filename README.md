# Box Class - Java OOP Example

This repository contains a Java program demonstrating Object-Oriented Programming concepts with a `Box` class.

## 📋 Program Overview

The `Box` class implements a simple geometric object with the following features:

- **Data Members**: `height`, `width`, `depth` (private double variables)
- **Constructors**: Parameterized and default constructors
- **Methods**: Volume calculation, getters, setters, and display functionality

## 🔗 Source Code

**Main Program**: [Box.java](https://github.com/sarithdm/oop/blob/master/Box.java)

## 🚀 Features

### Data Members
- `private double height` - Height of the box
- `private double width` - Width of the box  
- `private double depth` - Depth of the box

### Constructors
- **Parameterized Constructor**: `Box(double height, double width, double depth)`
- **Default Constructor**: `Box()` - Initializes all dimensions to 0.0

### Methods
- `double volume()` - Calculates and returns the volume (height × width × depth)
- `getHeight()`, `getWidth()`, `getDepth()` - Getter methods
- `setHeight()`, `setWidth()`, `setDepth()` - Setter methods
- `displayBox()` - Displays box information and volume

## 📖 Usage Example

```java
// Create a box with specific dimensions
Box box1 = new Box(10.5, 8.0, 6.5);
box1.displayBox();

// Create a box using default constructor
Box box2 = new Box();
box2.setHeight(5.0);
box2.setWidth(4.0);
box2.setDepth(3.0);

// Calculate volume
double volume = box2.volume();
System.out.println("Volume: " + volume);
```

## 🏃‍♂️ How to Run

1. **Compile the program:**
   ```bash
   javac Box.java
   ```

2. **Run the program:**
   ```bash
   java Box
   ```

## 📊 Sample Output

```
Box 1:
Box dimensions:
Height: 10.5
Width: 8.0
Depth: 6.5
Volume: 546.0

Box 2:
Box dimensions:
Height: 5.0
Width: 4.0
Depth: 3.0
Volume: 60.0

Volume of Box 1: 546.0
Volume of Box 2: 60.0
```

## 🎯 Learning Objectives

This program demonstrates:
- **Encapsulation**: Private data members with public methods
- **Constructors**: Both parameterized and default constructors
- **Method Implementation**: Business logic in member functions
- **Object Creation**: Instantiating objects and calling methods
- **Data Validation**: Using getters and setters for controlled access

## 🔧 Requirements

- Java Development Kit (JDK) 8 or higher
- Any Java IDE or text editor
- Command line/terminal for compilation and execution

## 👨‍💻 Author

**sarithdm** - [GitHub Profile](https://github.com/sarithdm)

## 📝 Repository

This code is part of the OOP (Object-Oriented Programming) repository:
- **Repository**: [https://github.com/sarithdm/oop](https://github.com/sarithdm/oop)
- **Direct Link to Box.java**: [https://github.com/sarithdm/oop/blob/master/Box.java](https://github.com/sarithdm/oop/blob/master/Box.java)

---

### 📚 Related Concepts
- Object-Oriented Programming (OOP)
- Java Classes and Objects
- Encapsulation
- Constructor Overloading
- Method Implementation
