class TestEmployee{
public static void main(String args[]){
Person p=new Person("dharani");
p.sleep();

Employee e=new Employee("raj",2016,22000.0,"one lakh");
e.sleep();

p.getName();
e.getName();
e.getYear();
e.getSalary();
e.getNin();
}
}