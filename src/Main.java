public class Main {
    public static void main(String[] args)
    {
        Persona persona = new Persona();
        persona.setNombre("Gustavo");
        persona.setEdad(33);
        persona.setTeléfono(949243737);
        System.out.println("Mi nombre es: " + persona.getNombre());
        System.out.println("Tengo: " + persona.getEdad() + " años");
        System.out.println("Mi número celular es: " + persona.getTeléfono());
    }
}
 class Persona
 {
    private int edad;
    private String nombre;
    private int teléfono;

     public void setEdad(int Valor)
     {
         this.edad = Valor;
     }
     public int getEdad()
     {
         return this.edad;
     }
     public void setNombre(String Valor)
     {
         this.nombre = Valor;
     }
     public String getNombre()
     {
         return this.nombre;
     }
     public void setTeléfono(int Valor)
     {
         this.teléfono = Valor;
     }
     public int getTeléfono()
     {
         return this.teléfono;
     }
 }