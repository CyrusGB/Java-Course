// Lab03AStudentLastName.java
// Student starting version of the Lab03A assignment.
// Student Name: Cyrus Gronblom Date: 2/7/24
// Purpose of Program: 
// First time creation and use of objects, using the Bank class 
class Main03A {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("");
    //constructor parameters name, checking, savings
    
    //create a bank object named john with the default constructor and print john
    Lab3ABankGronblom john = new Lab3ABankGronblom();
    System.out.println(john);

    //on line 35 print john
    //for john set the name to "John" and run program to see output
    john.setNameAccountHolder("John");

    //for john set the checking account balance to -500 and run the program to see what happens
    john.checkingDeposit(-500);
    
    //try to directly access john.checking by subtracting 600 john.checking -= 600 run program to see what happens
    // john.checking -= 600;

    //in Bank change checking to public and run program again to see if line above works.  If it works comment line out and change variable back to private
  
 
    //for john set the checking account balance to 500 and run the program to see what happens
    john.checkingDeposit(500);

    //for john set the savings account balance to 500 and run the program to see what happens
    john.savingsDeposit(500);

    //print john
    System.out.println(john);

    //create eric with overloaded constructor and ("Eric", 200, 600)
    Lab3ABankGronblom eric = new Lab3ABankGronblom("Eric", 200, 600);
    
    //create terry with overloaded constructor and ("Terry", 200, 600)
    Lab3ABankGronblom terry = new Lab3ABankGronblom("Terry", 200, 600);

   
    //print eric
    System.out.println(eric);
    //print terry
    System.out.println(terry);;

    //have terry transfer $250 to eric
    terry.transferFromCheckingTo(eric, 250);
    
    //print eric
    System.out.println(eric);
    //print terry
    System.out.println(terry);

    //uncomment the method on line 133 in bank and write the required code so:
    //have john transfer $600 from savings to eric's savings and run program to see what happens
    john.transferFromSavingsTo(eric, 600);

    //have john transfer $250 to eric
    john.transferFromSavingsTo(eric, 250);

    //print eric
    System.out.println(eric);
    //print terry
    System.out.println(terry);
    //print john
    System.out.println(john);

  }//end main
}//end class