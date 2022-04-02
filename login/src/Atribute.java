package login.src;

public class Atribute {
    String name;
    String value;
   
    public Atribute(){

    }

    public Atribute(String n, String v){
        this.name = n;
        this.value = v; 
    }

    public String toString(){
        return "Nome: " + this.name + " | Valor: " + this.value; 
    }
}
