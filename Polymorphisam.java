class Bank{
   int get_roi(){
      
   
      return 0;
    }
}
class SBI extends Bank
{
    double r1=0.03;
    int get_roi()
    {
        System.out.println(r1);
        return 0;
    }
}
class ICICI extends Bank
{
    double r2=0.04;
    int get_roi()
    {
        System.out.println(r2);
        return 0;
    }
}
class AXIS extends Bank
{
    double r3=0.05;
    int get_roi()
    {
        System.out.println(r3);
        return 0;
    }
}
public class Polymorphisam {
 
    public static void main(String[] args) {
       Bank ob=new SBI();
       ob.get_roi();
      // Bank ob=new ();
       //ob.get_roi();
    }
    
}
