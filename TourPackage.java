import java.util.*;

abstract class Choices
{
    abstract void getinfo();
    Scanner sc=new Scanner(System.in);
    
}

class Select 
{
    static String name;
}

class Places extends Choices{
   static void prince(String pla)
    {
        State s1=new Gujarat();
        State s2=new Goa();
        State s3=new Rajasthan();
        State s4=new Kerela();
        State s5=new Delhi();
        State s6=new Ladakh();
        State s7=new Uttrakhand();
        State s8=new Andaman();
        State s9=new Himachal();
        State s10=new Sikkim();
        if(pla.equalsIgnoreCase("Gujarat")){
            s1.show();
            Gujarat  obb1=new Gujarat();
            Gujarat.Info obb=obb1.new Info();
            obb.infor1(); 

        }
        else if(pla.equalsIgnoreCase("Goa")){
            s2.show();
             Goa obb1=new Goa();
             Goa.Info obb =obb1.new Info();
            obb.infor1();
        }
        else if(pla.equalsIgnoreCase("Rajasthan")){
            s3.show();
            Rajasthan obb1=new Rajasthan();
            Rajasthan.Info obb=obb1.new Info();
            obb.infor1(); 
        }
        else if(pla.equalsIgnoreCase("Kerela")){
            s4.show();
            Kerela  obb1=new Kerela();
            Kerela.Info obb=obb1.new Info();
            obb.infor1(); 
        }
        else if(pla.equalsIgnoreCase("delhi")){
            s5.show();
            Delhi obb1=new Delhi();
            Delhi.Info obb=obb1.new Info();
            obb.infor1(); 
        }
        else if(pla.equalsIgnoreCase("ladakh")){
            s6.show();
            Ladakh obb1=new Ladakh();
            Ladakh.Info obb=obb1.new Info();
            obb.infor1(); 
        }
        else if(pla.equalsIgnoreCase("Uttrakhand")){
            s7.show();
            Uttrakhand obb1=new Uttrakhand();
            Uttrakhand.Info obb=obb1.new Info();
            obb.infor1(); 
        }
        else if(pla.equalsIgnoreCase("andaman and nikobar island")){
            s8.show();
            Andaman obb1=new Andaman();
            Andaman.Info obb=obb1.new Info();
            obb.infor1(); 
        }
        else if(pla.equalsIgnoreCase("himachal pradesh")){
            s9.show();
            Himachal obb1=new Himachal();
            Himachal.Info obb=obb1.new Info();
            obb.infor1(); 
        }
        else if(pla.equalsIgnoreCase("Sikkim")){
            s10.show();
            Sikkim obb1=new Sikkim();
            Sikkim.Info obb=obb1.new Info();
            obb.infor1(); 
        }
        else{
            System.out.println("Enter valid!!!");
        }
}

    void getinfo()
    {
        System.out.println();
        System.out.println("       Our Services are active in  ");
        String array[]=new String[10];
        String arr[]=new String[10];
        System.out.println();
        arr[0]="---->          Gujarat           <----";
        arr[1]="---->            Goa             <----";
        arr[2]="---->      Himachal Pradesh      <----";
        arr[3]="---->           Sikkim           <----";
        arr[4]="---->          Rajasthan         <----";
        arr[5]="---->           Kerela           <----";
        arr[6]="---->           Ladakh           <----";
        arr[7]="----> Andaman and Nicobar Island <----";
        arr[8]="---->            Delhi           <----";
        arr[9]="---->          Uttrakhand        <----";
        System.out.println();
        System.out.println();
        array[0]="Gujarat";
        array[1]="Goa";
        array[2]="Himachal Pradesh";
        array[3]="Sikkim";
        array[4]="Rajasthan";
        array[5]="Kerala";
        array[6]="Ladakh";
        array[7]="Andaman and Nicobar Island";
        array[8]="Delhi";
        array[9]="Uttrakhand";


        for(int i=0;i<array.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.print("Enter the place for your tour: ");
        String pla= sc.nextLine();
        boolean chk=false;
        for(int i=0;i<array.length;i++)
        {
            if(pla.equalsIgnoreCase(array[i]))
            {
                System.out.println();
                chk=true;
                break;
            }
        }

        if(!chk)
        {
            System.out.println("Please Enter again!");
        }
        else
        {
            Select.name=pla;
            Booking b=new Booking();
            b.select();
            Final.ff();
        }
        
    }

}

class Time extends Choices{
 


