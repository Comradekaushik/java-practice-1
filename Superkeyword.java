
// import Classes.* ;
import Classes.test.*;


// The Keyword “super” came into the picture with the concept of Inheritance.
// Characteristics of Super Keyword in Java
// In Java, super keyword is used to refer to the parent class of a subclass. Here are some of its key characteristics:

// super is used to call a superclass constructor: When a subclass is created, its constructor must call the constructor of its parent class. This is done using the super() keyword, which calls the constructor of the parent class.
// super is used to call a superclass method: A subclass can call a method defined in its parent class using the super keyword. This is useful when the subclass wants to invoke the parent class’s implementation of the method in addition to its own.
// super is used to access a superclass field: A subclass can access a field defined in its parent class using the super keyword. This is useful when the subclass wants to reference the parent class’s version of a field.
// super must be the first statement in a constructor: When calling a superclass constructor, the super() statement must be the first statement in the constructor of the subclass.
// super cannot be used in a static context: The super keyword cannot be used in a static context, such as in a static method or a static variable initializer.
// super is not required to call a superclass method: While it is possible to use the super keyword to call a method in the parent class, it is not required. If a method is not overridden in the subclass, then calling it without the super keyword will invoke the parent class’s implementation.


// Use of super keyword in Java
// It is majorly used in the following contexts as mentioned below:

// Use of super with Variables
// Use of super with Methods
// Use of super with Constructors


// super keyword in java example 


// Base class vehicle 
// class Vehicle { 
// 	int maxSpeed = 120; 
// } 

// // sub class Car extending vehicle 
// class Car extends Vehicle { 
// 	int maxSpeed = 180; 

// 	void display() 
// 	{ 
// 		// print maxSpeed of base class (vehicle) 
// 		System.out.println("Maximum Speed: "
// 						+ super.maxSpeed); 
// 	} 
// } 

// // Driver Program 
// class Test { 
// 	public static void main(String[] args) 
// 	{ 
// 		Car small = new Car(); 
// 		small.display(); 
// 	} 
// }



// 2. Use of super with Methods
// This is used when we want to call the parent class method. So whenever a parent and child class have the same-named methods then to resolve ambiguity we use the super keyword.

// This code snippet helps to understand the said usage of the super keyword.

// Example


// // super keyword in java example 
  
// // superclass Person 
// class Person { 
//     void message() 
//     { 
//         System.out.println("This is person class\n"); 
//     } 
// } 
// // Subclass Student 
// class Student extends Person { 
//     void message() 
//     { 
//         System.out.println("This is student class"); 
//     } 
//     // Note that display() is 
//     // only in Student class 
//     void display() 
//     { 
//         // will invoke or call current 
//         // class message() method 
//         message(); 
  
//         // will invoke or call parent 
//         // class message() method 
//         super.message(); 
//     } 
// } 
// // Driver Program 
// class Test { 
//     public static void main(String args[]) 
//     { 
//         Student s = new Student(); 
  
//         // calling display() of Student 
//         s.display(); 
//     } 
// }
// Output
// This is student class
// This is person class


// 3. Use of super with constructors
// The super keyword can also be used to access the parent class constructor. One more important thing is that ‘super’ can call both parametric as well as non-parametric constructors depending on the situation. 

// Following is the code snippet to explain the above concept:

// Example 1


// // Java Code to show use of 
// // super keyword with constructor 
  
// // superclass Person 
// class Person { 
//     Person() 
//     { 
//         System.out.println("Person class Constructor"); 
//     } 
// } 
  
// // subclass Student extending the Person class 
// class Student extends Person { 
//     Student() 
//     { 
//         // invoke or call parent class constructor 
//         super(); 
  
//         System.out.println("Student class Constructor"); 
//     } 
// } 
  
// // Driver Program 
// class Test { 
//     public static void main(String[] args) 
//     { 
//         Student s = new Student(); 
//     } 
// }
// Output
// Person class Constructor
// Student class Constructor





public class Superkeyword {
    public static void main (String[] args){
        Professor Gukrowski = new Professor("Gukrowski",522);
        Gukrowski.Display();



    }
    
}
