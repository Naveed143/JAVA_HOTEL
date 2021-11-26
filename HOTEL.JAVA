class Coustomer 
{
 String cstname,room;
int cstamt;
}
void showcustm();
{
System.out.println("COUSTAMER NAME :"+cstname);
System.out.println("THE ROOM NUM :"+room);
System.out.println("the amount :"+cstamt);
}
Class Manager
{
String mnname;
int mnamt;
}
void showman();
{
System.out.println(" MANAGER NAME"+mnname);
System.out.println(" manager amount"+mnamt);
}
void Processes(Coustomer c)
{
c.room=" booked";
c.cstamt=c.cstamt-20000;
mnamt+=20000;
}
class Hotel
{
String htname;
int htamt;
}
void showhtl();
}
System.out.println("HOTEL NAME:"+htname);
System.out.println(" HOTEL AMOUNT:"+htamt);
}
void enjoyment(Coustomer c,Manager m)
{
cstamt-=7000;
htamt+=7000;
intf=(stamt*10)/100;
htamt-=f;
mnamt+=f;
}
class Pub
{
String tubname;
int tubamt;
}
void showtub();
{
System.out.println("NAME"+tubname);
System.out.println("AMOUNT"+tubamt);
}
void disco(Coustomar c,Manger m)
{
cstamt-=1000;
tubamt+=1000;
intf=(tubamt*5)/100;
tubamt-=f;
mnamt+=f;
}
}
class Hotel
{
public static void  main(String arg[])
{
Manager m= new Manager();
Coustomer c= new Coustomer();
Hotel s = new Hotel();
Pub p= new Pub();
m.mnname="xxxx";
m.mnamt=0;
c.cstname="yyyy";
c.cstamt="100000";
s.htname="5star";
s.htamt=0;
p.tubname="disco";
p.tubamt=0;
System.out.println(" \nMANAGER DETAILS:");
m.showman();
System.out.println("\n coustomer details:");
c.showcustm();
System.out.println("\n sotel details:");
s.showhtl();
System.out.println("\n pub details:");
p.showtub();
m.Processes(c);
s.enjoyment(c,m);
p.disco(c,m);
System.out.println("/n after treatmnet");
System.out.println("/n manager details");
m.showman();
System.out.println("/n coustmer details ");
c.showcustm();
System.out.println("\n sotel details:");
s.showhtl();
System.out.println("\n pub details:");
p.showtub();
}
}
