
// instanceof Operator is used to test whether the object is an instance of the specified type (class or subclass or interface).

		// new Operator is "new" keyword that is used to create new object in java. 
		// new keyword is used to create new instance of class or array object in java. 
		// We can create an object for both built-in and user-defined classes using new keyword in java.
		// Creating an object is nothing but allocating memory for the object in the heap memory of the JVM.
		
		// Syntax
		// ClassName objectName/referenceVariable = new ClassName();
		// Ex : Student s = new Student();

		// Dot Operator is used to access the instance variables and methods of the class.
		// Ex : s.name = "John";
		// Ex : s.display();

		// Class Student{
		// 	String name;
		// 	int age;
		// 	void display(){
		// 		System.out.println("Name : " + name);
		// 		System.out.println("Age : " + age);
		// 	}
		// }
		
		// Student s = new Student();
		// s.name = "John";
		// s.age = 25;
		// s.display();

class carClass {
    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        carClass myCar = new carClass(); // Create a myCar object
        myCar.fullThrottle(); // Call the fullThrottle() method
        myCar.speed(200); // Call the speed() method
    }
}