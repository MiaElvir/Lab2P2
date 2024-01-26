
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
        
        if (esUsuario(user, contra, Usuarios) != 0){
            
        }else{
            System.out.println("El usuario que Ingreso no existe en nuestra base\nSaliendo del programa");
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
    
}
