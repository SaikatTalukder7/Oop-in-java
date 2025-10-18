package A_Practice;

class Student {
    String name;
    int age;
    String major;

    Student(String name) 
    {
        this.name = name;

    }
    Student() 
    {
        name = "Unnamed";
        age = 18;
        major = "Undecleared";
    }  
    Student(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    Student(String n, int a,String m) 
    {
        this.name = n;
        this.age = a;        
    }
}

