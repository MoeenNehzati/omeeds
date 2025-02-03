//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Let's work here for a while
//        A program is run one line at a time
//        Unless started with "//" All lines finish with a special character, either ";" or "}"
//        Lines that start with // will be overlooked by the compiler
//        In general excess white space does not matter, it's there for our own sake
//        Create a pointer to some value called name, its value is a string of characters "Omeed"
        //this is declaration
        String name;
//        this is variable assignment
        name = "original value";
//        you can have multiple assignment
        System.out.println("value of the variable name is:" + name);
        name = "secondary value";
        System.out.println("value of the variable name is:" + name);
        name = "teritary value";
        System.out.println("value of the variable name is:" + name);
//        But you cant have multiple declarations
//        String name;
        String surname = "Mahdavi";
        System.out.println(name + " " + surname);
        //you've seen what Strings are
        //now for numbers
//        these don't give the same result
        System.out.println("12" + "12");
        System.out.println(12 + 12);

        int integer;
        integer = 1;
        System.out.println(integer*100 + 1);

//        There are many different types of variables:
//        char: a single character
        char character = 'a';
//        double: A rational number
        double doubleValue = 3.22;
        System.out.println(doubleValue);

//        All of these are distinct! "3", '3', 3, 3.0
//      Functions are sensitive to the type of their arguments
//      function is a piece of code that that you call to run something
//      examples can be main, System.out.println
//        sensitive to input as in "12" * 2; causing an error
        String joined = String.join(",", "first", "second", "third");
        System.out.println(joined);
//        This will not work though
//        String.join(1, "first", "second", "third");
    }
}

//
//class Explanations {
//    public static void main(String[] args) {
////        Though barely legible, this is a language designed for us people to understand and not the computers themselves
////        All we do here is make explicit what we want from our system to do
////        There is a program called the "compiler" that translates this to something closed to what a machine may understand
////        That's called "Byte Code", which is generated as "*.class" files
////        To run a code, we pass the byte code to another program called the "Virtual Machine"(VM). VM is the interface between the byte code and the computer.
////        In this example, "Javac src/Main.java" will create the byte code
////        "Java src.Main" runs the created byte code
//    }
//}