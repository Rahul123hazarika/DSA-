// here you will have basic understanding of class and object and how to create them
class student{
    String name;
    int age;
    void display(){
        System.out.println("name of the student is "+name+", age of the student is  "+age);
    }
}
class classObject{
    public static void main(String args[]){
        student s1=new student(); //creating object s1 of class student
        student s2=new student(); //creating object s2 of class student
        s1.name="shivam"; // assigning value to object s1
        s1.age=21;
        s2.name="satyam"; // assigning value to object s2
        s2.age=22;
        s1.display();
        s2.display();
    }
}