    void getinfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the month you want to travel: ");
        int y=sc.nextInt();
        State s1=new Gujarat();
        State s2=new Goa();
        State s3=new Rajasthan();
        State s4=new Kerela();
        State s5=new Delhi();
        State s6=new Ladakh();
        State s7=new Uttrakhand();
        State s8=new Andaman();
        State s9=new Himachal();
        State s10=new Sikkim();

        if(y==1) {
            s1.show();
            s2.show();
            s5.show();
            s7.show();
            s4.show();
            s8.show();
            s3.show();
        }

        else if(y==2){
            s1.show();
            s2.show(); 
            s5.show();
            s9.show();
            s8.show();
            s3.show();
            s4.show();
            s7.show();
        }

        else if(y==3){
            s5.show();
            s7.show();
            s10.show();
            s4.show();
            s9.show();
            s8.show();  
        }

        else if(y==4){
            s6.show();
            s9.show();
            s8.show();
            s10.show();
        }

        else if(y==5){
            s6.show();
            s9.show();
            s8.show();
            s10.show();
        }

        else if(y==6){
            s6.show();
            s9.show();
        }

        else if(y==7){
            s6.show();
        }

        else if(y==8){
            System.out.println("NO available options");
            System.out.println("Rainy Season");
        }

        else if(y==9){
            s4.show();
        }

        else if(y==10){
            s5.show();
            s7.show();
            s4.show();
            s8.show();
        }

        else if(y==11){
            s5.show();
            s1.show();
            s2.show();
            s3.show();
            s7.show();
            s4.show();
            s8.show();
        }

        else if(y==12){
            s5.show();
            s1.show();
            s2.show();
            s3.show();
            s7.show();
            s4.show();
            s8.show();
        }

        else System.out.println("Invalid data");
        
          System.out.println("Enter the name: ");
        sc.nextLine();
        String q=sc.nextLine();
      //  String  nn= op.nextLine();
        Select.name=q;
        Booking b=new Booking();
        b.select();
        //Places.prince(Select.name);
        Final.ff();
        


    }
    
    
}

abstract class State{
    abstract void show();
    abstract void show1();
    Scanner sc=new Scanner(System.in);
}    



class Gujarat extends State{

    int price;
    Gujarat()
    {

    }
    Gujarat(int price)
    {   
        this.price=price;
    }

        void show()
        {
            System.out.println("Gujarat");
        }

    void show1(){
        
    System.out.println();
    System.out.println("*********Gujarat*********");
    System.out.println();
    System.out.println("Top Attractions and best tourist places");
    System.out.println("Runn of kutch");
    System.out.println("palitana");
    System.out.println("saputara");
    System.out.println("Akshardham");
    System.out.println("Rani ki vav");
    System.out.println("statue of Unity");
    System.out.println("Gir National park");
    System.out.println();
    System.out.println("6N/7D");
    System.out.println("Best time to visit: November to February");
   // System.out.println("Budget : INR 20000 to 25000");
    }

    class Info
    {
      
        void infor1()
        {
            System.out.println("*Select any plan: ");
            System.out.println("Popular Plan: 23000");
            System.out.println("Premium Plan: 25000");
            int y=sc.nextInt();
            Gujarat ob =new Gujarat(y);

        }

    }
}   


class Goa extends State{


    int price;
    Goa()
    {

    }
    Goa(int price)
    {   
        this.price=price;
    }

    void show()
    {
        System.out.println("Goa");
    }


    void show1(){
        System.out.println();
    System.out.println("*********Goa*********");
    System.out.println();
    System.out.println("Top Attractions and best tourist places");
    System.out.println("Calangute beach");
    System.out.println("Fort Anguada");
    System.out.println("Dine at cruice");
    System.out.println("Dudhsagar waterfall");
    System.out.println("chapora beach");
    System.out.println("Basilica at bom jesus");
    System.out.println("Church of our lady of the immaculate conception");
    System.out.println("Party at cruice");
    System.out.println("Anjuna flea market");
    System.out.println("Party at tito's");
    System.out.println();
    System.out.println("Best time to visit: November to February");
    System.out.println("9N/11D");
   // System.out.println("Budget : INR 45,000 to 50,000");
    }
    class Info
    {
      
        void infor1()
        {
            System.out.println("*Select any plan: ");
            System.out.println("Popular Plan: 45000");
            System.out.println("Premium Plan: 50000");
            int y=sc.nextInt();
            Goa ob =new Goa(y);

        }

    }

    
} 

class Delhi extends State{



