
void main() {
    int intOperandA = 1;
    int intOperandB = 5;
    int intSum = 0;
    int intProduct = 0;
    int intDifference = 0;
    int intQuotient = 0;
    int intModulo = 0;

    double doubleOperandA = 3.50;
    double doubleOperandB = 2.00;
    double doubleSum = 0;
    double doubleProduct = 0;
    double doubleDifference = 0;
    double doubleQuotient = 0;

    int familyKids = 2;
    boolean isRaining = false;
    double gasPrice = 3.49;
    int favoriteNumber = 7;
    double shoeSize = 10.5;
    int birthMonth = 6;
    String fullName = "Bryson Crosby";

    intSum = intOperandA + intOperandB;

    System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);

    intProduct = intOperandA * intOperandB;

    System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);

    intDifference = intOperandA - intOperandB;

    System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);

    intQuotient = intOperandA / intOperandB;

    System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);

    intModulo = intOperandA % intOperandB;

    System.out.println("The modulo using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);

    doubleSum = doubleOperandA + doubleOperandB;

    System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);

    doubleProduct = doubleOperandA * doubleOperandB;

    System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);

    doubleDifference = doubleOperandA - doubleOperandB;

    System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);

    doubleQuotient = doubleOperandA / doubleOperandB;

    System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);

    double purchasePrice = 50.00;
    double salesTax = purchasePrice * 0.05;

    System.out.println("Purchase price $" + purchasePrice);
    System.out.println("5% sales tax: $" + salesTax);

    double springMaintenance = 250.00;
    double summerMaintenance = 400.00;
    double fallMaintenance = 300.00;
    double winterMaintenance = 500.00;

    double yearlyMaintenance = springMaintenance + summerMaintenance + fallMaintenance + winterMaintenance;

    System.out.println("Spring maintenance cost $" + springMaintenance);
    System.out.println("Summer maintenance cost $" + summerMaintenance);
    System.out.println("Fall maintenance cost $" + fallMaintenance);
    System.out.println("Winter maintenance cost $" + winterMaintenance);
    System.out.println("Total yearly maintenance cost: $" + yearlyMaintenance);

    double startingBalance = 5000.00;
    double intrestRate = 0.17;

    double monthOneInterest = startingBalance * intrestRate;
    double monthOneBalance = startingBalance + monthOneInterest;

    double monthTwoInterest = monthOneBalance * intrestRate;
    double monthTwoBalance = monthOneBalance + monthTwoInterest;

    System.out.printf("Starting credit card balance: $%.2f%n", startingBalance);
    System.out.printf("Interest after one month: $%.2f%n", monthOneBalance);
    System.out.printf("Balance after one month: $%.2f%n", monthOneBalance);
    System.out.printf("Interest after two months: $%.2f%n", monthTwoInterest);
    System.out.printf("Balance after two months: $%.2f%n", monthTwoBalance);

    int numToExamine = 7;
    int moduloResult = numToExamine % 2;

    System.out.println("Number being examined: " + numToExamine);
    System.out.println("Modulo 2 result: " + moduloResult);
    System.out.println("A result of 0 means the number is even.");
    System.out.println("A result of 1 means the number is odd.");   
}