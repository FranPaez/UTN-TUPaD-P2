package introduccion_poo;

public class Introduccion_POO {

    public static void main(String[] args) {
        
        // --------- EJERCICIO 1 -----------
        
        
        Estudiante alumno = new Estudiante();
        alumno.nombre = "Franco";
        alumno.apellido = "Paez";
        alumno.curso = "1ro A";
        alumno.calificacion = 8.5;
        
        alumno.mostrarInfo();
        alumno.subirCalificacion(1.5);
        alumno.mostrarInfo();
        alumno.bajarCalificacion(3.5);
        alumno.mostrarInfo();
        
        
        // --------- EJERCICIO 2 -----------
        
        
        Mascota perro = new Mascota();
        
        perro.nombre = "Tobi";
        perro.especie = "Perro";
        perro.edad = 7;
        
        perro.mostrarInfo();
        perro.cumplirAnios(5);
        perro.mostrarInfo();
        
        
        // --------- EJERCICIO 3 -----------
        
        
        Libro libro = new Libro("El Quijote", "Cervantes", 1605);
        libro.mostrarInfo();
        libro.setAnioPublicacion(-3);
        libro.mostrarInfo();
        libro.setAnioPublicacion(1610);
        libro.mostrarInfo();
        
   
        // --------- EJERCICIO 4 -----------
        
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.idGallina = "001"; 
        // Lo correcto seria realizarlo como int y autoincrementable, para que se visualice mejor en consola lo hice String.
        gallina1.edad = 1;
        gallina1.huevosPuestos = 15;
        
        gallina2.idGallina = "002";
        gallina2.edad = 2;
        gallina2.huevosPuestos = 45;
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        gallina1.ponerHuevo(30);
        gallina1.envejecer(2);
        gallina2.ponerHuevo(45);
        gallina2.envejecer(2);
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        // --------- EJERCICIO 5 -----------
        
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Apolo 133";
        nave.combustible = 50;
        nave.despegar();
        nave.recargarCombustible(10);
        nave.despegar();
        nave.mostrarEstado();
    }
    
}

    


