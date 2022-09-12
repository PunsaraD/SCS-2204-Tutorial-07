case class Account(acc: String, bal: Double){
  var accountN = acc
  var balance = bal      
            
  def isNegativeBalance() = if (balance < 0) true else false
  
  def addInterest() = balance = balance * (1 + (if(isNegativeBalance()) 0.1 else 0.05))
  
  override def toString = "\nAccount : " + accountN + "\nBalance : " + balance
            
}

object Bank extends App{
    var accounts: List[Account] = List(
    Account("001", -1000.0), 
    Account("002", 2000.0), 
    Account("003", 3000.0)
    )

      println("List of Accounts with negative balances : ")
    val negativeBalances = accounts.filter(account => account.isNegativeBalance())
    negativeBalances.map(account => println(account))
    
      println("The sum of all account balances : ")
    val total = accounts.reduce((x, y) => Account("-TOTAL-", x.balance + y.balance))
    println(total)
    
      println("The final balances of all accounts after apply the interest : ")
    accounts.map(account => account.addInterest())
    accounts.map(account => println(account))
    

}