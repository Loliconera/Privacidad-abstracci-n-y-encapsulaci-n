public class Main {
    public static void main(String[] args)
    {
        Persona persona = new Persona();
        persona.setEdad(34);
        int edad = persona.getEdad();
        persona.setNombre("Gustavo");
        String nombre = persona.getNombre();
        persona.setTeléfono(949243737);
        int teléfono = persona.getTeléfono();
        System.out.println("El nombre es: " + nombre);
        System.out.println("tiene " + edad);
        System.out.println(" y su numero celular es " + teléfono);
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