
public class AddingMachine {
    private int total;
    private String output = "0";

    public AddingMachine() {
        total = 0;// not needed - included for clarity
    }

    public int getTotal() {
        return total; // method returns the total
    }

    public void add(int value) {
        total += value;
        output = output + " + " + value;
    } // method adds desired value to total variable

    public void subtract(int value) {
        total -= value;
        output = output + " - " + value;
    } // method subtracts desired value to total variable

    public String toString() {
        return output;
    } // method keeps a history of all actions done

    public void clear() {
        total = 0;
        output = "0";
    }
} // clears values