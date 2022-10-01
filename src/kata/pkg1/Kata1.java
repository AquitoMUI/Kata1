package kata.pkg1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person yo = new Person("Aquito", new Date(02,10,1)); // el primer mes empieza por 0
        System.out.println(yo.getName() + " tiene " + yo.getAge()); 
        
    }
    
}
