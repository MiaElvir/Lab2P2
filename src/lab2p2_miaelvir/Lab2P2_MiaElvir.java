
package lab2p2_miaelvir;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_MiaElvir {
    
    static ArrayList Base = new ArrayList();   
    static ArrayList<Usuario> Usuarios = new ArrayList<>(); 
    static Scanner papoy = new Scanner(System.in); 
    
    public static void main(String[] args) {
        
       Usuarios.add(new Usuario("pablo", "pablito", "estudiante"));
       Usuarios.add(new Usuario("pata","patito","profesor"));
       Usuarios.add(new Usuario("emilio", "papoy", "bibliotecario")); 
       
        System.out.println("--- INICIO ---\nIngrese su usuario: ");
        String user = papoy.next(); 
        System.out.println("Ingrese su contraseña: ");
        String contra = papoy.next(); 
        
       
            int pos = esUsuario(user, contra, Usuarios); 
            if (pos > 0){
                if (Usuarios.get(pos).getTipo_user().equals("estudiante")){
                    System.out.println("--- Menu ---\n1. Listar recursos\n2. Salir\nIngrese su eleccion: ");
                    int elec = papoy.nextInt(); 
                    while (elec > 0 && elec < 2){
                        switch (elec){
                            case 1: 
                                listar(Base); 
                                break; 
                        }
                        System.out.println("--- Menu ---\n1. Listar recursos\n2. Salir\nIngrese su eleccion: ");
                        elec = papoy.nextInt(); 
                    }
                }else if (Usuarios.get(pos).getTipo_user().equals("profesor")){
                    System.out.println("--- Menu ---\n1. Listar recursos\n2. Crear recurso\n3. Salir\nIngrese su eleccion: ");
                    int elec = papoy.nextInt(); 
                    while (elec > 0 && elec < 3){
                        switch (elec){
                            case 1: 
                                listar(Base); 
                                break; 
                            case 2: 
                                System.out.println("--- Crear ---\n1. Libro\n2. Articulos\n3. Cursos en linea\n4. Conferencias Virtuales\nIngrese su eleccion: "); 
                                int recurso = papoy.nextInt(); 
                                switch(recurso){
                                    case 1: 
                                        System.out.println("-- Crear Libro\nIngrese el titulo: ");
                                        String titulo = papoy.next(); 
                                        System.out.println("Ingrese el autor: ");
                                        String autor = papoy.next();
                                        System.out.println("Ingrese el genero: ");
                                        String genero = papoy.next();
                                        System.out.println("Ingrese el año de publicacion: ");
                                        String anio = papoy.next();
                                        System.out.println("Ingrese la disponibilidad");
                                        String dispo = papoy.next(); 
                                        boolean d = false; 
                                        if (dispo.equalsIgnoreCase("si")){
                                            d = true; 
                                        }
                                        Base.add(new Libro(titulo, autor, genero, anio, d)); 
                                        break; 
                                    case 2: 
                                        System.out.println("-- Crear Articulo\nIngrese el titulo: ");
                                        titulo = papoy.next(); 
                                        System.out.println("Ingrese el autor: ");
                                        autor = papoy.next();
                                        System.out.println("Ingrese el tema: ");
                                        String tema = papoy.next();
                                        System.out.println("Ingrese la fecha de publicacion: ");
                                        String fechapub = papoy.next();
                                        System.out.println("Ingrese el acceso en linea: ");
                                        String acceso = papoy.next(); 
                                        boolean acc = false; 
                                        if (acceso.equalsIgnoreCase("si")){
                                            acc = true; 
                                        }
                                        Base.add(new Articulos(titulo, autor, tema, fechapub, acc)); 
                                        
                                        break; 
                                    case 3: 
                                        System.out.println("-- Crear Curso en Linea\nIngrese el titulo: ");
                                        titulo = papoy.next(); 
                                        System.out.println("Ingrese el instructor: ");
                                        String instructor = papoy.next();
                                        System.out.println("Ingrese la duracion: ");
                                        String duracion = papoy.next();
                                        System.out.println("Ingrese la plataforma de enseñanza: ");
                                        String plataforma = papoy.next(); 
                                        Base.add(new CursosEnLinea(titulo, instructor, duracion, plataforma)); 
                                        break; 
                                    case 4: 
                                        System.out.println("-- Crear Conferencia Virtual\nIngrese el titulo: ");
                                        titulo = papoy.next(); 
                                        System.out.println("Ingrese el conferencista: ");
                                        String conferencista = papoy.next();
                                        System.out.println("Ingrese la fecha: ");
                                        String fecha = papoy.next();
                                        System.out.println("Ingrese el enlace de acceso: ");
                                        String enlace = papoy.next(); 
                                        Base.add(new ConferenciasVirtuales(titulo, conferencista, fecha, fecha, enlace)); 
                                        break; 
                                }
                                break; 
                            
                        }
                        System.out.println("--- Menu ---\n1. Listar recursos\n2. Crear recurso\n3. Salir\nIngrese su eleccion: ");
                        elec = papoy.nextInt(); 
                    }
                
                }else if(Usuarios.get(pos).getTipo_user().equals("bibliotecario")){
                
                    System.out.println("--- Menu ---\n1. Listar recursos\n2. Crear recurso\n3.Eliminar Recurso\n4.Modificar recurso\n5. Salir\nIngrese su eleccion: ");
                    int elec = papoy.nextInt(); 
                    while (elec > 0 && elec < 5){
                        switch (elec){
                            case 1: 
                                listar(Base); 
                                break; 
                            case 2: 
                                System.out.println("--- Crear ---\n1. Libro\n2. Articulos\n3. Cursos en linea\n4. Conferencias Virtuales\nIngrese su eleccion: "); 
                                int recurso = papoy.nextInt(); 
                                switch(recurso){
                                    case 1: 
                                        System.out.println("-- Crear Libro\nIngrese el titulo: ");
                                        String titulo = papoy.next(); 
                                        System.out.println("Ingrese el autor: ");
                                        String autor = papoy.next();
                                        System.out.println("Ingrese el genero: ");
                                        String genero = papoy.next();
                                        System.out.println("Ingrese el año de publicacion: ");
                                        String anio = papoy.next();
                                        System.out.println("Ingrese la disponibilidad");
                                        String dispo = papoy.next(); 
                                        boolean d = false; 
                                        if (dispo.equalsIgnoreCase("si")){
                                            d = true; 
                                        }
                                        Base.add(new Libro(titulo, autor, genero, anio, d)); 
                                        break; 
                                    case 2: 
                                        System.out.println("-- Crear Articulo\nIngrese el titulo: ");
                                        titulo = papoy.next(); 
                                        System.out.println("Ingrese el autor: ");
                                        autor = papoy.next();
                                        System.out.println("Ingrese el tema: ");
                                        String tema = papoy.next();
                                        System.out.println("Ingrese la fecha de publicacion: ");
                                        String fechapub = papoy.next();
                                        System.out.println("Ingrese el acceso en linea: ");
                                        String acceso = papoy.next(); 
                                        boolean acc = false; 
                                        if (acceso.equalsIgnoreCase("si")){
                                            acc = true; 
                                        }
                                        Base.add(new Articulos(titulo, autor, tema, fechapub, acc)); 
                                        
                                        break; 
                                    case 3: 
                                        System.out.println("-- Crear Curso en Linea\nIngrese el titulo: ");
                                        titulo = papoy.next(); 
                                        System.out.println("Ingrese el instructor: ");
                                        String instructor = papoy.next();
                                        System.out.println("Ingrese la duracion: ");
                                        String duracion = papoy.next();
                                        System.out.println("Ingrese la plataforma de enseñanza: ");
                                        String plataforma = papoy.next(); 
                                        Base.add(new CursosEnLinea(titulo, instructor, duracion, plataforma)); 
                                        break; 
                                    case 4: 
                                        System.out.println("-- Crear Conferencia Virtual\nIngrese el titulo: ");
                                        titulo = papoy.next(); 
                                        System.out.println("Ingrese el conferencista: ");
                                        String conferencista = papoy.next();
                                        System.out.println("Ingrese la fecha: ");
                                        String fecha = papoy.next();
                                        System.out.println("Ingrese el enlace de acceso: ");
                                        String enlace = papoy.next(); 
                                        Base.add(new ConferenciasVirtuales(titulo, conferencista, fecha, fecha, enlace)); 
                                        break; 
                                }
                                break; 
                            case 3: 
                                System.out.println("-- ELIMINAR --\n1. Con titulo\n2. Con indice\nIngresesu eleccion: ");
                                int eliminar = papoy.nextInt(); 
                                switch (eliminar){
                                    case 1: 
                                        System.out.println("Ingrese el titulo del recurso que desea eliminar: ");
                                        String tituloe = papoy.next(); 
                                        eliminarRecursoTitulo(tituloe, Base); 
                                        break; 
                                    case 2: 
                                        System.out.println("Ingrese el indice del recurso que desea eliminar: ");
                                        int indice = papoy.nextInt(); 
                                        Base.remove(indice); 
                                        break;       
                                }
                                
                                
                                
                                
                                break; 
                                
                            case 4: 
                                
                                break;
                                
                            
                        }
                        System.out.println("--- Menu ---\n1. Listar recursos\n2. Crear recurso\n3. Salir\nIngrese su eleccion: ");
                        elec = papoy.nextInt(); 
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                }
                
            }else{
                System.out.println("El usuario que Ingreso no existe en nuestra base\nVuelva a Ingresarlo: ");
                //falta hacer el
            }
        
        
        
        
        
    }//fin main
    
    public static int esUsuario(String user, String pass, ArrayList<Usuario> base){
        //metodo que me devuelve la posicion de el usuario si existe y concuerda
        int contador = 0; 
        for (int i = 0; i < base.size(); i++) {
            Usuario usuario = Usuarios.get(i); 
            if (usuario.getNombre().equals(user) && usuario.getContraseña().equalsIgnoreCase(pass)){
                contador = i;
                break; 
            }
        }
        return contador; 
    }
    
    public static void listar(ArrayList base){
        for (int i = 0; i < base.size(); i++) {
            Object recurso = base.get(i); 
            System.out.println((i+1)+" "+recurso.toString());
        }
    }
    
    public static void eliminarRecursoTitulo(String elim, ArrayList base){
        for (int i = 0; i < base.size(); i++) {
            Object recurso = base.get(i); 
            if (recurso instanceof Libro){
                Libro libro = (Libro)recurso; 
                String el = libro.getTitulo(); 
                if (el.equalsIgnoreCase(elim)){
                    Base.remove(recurso); 
                }
            }else if (recurso instanceof Articulos){
                Articulos art = (Articulos)recurso;
                String nom = art.getTitulo(); 
                if (nom.equalsIgnoreCase(elim)){
                    Base.remove(recurso); 
                }   
            }else if (recurso instanceof CursosEnLinea){
                CursosEnLinea curso = (CursosEnLinea)recurso; 
                String cur = curso.getTitulo(); 
                if (cur.equalsIgnoreCase(elim)){
                    Base.remove(recurso); 
                }
            }else if (recurso instanceof ConferenciasVirtuales){
                ConferenciasVirtuales conferencia = (ConferenciasVirtuales)recurso; 
                String confe = conferencia.getTitulo(); 
                if (confe.equalsIgnoreCase(elim)){
                    Base.remove(recurso); 
                }
            }else{
                System.out.println("El recurso parece no existir");
            }
        }
    }
   
    
}
