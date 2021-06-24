# NaiveTicket

The second Objects lab, from the BlueJ book's second chapter.

First you need to FORK this repo into your account, then you need to CLONE that foreked repo, the one in your account. 
When you are finished with your code, be sure to ADD/COMMIT and PUSH your code to your repo.

Use the URL from your repo as the submission to the portal. 

Look for the [Chapter 2 file](./doc/BlueJ-objects-first-ch2.pdf) you need in the [doc](./doc) folder.
There is 35 pages of reading and exercises in the chapter.

Work through all these exercises. You edit this file with your answers for these exercises.

### Exercise 2.1
* Create a TicketMachine object on the object bench.
* Upon viewing its methods, `getBalance`, `getPrice`, `insertMoney`, `printTicket`.
* Use `getPrice` method to view the value of the price of the tickets that was set when this object was created.
* Use `insertMoney` method to simulate inserting an amount of money into the machine.
* Use `getBalance` to check that the machine has a record of the amount inserted.
    * You can insert several separate amounts of money into the machine, just like you might insert multiple coins or notes into a real machine. Try inserting the exact amount required for a ticket. As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the `printTicket` method. A facsimile ticket should be printed in the BlueJ terminal window.

### Exercise 2.2
* What value is returned if you check the machine’s balance after it has printed a ticket?
*** //The value returned after the ticket has been printed is 0

### Exercise 2.3
* Experiment with inserting different amounts of money before printing tickets.
    * Do you notice anything strange about the machine’s behavior? 
    ***  // The machine acts the same no matter the input.
    * What happens if you insert too much money into the machine – do you receive any refund?
    *** // We do not receive any refund if too much money is inserted into the machine.
    * What happens if you do not insert enough and then try to print a ticket? 
    ***  // If we do not instert enough money the ticket prints out with the ticket price and the total amount of money inserted.
    ***  // the behavior of the ticket machine does not change.

### Exercise 2.4
* Try to obtain a good understanding of a ticket machine’s behavior by interacting with it on the object bench before we start looking at how the `TicketMachine` class is implemented in the next section.

### Exercise 2.5
* Create another ticket machine for tickets of a different price.
    * Buy a ticket from that machine.
    * Does the printed ticket look different?
    ***  // It looks the same with the new price and the new total of money insterted.

### Exercise 2.6
* Write out what you think the outer wrappers of the `Student` and `LabClass` classes might look like – do not worry about the inner part.
*** // public class Student {...}
*** // public class LabClass {...}

### Exercise 2.7
Does it matter whether we write<br>
`public class TicketMachine`<br>
or<br>
`class public TicketMachine`<br>
in the outer wrapper of a class?
* // Yes it matters what order it is written.

* Edit the source of the `TicketMachine` class to make the change and then close the editor window.
    * Do you notice a change in the class diagram? 
    *** // Yes, TicketMachine is crossed out with hashes, meaning it cannot be compiled succesfully.
    * What error message do you get when you now press the compile button? 
    *** // the error message from making this change says "identifier expected".
    * Do you think this message clearly explains what is wrong?
    *** // I do not think that this clearly explains what is wrong.

### Exercise 2.8
* Check whether or not it is possible to leave out the word `public` from the outer wrapper of the `TicketMachine` class.
*** // Yes, it is possible.

### Exercise 2.9
* From your earlier experimentation with the ticket machine objects within BlueJ you can probably remember the names of some of the methods – `printTicket`, for instance.
    * Look at the class definition in Code 2.1 and use this knowledge, along with the additional information about ordering we have given you, to try to make a list of the names of the fields, constructors, and methods in the `TicketMachine` class.
    * Hint: There is only one constructor in the class.
    **** // Fields : price, balance, total, ticketNumber
    *** // Contructors : TicketMachine()
    *** // Methods : getPrice(), getTicketNumber(), getBalance(), insertMoney(), calculateTotal(), incrementTicketNumber(), printTicket()

### Exercise 2.10
* Do you notice any features of the constructor that make it significantly different from the other methods of the class?
* // The name of the constructor is the same as the class.

### Exercise 2.11
* What do you think is the type of each of the following fields?

```java
private int count; // type Integer 
private Student representative; // type String or non primitive object
private Server host; // type String or non primitive object
```

### Exercise 2.12
* What are the names of the following fields?

```java
private boolean alive; // field name is "alive"
private Person tutor; // field name is "tutor"
private Game game; // field name is "game"
```
### Exercise 2.13

In the following field declaration from the TicketMachine class<br>

```java
private int price;
```
does it matter which order the three words appear in? // Yes the order matters
* Edit the `TicketMachine` class to try different orderings. After each change, close the editor.
    * Does the appearance of the class diagram after each change give you a clue as to whether or not other orderings are
possible? 
*** // Yes it does, the field "price" needs to have it's "data type" defined first.
*** // It does not allow for compilation since the oder is not formated correctly. side-note; "private" can be removed
    * Check by pressing the compile button to see if there is an error message.
    * Make sure that you reinstantiate the original version after your experiments!

### Exercise 2.14
* Is it always necessary to have a semicolon at the end of a field declaration? 
*** // Yes, semicolons are always necessary, otherwise the code will give an error everytime.
*** // A semicolon at the end of a field declaration tells Java not to add on anything else.
* Once again, experiment via the editor.
* The rule you will learn here is an important one, so be sure to remember it.


### Exercise 2.15
* Write in full the declaration for a field of type `int` whose name is `status`.
*** // private int status;

### Exercise 2.16
* To what class does the following constructor belong?
```
public Student(String name)
```
*** // the constructor belongs to the "Student" class.

### Exercise 2.17
* How many parameters does the following constructor have and what are their types?
```
public Book(String title, double price)
```
*** // The contructor has 2 parameters. 
*** // title is a type String, price is a type double.

### Exercise 2.18
* Can you guess what types some of the `Book` class’s fields might be?
*** // Fields: String - Title, double - Price, String - Cover(hardcover/paperback), Integer - Page numbers, String - Genre.
* Can you assume anything about the names of its fields?
*** // Yes, you can assume that the names of its fields may relate to the parameters that may be in the contructor.

READ upto and INCLUDING section 2.15 of this chapter.
