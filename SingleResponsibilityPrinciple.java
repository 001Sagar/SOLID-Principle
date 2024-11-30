// Definition: A class should have only one reason to change, meaning it should have only one responsibility.

// Code without Using SingleResponsibility Principle
// class Invoice{
//     public void calculateTotel(){
//         // calculate the total Amount
//     }

//     public void printInvoice(){
//         // Print the Invoice
//     }

//     public void saveToDataBase(){
//         // Save to the DataBase
//     }
// }

// Code  Using SingleResponsibility Principle

class CalculateInvoic {
    // Calculate the total Amount

    public void calculateInvoice() {
        // Calculate the Invoice
    }
}

class PrintInvoice {

    public void printInvoice() {
        // Print the Invoice
    }
}

class SaveToDataBase {

    public void saveToDataBase() {
        // Save to DataBase
    }
}

public class SingleResponsibilityPrinciple {

    public static void main(String[] args) {

    }
}
