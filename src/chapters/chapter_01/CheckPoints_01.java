
1.1 What are hardware and software?

In general, hardware comprises the visible,
physical elements of the computer, and software provides the invisible instructions that control
the hardware and make it perform specific tasks.

1.2 List five major hardware components of a computer.

■ A central processing unit (CPU)
■ Memory (main memory)
■ Storage devices (such as disks and CDs)
■ Input devices (such as the mouse and keyboard)
■ Output devices (such as monitors and printers)
■ Communication devices (such as modems and network interface cards)

1.3 What does the acronym “CPU” stand for?

Central Processing Unit

1.4 What unit is used to measure CPU speed?

MegaHertz MHz

1.5 What is a bit? What is a byte?

A bit is a binary digit 0 or 1.
A byte is a sequence of 8 bits.

1.6 What is memory for? What does RAM stand for? Why is memory called RAM?

Memory stores data and program instructions for the CPU to execute.

(RAM) is a volatile form of data storage: any information that has
been stored in memory (i.e., saved) is lost when the system’s power is turned off.

Since the bytes in the memory can
be accessed in any order, the memory is also referred to as random-access memory (RAM).

1.7 What unit is used to measure memory size?

The unit of measurement of
clock speed is the hertz (Hz), with 1 hertz equaling 1 pulse per second

1.10 What language does the CPU understand?

Assembly language

1.11 What is an assembly language?

Assembly language uses a short descriptive word, known as a mnemonic, to represent each of the
machine-language instructions.

1.12 What is an assembler?

computer cannot execute assembly language, another program—called an assembler—is used
to translate assembly-language programs into machine code

1.13 What is a high-level programming language?

They are platform independent, which means that you can write a program in a highlevel
language and run it in different types of machines. High-level languages are English-like
and easy to learn and use.

1.14 What is a source program?

A program written in a high-level language is called a source program or source code.
Because a computer cannot execute a source program, a source program must be translated
into machine code for execution.

1.15 What is an interpreter?

The translation can be done using another programming tool
called an interpreter or a compiler.
■ An interpreter reads one statement from the source code, translates it to the machine code
or virtual machine code, and then executes it right away

1.16 What is a compiler?

A compiler translates the entire source code into a machine-code file, and the
machine-code file is then executed

1.17 What is the difference between an interpreted language and a compiled language?

answer 15 and 16

1.18 What is an operating system? List some popular operating systems.

The operating system (OS) is the most important program that runs on a computer.
The OS manages and controls a computer’s activities.
The popular operating systems for general-purpose computers are Microsoft Windows, Mac
OS, and Linux.

1.19 What are the major responsibilities of an operating system?

■ Controlling and monitoring system activities
■ Allocating and assigning system resources
■ Scheduling operations

1.20 What are multiprogramming, multithreading, and multiprocessing?

Multiprogramming allows multiple programs to run simultaneously by sharing the same
CPU.
Multithreading allows a single program to execute multiple tasks at the same time.

Multiprocessing, or parallel processing, uses two or more processors together to perform
subtasks concurrently and then combine solutions of the subtasks to obtain a solution
for the entire task

1.21 Who invented Java? Which company owns Java now?

Java was developed by a team led by James Gosling
at Sun Microsystems.

1.22 What is a Java applet?

The server can serve any number of sessions simultaneously. Each session takes care of two
players. The client can be deployed to run as a Java applet. To run a client as a Java applet
from a Web browser, the server must run from a Web server.

1.23 What programming language does Android use?

java

1.24 What is the Java language specification?

The Java language specification is a technical definition of the Java programming
language’s syntax and semantics

1.25 What does JDK stand for?

The JDK consists of a set of separate programs, each invoked from a command line, for
developing and testing Java programs. Instead of using the JDK, you can use a Java development
tool

1.26 What does IDE stand for?

software that provides an integrated
development environment (IDE) for developing Java programs quickly. Editing, compiling,
building, debugging, and online help are integrated in one graphical user interface.

1.27 Are tools like NetBeans and Eclipse different languages from Java, or are they
dialects or extensions of Java?

------

1.28 What is a keyword? List some Java keywords.

abstract
assert
boolean
break
byte
case
catch
char
class
const
continue
default
do
double
else
enum
extends
final
finally
float
for
goto
if
implements
import
instanceof
int
interface
long
native
new
package
private
protected
public
return
short
static
strictfp*
super
switch
synchronized
this
throw
throws
transient
try
void
volatile
while

1.29 Is Java case sensitive? What is the case for Java keywords?

java is case sensitive

1.30 What is a comment? Is the comment ignored by the compiler? How do you denote a
comment line and a comment paragraph?

