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
* Upon viewing its methods, `getBalance`, `getPrice`, `insertMoney`, `printTicket`:
	* Use `getPrice` method to view the value of the price of the tickets that was set when this object was created.
		* I set it to 500
	* Use `insertMoney` method to simulate inserting an amount of money into the machine.
		* I inserted 700
	* Use `getBalance` to check that the machine has a record of the amount inserted.
		* Yes - balance is 700
	* You can insert several separate amounts of money into the machine, just like you might insert multiple coins or notes into a real machine. Try inserting the exact amount required for a ticket. As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the `printTicket` method. A facsimile ticket should be printed in the BlueJ terminal window.
		* gives a string: "Ticket price: 500 cents. Your total is 700."

### Exercise 2.2
* What value is returned if you check the machine’s balance after it has printed a ticket?
	* 0, which seems bad

### Exercise 2.3
* Experiment with inserting different amounts of money before printing tickets.
	* Do you notice anything strange about the machine’s behavior?
		* When I insert 400 after inserting 700 and printing a ticket, the ticket prints, thinking that I've inserted 1100. The balance also seems to blank out after printing
	* What happens if you insert too much money into the machine – do you receive any refund?
		* nope!
	* What happens if you do not insert enough and then try to print a ticket?
		* still seems to work: same sentence as before, with 400 instead of 500. That's bad.

### Exercise 2.4
* Try to obtain a good understanding of a ticket machine’s behavior by interacting with it on the object bench before we start looking at how the `TicketMachine` class is implemented in the next section.
	* Seems that it doesn't really check the amount that's inserted, and it zeroes the balance when printing.

### Exercise 2.5
* Create another ticket machine for tickets of a different price.
	* Buy a ticket from that machine.
		* OK
	* Does the printed ticket look different?
		* just the price is different

### Exercise 2.6
* Write out what you think the outer wrappers of the `Student` and `LabClass` classes might look like – do not worry about the inner part.
	* `public class Student`
	* `public class LabClass`

### Exercise 2.7
Does it matter whether we write<br>
`public class TicketMachine`<br>
or<br>
`class public TicketMachine`<br>
in the outer wrapper of a class?
* Edit the source of the `TicketMachine` class to make the change and then close the editor window.
	* Do you notice a change in the class diagram?
		* it didn't seem to change, other than the cross-hatching about the error
	* What error message do you get when you now press the compile button?
		* `<identifier expected>`
	* Do you think this message clearly explains what is wrong?
		* I suppose - I'm inferring from this that immediately following `class`, it expects the name of the class. If that's correct, then I guess that it's clear.

### Exercise 2.8
* Check whether or not it is possible to leave out the word `public` from the outer wrapper of the `TicketMachine` class.
	* It is, which surprised me. I thought that you had to have a public class (and only one) in each file.

### Exercise 2.9
* From your earlier experimentation with the ticket machine objects within BlueJ you can probably remember the names of some of the methods – `printTicket`, for instance.
	* Look at the class definition in Code 2.1 and use this knowledge, along with the additional information about ordering we have given you, to try to make a list of the names of the fields, constructors, and methods in the `TicketMachine` class.
	* Hint: There is only one constructor in the class.
		* Constructor: `TicketMachine` (which is what the constructor has to be called - this one takes the input `int ticketCost`)
		* Fields: `price`, `balance`, `total`
		* Methods: `getPrice()`, `getBalance()`, `insertMoney()`, `printTicket()`

### Exercise 2.10
* Do you notice any features of the constructor that make it significantly different from the other methods of the class?
	* Doesn't return (explicitly) anything, doesn't have a declared type (except that the name is the type)
	
### Exercise 2.11
* What do you think is the type of each of the following fields?

```java
private int count;
private Student representative;
private Server host;
```
* `int`, `Student`, `Server`

### Exercise 2.12
* What are the names of the following fields?

```java
private boolean alive;
private Person tutor;
private Game game;
```

* `alive`, `tutor`, `game`

### Exercise 2.13

In the following field declaration from the TicketMachine class<br>

```java
private int price;
```
does it matter which order the three words appear in?
* Edit the `TicketMachine` class to try different orderings. After each change, close the editor.
	* Does the appearance of the class diagram after each change give you a clue as to whether or not other orderings are
possible?
		* Just the error indication when changing - only the given order works
	* Check by pressing the compile button to see if there is an error message.
	* Make sure that you reinstantiate the original version after your experiments!
		* OK

### Exercise 2.14
* Is it always necessary to have a semicolon at the end of a field declaration?
	* Yes - that's a complete statement
* Once again, experiment via the editor.
	* Yup.
* The rule you will learn here is an important one, so be sure to remember it.


### Exercise 2.15
* Write in full the declaration for a field of type `int` whose name is `status`.
	* `private int status;`

### Exercise 2.16
* To what class does the following constructor belong?
```
public Student(String name)
```
	* `Student`

### Exercise 2.17
* How many parameters does the following constructor have and what are their types?
```
public Book(String title, double price)
```
	* 2: `String` and `double`

### Exercise 2.18
* Can you guess what types some of the `Book` class’s fields might be?
	* title: `String`, price: `double` (it could have more fields that are auto-set, but in this case, only an internal id number seems likely, as author, year, etc. would need more info input. It's also possible that there are other constructors that take more inputs, and that this is a bare-minimum constructor).
* Can you assume anything about the names of its fields?
	* No - we can assign these dummy variables to different names in the constructor.
READ upto and INCLUDING section 2.15 of this chapter.
