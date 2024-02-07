// Bank3AStudentLastName.java
// Student starting version of the Lab03A assignment Bank Class.
// Student Name: Cyrus Gronblom Date: 2/7/24
// Purpose of Program: 
// First time creation and use of objects, using the Bank class 
public class Lab3ABankGronblom{

	private double checking; //holds checking account value - also referred to as an object property
	private double savings;  //holds savings account value
  private String nameAccountHolder;  //holds name of account holder

  //default constructor set object variables to default values
	public Lab3ABankGronblom(){
		checking = 0.0;
		savings = 0.0;
    nameAccountHolder = "New Account";
	}

  //overloaded constructor takes starting class properties and sets them when creating the object
	public Lab3ABankGronblom(String name, double check, double save){
		checking = check;
		savings = save;
    nameAccountHolder = name;
	}

  //gives access to private object property outside of class
	public String getNameAccountHolder(){
		return nameAccountHolder;
	}

  //gives access to private object property outside of class so it can be changed
	public void setNameAccountHolder(String name){
	 nameAccountHolder = name;
	}

  //gives access to private object property outside of class
	public double getChecking(){
		return checking;
	}

  //gives access to private object property outside of class
	public double getSavings(){
		return savings;
	}

  //gives access to private object property outside of class so it can be changed, amount must be positive
	public void checkingDeposit(double amount){
		//make sure deposit amount is positive
    if(amount > 0)
      checking += amount;
    else
      System.out.println("Checking deposit for " + nameAccountHolder + " amount must be positive\n");
	}

  //gives access to private object property outside of class so it can be changed, amount must be positive
	public void savingsDeposit(double amount){
		//make sure deposit amount is positive
    if(amount > 0)
      savings += amount;
    else
      System.out.println("Savings deposit amount must be positive\n");
    
	}

  //gives access to private object property outside of class so it can be changed, 
  //will allow for overdraw provided there is enough money in savings to cover it
	public void checkingWithdrawal(double amount){
		//if there is enough money in checking take the money from there
    if(amount <= checking){
      checking -= amount;
    
    }else if(amount <= checking + savings){//if not checking see if combined with savings will work and take all the money from checking and the balance from savings
      savings = amount - checking;
      checking = 0;
    
    }else{//combined accounts have insufcient funds send message
      System.out.println(nameAccountHolder + " has insuffcient funds for withdrawl.\n");
    }
    
	}

  //gives access to private object property outside of class so it can be changed, 
  //will allow not allow for overdraw
	public void savingsWithdrawal(double amount){
    //check if savings has enough money to cover withdrawl
    if(amount <= savings){
      savings -= amount;
      
    }else{//account has insufcient funds send message
      System.out.println(nameAccountHolder + " has insuffcient funds for withdrawl.\n");
    }
	}

  //allows this object calling this method to transfer money TO another 
  //bank account into THE OTHER checking account FROM this checking/savings account 
  //provided THIS account has enough money in savings and checking to cover
  //the transfer
	public void transferFromCheckingTo(Lab3ABankGronblom account1, double amount)
	{
    //if there is enough money in checking take the money from there
		if(amount <= this.checking){
      account1.checkingDeposit(amount);
      this.checking -= amount;
      System.out.println(nameAccountHolder + " has transferred $" + amount + " from their checking account\nto " + account1.getNameAccountHolder() + "'s checking account.\n");
   
   }else if(amount <= this.checking + this.savings){//if not checking see if combined with savings will work and take all the money from checking and the balance from savings
      this.savings -= amount - this.checking;
      this.checking = 0;
      account1.checkingDeposit(amount);
      System.out.println(nameAccountHolder + " has transferred $" + amount + " from their checking & savings account\nto " + account1.getNameAccountHolder() + "'s checking account.\n");
    
    }else{//combined accounts have insufcient funds send message
      System.out.println(nameAccountHolder + " has insuffcient funds for transfer.\n");
    }  
  }

  //*******************. Method you must write ***************************
  //allows this object calling this method to transfer money TO 
  //another bank account into THE OTHER savings account FROM this 
  //savings account provided THIS account has enough money 
  //in, savings only, to cover the transfer
	public void transferFromSavingsTo(Lab3ABankGronblom account1, double amount)
	{
    //if there is enough money in savings take the money from there
		if(amount <= this.savings){
      account1.savingsDeposit(amount);
      this.savings -= amount;
      System.out.println(nameAccountHolder + " has transferred $" + amount + " from their savings account\nto " + account1.getNameAccountHolder() + "'s savings account.\n");
    }else{//combined accounts have insufcient funds send message
      System.out.println(nameAccountHolder + " has insuffcient funds for transfer.\n");
    }  
  }

  //overrides the Object.toString() method which would output the object memory location
  //comment out this method and you will see the objects memory locations
  public String toString(){
    return nameAccountHolder + " has $" + checking + " in their checking account and $" + savings + " in their savings account.\n";
  }

}


