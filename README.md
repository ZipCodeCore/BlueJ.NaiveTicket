# NaiveTicket

The second Objects lab, from the BlueJ book's second chapter.

Look for the [Chapter 2 file](./doc/BlueJ-objects-first-ch2.pdf) you need in the [doc](./doc) folder.
There is 35 pages of reading and exercises in the chapter.

Work through all these exercises. You edit this file with your answers for these exercises.

### Exercise 2.1
* Create a TicketMachine object on the object bench.
TicketMachine naiveTicketMachine = new TicketMachine(400);
   
* Upon viewing its methods, `getBalance`, `getPrice`, `insertMoney`, `printTicket`.
* Use `getPrice` method to view the value of the price of the tickets that was set when this object was created. 
400
* Use `insertMoney` method to simulate inserting an amount of money into the machine.
 I inserted 500
* Use `getBalance` to check that the machine has a record of the amount inserted.
	* You can insert several separate amounts of money into the machine, just like you might insert multiple coins or notes into a real machine. Try inserting the exact amount required for a ticket. As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the `printTicket` method. A facsimile ticket should be printed in the BlueJ terminal window.
	It says I have 500.  I have enough money in the machine so once I print Ticket it says "Ticket Price: 400 cents.  Your total is 500."

### Exercise 2.2
* What value is returned if you check the machine’s balance after it has printed a ticket?
The balance now says 0.


### Exercise 2.3
* Experiment with inserting different amounts of money before printing tickets.
	* Do you notice anything strange about the machine’s behavior?
	After you print a ticket, the balance goes back to 0 no matter what.  Whenever you buy a ticket the total amount inserted is given, not just what you put in. 
	* What happens if you insert too much money into the machine – do you receive any refund?
	No, there is no refund given and the balance reverts back to zero
	* What happens if you do not insert enough and then try to print a ticket? 
	It says "Ticket Price 400 cents.  Your total is 300."  It still seems like it is printing a ticket.

### Exercise 2.4
* Try to obtain a good understanding of a ticket machine’s behavior by interacting with it on the object bench before we start looking at how the `TicketMachine` class is implemented in the next section.

### Exercise 2.5
* Create another ticket machine for tickets of a different price.
	* Buy a ticket from that machine.
	* Does the printed ticket look different?
	No, the tickets look the same except for the Ticket Price is now 700  Ex.)
	"Ticket Price 700 cents.  Your total is 600."

### Exercise 2.6
* Write out what you think the outer wrappers of the `Student` and `LabClass` classes might look like – do not worry about the inner part.
public class Student {}
public class LabClass {}


### Exercise 2.7
Does it matter whether we write<br>
`public class TicketMachine`<br>
or<br>
`class public TicketMachine`<br>
in the outer wrapper of a class?
Yes, it does matter

* Edit the source of the `TicketMachine` class to make the change and then close the editor window.
	* Do you notice a change in the class diagram?
	Yes, the class now has a red criss cross pattern thru it.
	* What error message do you get when you now press the compile button?
	It says <identifer> expected
	* Do you think this message clearly explains what is wrong?
	For the most part, yes, as the class hasn't been identified correctly.  The public has to be first - it could also be private, so it identifies which it is for that particular class.

### Exercise 2.8
* Check whether or not it is possible to leave out the word `public` from the outer wrapper of the `TicketMachine` class.
Yes, you can as that compiled with no syntax errors.

### Exercise 2.9
* From your earlier experimentation with the ticket machine objects within BlueJ you can probably remember the names of some of the methods – `printTicket`, for instance.
	* Look at the class definition in Code 2.1 and use this knowledge, along with the additional information about ordering we have given you, to try to make a list of the names of the fields, constructors, and methods in the `TicketMachine` class.
	* Hint: There is only one constructor in the class.
	The fields are:
// The price of a ticket from this machine.
    private Integer price;
    // The amount of money entered by a customer so far.
    private Integer balance;
    // The total amount of money collected by this machine.
    private Integer total;
    // The number of tickets printed.
    private Integer ticketNumber;

The constructor method is:
public TicketMachine(Integer ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
        ticketNumber = 0;
    } 
The methods are:
public Integer getPrice()
public Integer getTicketNumber()
public Integer getBalance()
public Integer insertMoney(Integer amount)
public Integer calculateTotal()
public Integer incrementTicketNumber()
public String printTicket()

### Exercise 2.10
* Do you notice any features of the constructor that make it significantly different from the other methods of the class?
No, it is not significantly different, but the constructor is used to initialize an object and it doesn't return any value. 

### Exercise 2.11
* What do you think is the type of each of the following fields?

```java
private int count;
int
private Student representative;
Student

private Server host;
Server
```

### Exercise 2.12
* What are the names of the following fields?

```java
private boolean alive;
alive
private Person tutor;
tutor
private Game game;
game
```
### Exercise 2.13

In the following field declaration from the TicketMachine class<br>

```java
private int price;
```
does it matter which order the three words appear in?
* Edit the `TicketMachine` class to try different orderings. After each change, close the editor.
	* Does the appearance of the class diagram after each change give you a clue as to whether or not other orderings are
possible?
	* Check by pressing the compile button to see if there is an error message.
	* Make sure that you reinstantiate the original version after your experiments!

Yes it does matter the order that you put them.  It gives you an error cannot find symbol.

### Exercise 2.14
* Is it always necessary to have a semicolon at the end of a field declaration?
* Once again, experiment via the editor.
* The rule you will learn here is an important one, so be sure to remember it.
Yes, you must have a semicolon at the end of a field declaration otherwise you'll get an error.


### Exercise 2.15
* Write in full the declaration for a field of type `int` whose name is `status`.
private int status;

### Exercise 2.16
* To what class does the following constructor belong?
```
public Student(String name)
```
It belongs to the Student class

### Exercise 2.17
* How many parameters does the following constructor have and what are their types?
```
public Book(String title, double price)

It has two parameters - a title of type String and a price of type double
```

### Exercise 2.18
* Can you guess what types some of the `Book` class’s fields might be?
author, number of pages, paperback or hardback, genre, price, cover material, etc.
* Can you assume anything about the names of its fields?
Yes, it gives you some details of what things the book has and you can probably tell what data type they should be by looking at them. 

READ upto and INCLUDING section 2.15 of this chapter.