    int price;

    Delhi()
    {

    }
    Delhi(int price)
    {   
        this.price=price;
    }

    void show()
    {
        System.out.println("Delhi");
    }


    void show1(){
        System.out.println();
    System.out.println("*********Delhi*********");
            System.out.println();
    System.out.println("Top Attractions and best tourist places");
    System.out.println("Red fort");
    System.out.println("Qutub minar");
    System.out.println("Humayun's Tomb");
    System.out.println("India Gate");
    System.out.println("lotus temple");
    System.out.println("Jnatar Mantar");
    System.out.println("Akshardham");
            System.out.println();
    System.out.println("3N/4D");
    System.out.println("Best time to visit: October to March");
   // System.out.println("Budget : INR 10,000 to 15,000");
    }


    class Info
    {
      
        void infor1()
        {
            System.out.println("Select any plan: ");
            System.out.println("Popular Plan: 23000");
            System.out.println("Premium Plan: 25000");
            int y=sc.nextInt();
            Delhi ob =new Delhi(y);

        }

    }



}   

class Ladakh extends State{


    int price;
    Ladakh()
    {

    }
    Ladakh(int price)
    {   
        this.price=price;
    }

    void show()
    {
        System.out.println("Ladakh");
    }

    void show1(){
                System.out.println();
    System.out.println("******ladakh*****");       
    System.out.println();
    System.out.println("Top Attractions and best tourist places");
    System.out.println("Nubra valley");
    System.out.println("Zanskar valley");
    System.out.println("Pangong lake");
    System.out.println("Drive up magnetic hill");
    System.out.println("Khardung La Pass");
    System.out.println("Sangam");
    System.out.println("Shanti Stupa");
    System.out.println("Thiksey Monastery");
    System.out.println("Leh palace");
    System.out.println("Hunder Village");
    System.out.println("Lachung temple");
            System.out.println();
    System.out.println("5N/6D");
    System.out.println("Best time to visit: November to February");
   // System.out.println("Budget : INR 25,000 to 35,000");
    }


    class Info
    {
      
        void infor1()
        {
            System.out.println("*Select any plan: ");
            System.out.println("Popular Plan: 23000");
            System.out.println("Premium Plan: 25000");
            int y=sc.nextInt();
            Ladakh ob =new Ladakh(y);

        }

    }



}   


class Rajasthan extends State{

    void show()
    {
        System.out.println("Rajasthan");
    }



    int price;
    Rajasthan()
    {

    }
    Rajasthan(int price)
    {   
        this.price=price;
    }


    void show1(){
                System.out.println();

    System.out.println("******rajasthan*******");
            System.out.println();

    System.out.println("Top Attractions and best tourist places");
    System.out.println("Jodhpur");
    System.out.println("Udaipur");
    System.out.println("Jaipur");
    System.out.println("Jaisalmer");
    System.out.println("Ranthambore Natioanl Park");
    System.out.println("Bikaner");
    System.out.println("Ajmer");
    System.out.println("Mount abu");
    System.out.println("Chittorgarh Fort");
    System.out.println("Nathdwara");
            System.out.println();

    System.out.println("19N/20D");
    System.out.println("Best time to visit: November to February");
   // System.out.println("Budget : INR 90,000 to 1,10,000");
    }

    class Info
    {
      
        void infor1()
        {
             System.out.println("*Select any plan: ");
            System.out.println("Popular Plan: 23000");
            System.out.println("Premium Plan: 25000");
            int y=sc.nextInt();
            Rajasthan ob =new Rajasthan(y);

        }

    }


}  


class Sikkim extends State{




    int price;
    Sikkim()
    {

    }
    Sikkim(int price)
    {   
        this.price=price;
    }


    void show()
    {
        System.out.println("Sikkim");
    }


    
    void show1(){
                System.out.println();

    System.out.println("*****Sikkim******");
            System.out.println();

    System.out.println("Top Attractions and best tourist places");
    System.out.println("Gangtok");
    System.out.println("Pelling");
    System.out.println("Lachung");
    System.out.println("Silliguri");
    System.out.println("Yumthang");
    System.out.println("Ravangla");
    System.out.println("Gorumara National Park");
    System.out.println("Namchi");
    System.out.println("Zuluk");
    System.out.println("Phuentsholing");
            System.out.println();

    System.out.println("12N/13D");
    System.out.println("Best time to visit: October to December\n\t\t May to March");
  //  System.out.println("Budget : INR 85,000 to 1,30,000");
    }


