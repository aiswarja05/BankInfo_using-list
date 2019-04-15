package BankManagement.BanksInfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {user_info u1=new user_info();
    user_info u2=new user_info();
    user_info u3=new user_info();
   
    u1.setName("Joye");
    u1.setId(1);
    u1.setBalance(10000);
     
    u2.setName("Aiswarja");
    u2.setId(2);
    u2.setBalance(20000);
    
    u3.setName("Saha");
    u3.setId(3);
    u3.setBalance(30000);
    
    
    Employees_info e1=new Employees_info();
    Employees_info e2=new Employees_info();
    Employees_info e3=new Employees_info();
    
    e1.setName("Shoto");
    e1.setPosition("Manager");
    e1.setSalary(100000);
    
    e2.setName("Jony");
    e2.setPosition("Assistent Manager");
    e2.setSalary(100000);
    
    e3.setName("Rony");
    e3.setPosition("Accountent");
    e3.setSalary(100000);
    
    List<user_info> list1 = new ArrayList<>();
    user_info user = list1.get(0);
    
    List<Employees_info> list2 = new ArrayList<e1>();
    Employees_info employee = list2.get(1);
    
     System.out.printf("Users :%d\n\n", u1.get(0));
  
    }
}
