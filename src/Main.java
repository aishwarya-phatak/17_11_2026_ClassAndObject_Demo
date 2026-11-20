//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    IO.println("-------------objects created by default constructor--------------");
    Employee e = new Employee();            //objects created by default constructor
    e.display();
    e.toString();
    IO.println("hash code of e is : " + e.hashCode());

    Employee e2 = new Employee();           //objects created by default constructor
    e2.display();
    e2.toString();
    IO.println("hash code of e2 is : " + e2.hashCode());

    boolean result = e2.equals(e);
    IO.println("result of equals method is : " + result);

    IO.println("----------objects created by parameterized constructor-----------");
    Employee e1 = new Employee(12312,"Mayuri","Pune",35432.213); //object created by parameterized constructor
    e1.display();
    e1.toString();
    IO.println("hash code of e1 is  : " + e1.hashCode());
}