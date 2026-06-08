import java.util.*;

class Person {
    int p_id;
    String name;
    int weight;
    
    Person(int p_id, String name, int weight){
        this.name = name;
        this.p_id = p_id;
        this.weight = weight;
    }
    
    void search_pid( String name){
        System.out.println("All information printed using the Peerson Id");
        System.out.println("All information printed using the Peerson Id");
        System.out.println("All information printed using the Peerson Id");
    }
}

class Employee exytends Person{
    String name;
    int e_id;
    
    Employee(int e_id, String name){
        this.name = name;
        this.e_id = e_id;
    }
}