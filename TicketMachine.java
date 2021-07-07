/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private Integer price;
    // The amount of money entered by a customer so far.
    private Integer balance;
    // The total amount of money collected by this machine.
    private Integer total;
    // The number of tickets printed.
    private Integer ticketNumber;
    // Entering a new price for the ticket.
    private Integer newPrice;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(Integer ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
        ticketNumber = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public Integer getPrice()
    {
        return price;
    }

    /**
     * Return ticketNumber.
     * (Increments on each print.)
     */
    public Integer getTicketNumber()
    {
        return ticketNumber;
    }

    /**
     * Return the total amount of money inserted into the machine
     */
    public Integer getTotal()
    {
        return total;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     *
    public Integer getBalance()
    {
        return balance;
    }

    public String prompt(){
        return "Please insert the correct amount of money.";
    }

    /**
     * Display the price of the ticket on the terminal
     * We return a String rather than System.out.println
     * because it prints easier when the method is called
     */
    public String showPrice(){
        return "The price of a ticket is " + price + " cents.";
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public Integer insertMoney(Integer amount)
    {
        if(amount <= 0){
            System.out.println("Invalid amount.");
            return balance;
        } else {
            balance = balance + amount;
            total = total + amount;
            return balance;
        }
    }

    public Integer incrementTicketNumber(){
        ticketNumber++;
        return ticketNumber;
    }

    /**
     * Resets the value of the total to zero
     */
    public String emptyTotalBalance(){
        total = 0;
        balance = 0;
        return "Your total is now 0.\nYour balance is now 0.";
    }

    /**
     * Sets a new price to the ticket
     */
    public Integer setPrice(Integer newPrice){
        price = newPrice;
        return price;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public String printTicket()
    {
        //Conditional that checks if there is enough money
        if(balance < price){
            return "Please insert the proper amount of money.";
        } else {
            //Increment the number of tickets printed
            incrementTicketNumber();
            // Clear the balance.
            balance = balance - price;

            if(ticketNumber == 1){
                return "Ticket price: " + price + " cents." + "\n" +
                "Your balance is " + balance +
                " cents.\nYou have purchased 1 ticket.";
            } else {
                return "Ticket price: " + price + " cents.\n" +
                "Your balance is " + balance + " cents.\nYou have purchased "
                + ticketNumber + " tickets.";
            }
        }
    }
}