Comments
help programmers to communicate and understand the program. They are not programming
statements and thus are ignored by the compiler.

by two
slashes (//) on a line, called a line comment, or enclosed between /* and */ on one or several
lines, called a block comment or paragraph comment. When the compiler sees //, it ignores
all text after // on the same line. When it sees /*, it scans for the next */ and ignores any text
between /* and */

1.31 What is the statement to display a string on the console?

The main method in this program contains
the System.out.println statement.

1.32 Show the output of the following code:
public class Test {
public static void main(String[] args) {
System.out.println("3.5 * 4 / 2 – 2.5 is ");
System.out.println(3.5 * 4 / 2 – 2.5);
}

3.5*4/2-2.5
4.5

1.33 What is the Java source filename extension, and what is the Java bytecode filename
extension?

The source file must end with the extension .java and must have the same exact name
as the public class name. For example, the file for the source code in Listing 1.1 should
be named Welcome.java, since the public class name is Welcome.
a bytecode file with a .class
extension.

1.34 What are the input and output of a Java compiler?

----


1.35 What is the command to compile a Java program?

A Java compiler translates a Java source file into a Java bytecode file. The following command
compiles Welcome.java:
javac Welcome.java

1.36 What is the command to run a Java program?

Type 'javac MyFirstJavaProgram. java' and press enter to compile your code. 
If there are no errors in your code, the command prompt will take you to the next line
 (Assumption: The path variable is set). Now, type ' java MyFirstJavaProgram ' to run your program

1.37 What is the JVM?

Java Virtual Machine (JVM)The JVM
executes your code along with the code in the library.

1.38 Can Java run on any machine? What is needed to run Java on a computer?

To execute a Java program is to run the program’s bytecode. You can execute the bytecode
on any platform with a JVM, which is an interpreter. It translates the individual instructions
in the bytecode into the target machine language code one at a time rather than the whole program
as a single unit.

1.39 If a NoClassDefFoundError occurs when you run a program, what is the cause of
the error?

If you execute a class file that does not exist, a NoClassDefFoundError will occur.

1.40 If a NoSuchMethodError occurs when you run a program, what is the cause of the
error?

If you execute a class file that does not have a main method or you mistype the main
method (e.g., by typing Main instead of main), a NoSuchMethodError will occur.

1.42 What are syntax errors (compile errors), runtime errors, and logic errors?

Errors that are detected by the compiler are called syntax errors or compile errors. Syntax
errors result from errors in code construction
1 public class ShowSyntaxErrors {
2 public static main(String[] args) {
3 System.out.println("Welcome to Java);
4 }
5 }
Four errors are reported, but the program actually has two errors:
■ The keyword void is missing before main in line 2.
■ The string Welcome to Java should be closed with a closing quotation mark in line 3.

Runtime errors are errors that cause a program to terminate abnormally. They occur while
a program is running if the environment detects an operation that is impossible to carry out.
Input mistakes typically cause runtime errors.
for ex 1/0

1.43 Give examples of syntax errors, runtime errors, and logic errors.

1 public class ShowRuntimeErrors {
2 public static void main(String[] args) {
3 System.out.println(1 / 0);
4 }
5 }

Logic errors occur when a program does not perform the way it was intended to. Errors of
this kind occur for many different reasons. For example, suppose you wrote the program in
Listing 1.6 to convert Celsius 35 degrees to a Fahrenheit degree:
LISTING 1.6 ShowLogicErrors.java
1 public class ShowLogicErrors {
2 public static void main(String[] args) {
3 System.out.println("Celsius 35 is Fahrenheit degree ");
4 System.out.println((9 / 5) * 35 + 32);
5 }
6 }

Common Errors
Missing a closing brace, missing a semicolon, missing quotation marks for strings, and misspelling
names are common errors for new programmers.


You will get Fahrenheit 67 degrees, which is wrong. It should be 95.0. In Java, the division
for integers is the quotient—the fractional part is truncated—so in Java 9 / 5 is 1. To
get the correct result, you need to use 9.0 / 5, which results in 1.8

1.44 If you forget to put a closing quotation mark on a string, what kind error will be
raised?

A string must be placed inside the quotation marks. Often, a new programmer forgets to place
a quotation mark at the end of a string, as shown in the following example.
System.out.println("Problem Driven );

1.45 If your program needs to read integers, but the user entered strings, an error would
occur when running this program. What kind of error is this?

Logic error

1.46 Suppose you write a program for computing the perimeter of a rectangle and you
mistakenly write your program so that it computes the area of a rectangle. What kind
of error is this?
Syntax Error
