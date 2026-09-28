import java.math.BigDecimal;import java.util.*;
class Account{String id,name;BigDecimal balance=BigDecimal.ZERO;Account(String i,String n){id=i;name=n;}}
public class Main{
 static Map<String,Account> db=new LinkedHashMap<>();
 static void deposit(String id,BigDecimal n){db.get(id).balance=db.get(id).balance.add(n);}
 static void withdraw(String id,BigDecimal n){Account a=db.get(id);if(a.balance.compareTo(n)<0)throw new IllegalArgumentException("Insufficient balance");a.balance=a.balance.subtract(n);}
 public static void main(String[]x){db.put("1001",new Account("1001","Demo User"));deposit("1001",new BigDecimal("1500000"));System.out.println("BANK SYSTEM");System.out.println(db.get("1001").name+" balance Rp"+db.get("1001").balance);withdraw("1001",new BigDecimal("125000"));System.out.println("After withdrawal: Rp"+db.get("1001").balance);}
}
