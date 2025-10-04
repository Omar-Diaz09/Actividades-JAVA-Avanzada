package com.mycompany.consultorio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import com.google.gson.Gson;
import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Lenovo
 */
public class Consultorio {
    public static List<Doctor> listaDoctores = new ArrayList<>();
    public static List<Paciente> listaPacientes = new ArrayList<>();
    public static List<Cita> listaCitas = new ArrayList<>();
    public static void main(String[] args) {
         Scanner scanner =new Scanner(System.in);
         String usuario,contrasena;
         System.out.println("Bienvenidos consultorio ");
         System.out.println("Introduce tus credeciales");
         System.out.println("Usuario");
         usuario=scanner.nextLine();
         System.out.println("Contraseña");
         contrasena=scanner.nextLine();
         boolean esUsuarioValido=validarCredenciales(usuario, contrasena);
         if(esUsuarioValido==true ){
             menu();
             
         }
    }  
     static boolean validarCredenciales(String usuario,String contrasena){    
     
     if(usuario.equals("admin")&& contrasena.equals("123")){
         System.out.println("El usuario es correcto");
         return true;
     }
         System.out.println("Usuario incorrecto");
         return false;
     }
     static void altaMedico(){
         Scanner scanner=new Scanner(System.in);
         Doctor doctor =new Doctor();
         System.out.println("Dame nombre");
         doctor.Nombre=scanner.nextLine();
         System.out.println("Dame la especialidad");
         doctor.Especialidad=scanner.nextLine();
         listaDoctores.add(doctor);
      
        
     }
     static void verDoctores(){
         System.out.println("lista doctores");
         for (Doctor doctor : listaDoctores){
             System.err.println("Nombre:"+doctor.Nombre);
             System.err.println("Especialidad:"+doctor.Especialidad); 
     }  
     }
     static void altapaciente(){
         Scanner scanner=new Scanner (System.in);
         Paciente paciente =new Paciente();
         System.out.println("Dame nombre");
         Paciente.Nombre =Scanner.nextLine();
         System.out.println("Edad");
         Paciente.Edad=Scanner.nextLine();
         listaPacientes.add(paciente);
         
     }
     
     static void verpacientes(){
         System.out.println("lista pacientes");
         for (Paciente paciente : listaPacientes){
             System.err.println("Nombre:"+Paciente.Nombre);
             System.err.println("Especialidad:"+Paciente.Edad); 
     }  
     }
       static void verpacientes(){
         System.out.println("lista pacientes");
         for (Paciente paciente : listaPacientes){
             System.err.println("Nombre:"+Paciente.Nombre);
             System.err.println("Especialidad:"+Paciente.Edad); 
     
         } 
         
     static void altacitas(){
         Scanner scanner=new Scanner(System.in);
         Cita cita =new Cita();
         System.out.println("Dame nombre");
         Cita.nombre=scanner.nextLine();
         System.out.println("Dame la fecha");
         cita.fecha=scanner.nextLine();
         System.out.println("Dame Paciente");
         cita.paciente=scanner.nextLine();
         System.out.println("Dame Doctor");
         cita.doctor=scanner.nextLine();
         listaCitas.add(cita);
      
        
     }
     
     static void vercitas(){
         System.out.println("lista citas");
         for (Paciente cita : listaPacientes){
             System.err.println("Nombre:"+cita.Nombre);
             System.err.println("fecha:"+cita.Edad); 
             System.err.println("paciente:"+cita.paciente); 
             System.err.println("doctor:"+cita.doctor); 
     
         } 
         
   
     static void guardar(){
      String json = new Gson().toJson(listaDoctores);
		System.out.println(json);
     try{
         FileWriter writer =new FileWriter("ListaDoctores");
         writer.write(json);
         writer.close();
         
     } catch (IOException e){
         System.out.println("Ocurrio un error:"+ e.getLocalizedMessage());
     }
     
     }
     static void menu(){
         Scanner scanner =new Scanner(System.in);
         Integer opcion = 0;
         while(opcion!=8){
         System.out.println("1.Dar de alta medico");
         System.out.println("2.Dar de alta paciente");
         System.out.println("3.Dar de alta cita");
         System.out.println("4.Ver medico");
         System.out.println("5.Ver paciente");
         System.out.println("6.Ver citas");
         System.out.println("7.Guardar");
         System.err.println("8.Salir");
         System.out.println("Escribe una opcion");
         opcion=scanner.nextInt();
         switch (opcion){
             case 1:
                 altaMedico();
               break;
              case 2:
                  altapaciente();
               break;
              case 3:
                  altacitas();
               break;
              case 4:
                  verDoctores();
               break;
              case 5:
                  verpacientes();
                break;
              case 6:
                  vercitas();
                break;
              case 7:
                  guardar();
                  break;
              default:
                  opcion =8;
         }
         }        
         
     }
}
