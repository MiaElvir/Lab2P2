
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
                                listar(Base); 
                                break; 
                            
                        }
                        System.out.println("--- Menu ---\n1. Listar recursos\n2. Crear recurso\n3. Salir\nIngrese su eleccion: ");
                        elec = papoy.nextInt(); 
                    }
                
                }else if(Usuarios.get(pos).getTipo_user().equals("bibliotecario")){
                
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
            System.out.println((i+1)+recurso.toString());
        }
    }
   
    
}