    class Info
    {
      
        void infor1()
        {
                        System.out.println("*Select any plan: ");
            System.out.println("Popular Plan: 23000");
            System.out.println("Premium Plan: 25000");
            int y=sc.nextInt();
            Sikkim ob =new Sikkim(y);

        }

    }



} 



class Himachal extends State{

    int price;
    Himachal()
    {

    }
    Himachal(int price)
    {   
        this.price=price;
    }


    void show()
    {
        System.out.println("Himachal");
    }



    void show1(){
                System.out.println();

    System.out.println("******Himachal*******");
    System.out.println("The dalai lam resides in this himalyan mountain state, home to many Buddhist, Hindu temple");
            System.out.println();

    System.out.println("top attractions and best tourist places");
    System.out.println("Rohtang La");
    System.out.println("Hadimba devi temple");
    System.out.println("Chandra taal");
    System.out.println("mall road");
    System.out.println("Triund");
    System.out.println("Bhringu lake");
            System.out.println();

    System.out.println("3N/4D");
    System.out.println("Best time to visit: February to June");
   // System.out.println("Budget: INR 20000 to 22000");
    }

    class Info
    {
      
        void infor1()
        {
                        System.out.println("*Select any plan: ");
            System.out.println("Popular Plan: 23000");
            System.out.println("Premium Plan: 25000");
            int y=sc.nextInt();
            Himachal ob =new Himachal(y);

        }

    }
}

class Andaman extends State{


    int price;
    Andaman()
    {

    }
    Andaman(int price)
    {   
        this.price=price;
    }


    void show()
    {
        System.out.println("Andaman");
    }



    void show1(){
                System.out.println();

    System.out.println("****Andaman and Nikobar****");
            System.out.println();
    System.out.println("top attractions and best tourist places");
    System.out.println("Port Blair");
    System.out.println("Boarding island");
    System.out.println("Diglipur");
    System.out.println("Ross island");
    System.out.println("Cellular Jail");
    System.out.println("Jolly Buoy island");
    System.out.println("Mahatma Gandhi national park");
    System.out.println("Elephant beach");
    System.out.println("samudrika marine musuem");
            System.out.println();
    System.out.println("10D/9N");
    System.out.println("Best time to visit: October to May");
  //  System.out.println("Budget: INR 60000 to 75000");
    }


    class Info
    {
      
        void infor1()
        {
                        System.out.println("*Select any plan: ");
            System.out.println("Popular Plan: 23000");
            System.out.println("Premium Plan: 25000");
            int y=sc.nextInt();
            Andaman ob =new Andaman(y);

        }

    }


}

class Uttrakhand extends State{


    int price;
    Uttrakhand()
    {

    }
    Uttrakhand(int price)
    {   
        this.price=price;
    }



    void show()
    {
        System.out.println("Uttrakhand");
    }



    void show1(){
    System.out.println();
    System.out.println("*****Uttrakhand******");
    System.out.println();
    System.out.println("top attractions and best tourist places");
    System.out.println("Rishikesh");
    System.out.println("Nainital");
    System.out.println("Massorie");
    System.out.println("Haridwar");
    System.out.println("Jim Corbett National park");
    System.out.println("Kedarnath");
    System.out.println("Dehradun");
    System.out.println("Kanatal");
            System.out.println();
    System.out.println("7D/6N");
    System.out.println("Best time to visit: October to March");
   // System.out.println("Budget: INR 30000 to 35000");
    }

    class Info
    {
      
        void infor1()
        {
                        System.out.println("*Select any plan: ");
            System.out.println("Popular Plan: 23000");
            System.out.println("Premium Plan: 25000");
            int y=sc.nextInt();
            Uttrakhand ob =new Uttrakhand(y);

        }

    }

}


class Kerela extends State{


    int price;
    Kerela()
    {

    }
    Kerela(int price)
    {   
        this.price=price;
    }


    void show()
    {
        System.out.println("Kerela");
    }


    void show1(){
                System.out.println();
    System.out.println("****Kerela*****");
            System.out.println();
    System.out.println("top attractions and best tourist places");
    System.out.println("Eravikulam National park");
    System.out.println("varkala beach");
    System.out.println("silent vally national park");
    System.out.println("Mattancherry palace");
    System.out.println("Cherai Beach");
    System.out.println("Edakkal caves");
    System.out.println("Athirappilly waterfall");
    System.out.println("8D/7N");
    System.out.println("Best time to visit: September to March");
  //  System.out.println("Budget: INR 45000 to 50000");
    }


