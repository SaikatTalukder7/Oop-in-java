package C;

class Employee {
    String name;
    int age;
    String department;
    Employee(String name) 
    { 
        this.name = name;
    }
    void Employee() 
    {
        name = "Unknown";  
        age = 22;    
        department = "Sales";
    }
    Employee(String name, int age) {
        this.name = name;  
        this.age = age;    
    }
    Employee(int a, String n) { 
        this.name = n;
        this.age = a;
    }
}
