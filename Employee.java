class Employee extends Person{
int year;
double salary;
String nin;
Employee(String na,int y,double s,String ni){
super(na);
year=y;
salary=s;
nin=ni;

}

void getYear(){
System.out.println(year);
}
void getSalary(){
System.out.println(salary);
}
void getNin(){
System.out.println(nin);
}

public void sleep(){
System.out.println("i love sleeping but not in weekends");

}

}