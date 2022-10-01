package kata.pkg1;

import java.util.Date;



public class Person {
    private final String name;
    private final Date birthdate;
    
    public Person(String name, Date birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName(){return name;}
    public Date getDate(){return birthdate;}
    
    public int getAge(){
        return (int) ((new Date().getTime() - birthdate.getTime()) / 31536000000L);
    
    }
    /*Hay que tener en cuenta que: 1 año tiene 365 días (exactamente 365.25
días), cada día 24 horas, cada hora 60 minutos, cada minuto 60
segundos y cada segundo 1000 milisegundos. Por lo tanto, un año tiene
31536000000 milisegundos (si se toman 365 días) o 31557600000
milisegundos (si se toman 365.25 días).
*/
    
}