    class Info
    {
      
        void infor1()
        {
                        System.out.println("*Select any plan: ");
            System.out.println("Popular Plan: 23000");
            System.out.println("Premium Plan: 25000");
            int y=sc.nextInt();
            Kerela ob =new Kerela(y);

        }

    }



}

class Budget extends Choices{
    Scanner op=new Scanner(System.in);
 void getinfo(){
    System.out.print("\nEnter your budget: ");
    int budget=op.nextInt();

    State s1=new Gujarat();
    State s2=new Goa();
    State s3=new Rajasthan();
    State s4=new Kerela();
    State s5=new Delhi();
    State s6=new Ladakh();
    State s7=new Uttrakhand();
    State s8=new Andaman();
    State s9=new Himachal();
    State s10=new Sikkim();
    boolean c=true;
    if(budget>=10000 && budget<=20000){
        s5.show();
    }
    else if( budget >20000 && budget<=25000){
        s1.show();
        s9.show();
    }
    else if(budget>25000 && budget<=40000){
        s6.show();
        s7.show();
    }
    else if(budget>35000 && budget<=50000){
        s4.show();
        s2.show();
    }
    else if(budget>50000 && budget<=75000){
        s8.show();
    }
    else if(budget>=75000){
        s10.show();
        s3.show();
    }
    else{
        System.out.println("No options available");
        c=false;
    }

    if(c)
{   
     System.out.println("Please select the place: ");
     op.nextLine();
     String  nn= op.nextLine();
     Select.name=nn;
     Booking b=new Booking();
     b.select();
     //Places.prince(Select.name);


 }
}
}

class Booking {
     void select(){

        Places.prince(Select.name);
        //Final ob=new Final();
        //ob.ekta(Select.name);
    }
}


class Final
{

    static void ekta(String pla)
    {
        State s1=new Gujarat();
        State s2=new Goa();
        State s3=new Rajasthan();
        State s4=new Kerela();
        State s5=new Delhi();
        State s6=new Ladakh();
        State s7=new Uttrakhand();
        State s8=new Andaman();
        State s9=new Himachal();
        State s10=new Sikkim();
        if(pla.equalsIgnoreCase("Gujarat")){
            s1.show1();
           

        }
        else if(pla.equalsIgnoreCase("Goa")){
            s2.show1();
    
        }
        else if(pla.equalsIgnoreCase("Rajasthan")){
            s3.show1();
            
        }
        else if(pla.equalsIgnoreCase("Kerela")){
            s4.show1();
        
        }
        else if(pla.equalsIgnoreCase("delhi")){
            s5.show1();
           
        }
        else if(pla.equalsIgnoreCase("ladakh")){
            s6.show1();
           
        }
        else if(pla.equalsIgnoreCase("Uttrakhand")){
            s7.show1();
        }
        else if(pla.equalsIgnoreCase("andaman and nikobar island")){
            s8.show1();

        }
        else if(pla.equalsIgnoreCase("himachal pradesh")){
            s9.show1();
 
        }
        else if(pla.equalsIgnoreCase("Sikkim")){
            s10.show1();
        }
        else{
            System.out.println("Enter valid!!!");
        }
}


    static void ff()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(Select.name);
        Final.ekta(Select.name);
        String p,q,r,s;
        System.out.println("Enter your name: ");
        p=sc.nextLine();
        System.out.println("Enter your partner name: ");
        q=sc.nextLine();
        System.out.println("Enter your mobile number: ");
        r=sc.nextLine();
        System.out.println("Enter your email: ");
        s=sc.nextLine();
    }
}


public class TourPackage
{
    public static void main(String[] args) {
        
        Choices obj1= new Places();
        Choices obj2= new Time();
        Choices obj3= new Budget();
       boolean flg=true;
        System.out.println("************");
        Scanner sc=new Scanner(System.in);

       // Info w=new Goa.Info ();
        
   
       do{
            System.out.print("\n 1: Places\n 2: Time \n 3: Budget\n 4: Exit \n\n Press: ");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                obj1.getinfo();
               // Places.prince(Select.name);
                break;

                case 2:
                obj2.getinfo();
                break;

                case 3:
                obj3.getinfo();
                break;
                
                case 4:
                flg=false;
                break;
                default:
                System.out.println("Invalid ! Enter Again !");
             }
       }while(flg);
       System.out.println("\n Thank you.... :) ");
       sc.close();
   }
}