
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
interface ISignUp{
  public void print(ArrayList <Integer> num);
  public boolean addStudent (int stuType);
  public static IParams parse() {
	return null;};
}

interface IParams {
  public int getBig();
  public int getMedium();
  public int getSmall();
  public ArrayList<Integer> getPlanSignUp ();
}
public class SchoolSystem implements ISignUp,IParams {
     Integer big;
     Integer medium;
     Integer small;
    
     SchoolSystem(Integer big, Integer medium,Integer small){
    	 this.big=big;
    	 this.medium=medium;
    	 this.small=small;
     }
      
public static void main(String[] args) throws Exception {
	  
	  IParams params = SchoolSystem.parse();	  
      SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
      ArrayList<Integer> plan = params.getPlanSignUp();
      for (int i = 0; i < plan.size(); i++) {
          sc.addStudent (plan.get(i));
      }
      sc.print(plan);   
  }
     public void print(ArrayList <Integer> num) {
    	 System.out.print("null"+" ");
    	 for (int i = 0; i < num.size(); i++) 
             System.out.print(addStudent(num.get(i))+" ");
    	 
     }
     public boolean addStudent (int stuType) {
    	 if(stuType==1)
    	 {   
    		
    		 if(getBig()>0) return true;
    		 else return false;	 
    	 }
    	 if(stuType==2)
    	 {
    		 if(getMedium()>0) return true;
    		 else return false;
    			 
    	 }
    	 if(stuType==3)
    	 {
    		 if(getSmall()>0) return true;
    		 else return false;
    			 
    	 }
    	 return false;
     }
   public static IParams parse() throws Exception{
	   InputStreamReader ir=new  InputStreamReader(System.in);
	   BufferedReader in=new BufferedReader(ir);
	   Scanner S=new Scanner(System.in);
	   String l = S.nextLine();
       Scanner scan_l = new Scanner(l);
       
       Integer a,b,c;
	   a=S.nextInt();
	   b=S.nextInt();
	   c=S.nextInt();
	  
	   SchoolSystem sc=new SchoolSystem(a,b,c);
	  
	   return sc;
   }
	  public int getBig() {
		   return this.big;
	   }
	   public int getMedium() {
		   return this.medium;
	   }
	   public int getSmall() {
		   return this.small;
	   }
	   public ArrayList<Integer> getPlanSignUp (){
		   ArrayList<Integer> PlanSignUp=new ArrayList<Integer>();
		   Scanner Sc = new Scanner(System.in);
	       String l = Sc.nextLine();
	       Scanner SC = new Scanner(l);
	       while(SC.hasNextLine()) 
	            PlanSignUp.add(SC.nextInt());
		   return PlanSignUp;
	   }

}