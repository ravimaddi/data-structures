/*
Java is general purpose programming language, that is concurrent ,
class based , object oriented etc.

Java applications are typically compiled to bytecode that can be run 
only on Java virtual Machines (JVM) regardless of the computer
 architecture.
 JDK - It includes development tools such has JRE, Java compiler , Javadoc,
 Jar and a debugger.
 JRE - It contains the parts of java libraries required to run java 
 programs and it is intended for end users. JRE can be  view as a 
 subset of JDK.
 JVM -  It is a specification that provides a runtime environment in
 which java bytecode can be executed. JVMs are available for many 
 hardware and software platforms.

 When the java file is compiled it creates a byte file with .class 
 extensions. 

 For every thread JVM creates separate stack at the time of thread
 creation.Every method call performed by that thread is stored in the corresponding run-time stack including parameters, local variables, intermediate computations, and other data.

 The data stored in the stack is available for the corresponding thread and not available to the remaining threads. Hence we can say local data thread-safe. Each entry in the stack is called Stack Frame or Activation Record. 

 Each stack frame has 
 ---Local variable array
 
The local variables part of the stack frame is organized as a zero-based array of words.
It contains all parameters and local variables of the method.

 ---Operand stack
 JVM uses operand stack as workspace like rough work or we can say for storing intermediate calculation’s result.

 ---Frame data
 It contains all symbolic references (constant pool resolution) and normal method returns related to that particular method.
It also contains a reference to the Exception table which provides the corresponding catch block information in the case of exceptions.

 Identifiers - Identifier can be a variable name class name,
  method name or label.
  Only allowed characters are alphanumeric and $ and _. It should 
  not start with numbers. 
  Java identifiers are case sensitive. Reserved words can not be used 
  as identifiers.
 
  Naming convestions - use camel case.

  Java is statically typed language and strongly typed language.
  Two major types of data types 
  Primitve 
  Non- Primitive data types
Primitive Data Type: such as boolean, char, int, short,
byte, long, float, and double
Non-Primitive Data Type or Object Data type: such as String, Array, etc.

Primitive data are only single values and have no special capabilities.
There are 8 primitive data types
boolean booleanVar;
byte byteVar;
short shortVar;
int intVar;
long longVar;
float floatVar;
double doubleVar;
char charVar;

Non-Primitive Data Type or Reference Data Types
Strings
 Strings are defined as an array of characters.
 <String_Type> <string_variable> = “<sequence_of_string>”;
 String s = "Ravi Maddi";
 String s1 = new String("Ravi Maddi");

*/


package basics;
public class Hello {

   public static void main(String[] args) {
    System.out.println("hello");
  }
}