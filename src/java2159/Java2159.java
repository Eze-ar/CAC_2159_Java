package java2159;

import java.util.Scanner;

/**
 *
 * @author Adrián Ezequiel Angió
 */

class Usuario {
    private String nombre;
    private String apellido;
    private String hobbie;
    private String editor;
    private String sisop;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String hobbie, String editor, String sisop, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.hobbie = hobbie;
        this.editor = editor;
        this.sisop = sisop;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getHobbie() {
        return hobbie;
    }

    public String getEditor() {
        return editor;
    }

    public String getSisop() {
        return sisop;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setSisop(String sisop) {
        this.sisop = sisop;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Recopilación de datos ingresados:\n" + nombre + " " + apellido +
                " " + edad + " años\n" + "hobbie: " + hobbie + 
                "\neditor preferido: " + this.editor + "\nSist. operativo: " + sisop;
    }
        
}

public class Java2159 {
    
    public static void main(String[] args) {
        Usuario us = new Usuario();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los siguientes datos: \n nombre: ");
        us.setNombre(sc.nextLine());
        
        System.out.println("apellido: ");
        us.setApellido(sc.nextLine());
        
        System.out.println("edad: ");
        us.setEdad(Integer.parseInt(sc.nextLine()));
        
        System.out.println("hobbie: ");
        us.setHobbie(sc.nextLine());
        
        System.out.println("editor de código preferido: ");
        us.setEditor(sc.nextLine());
        
        System.out.println("sistema operativo: ");
        us.setSisop(sc.nextLine());
        
        //ahora muestro lo ingresado
        System.out.println("\n\n" + us.toString());
    }
    
}
