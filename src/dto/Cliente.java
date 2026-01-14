/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;

public class Cliente {
    
private String nombre;
private String apellidos;
private Date fechaAlta;
private String provincia;

public Cliente(String nombre, String apellidos, Date fechaAlta, String provincia) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.fechaAlta = fechaAlta;
    this.provincia = provincia;
}

public String[] toArrayString() {
    // 1. Creamos el formato deseado
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
    
    // 2. Convertimos la fecha (Date) a una cadena de texto (String) con ese formato
    String fechaFormateada = sdf.format(this.fechaAlta);
    
    // 3. Devolvemos el array con la fecha ya bonita
    return new String[]{ nombre, apellidos, fechaFormateada, provincia };
}

 public String getNombre() { return nombre; }
 
 public void setNombre(String nombre) { this.nombre = nombre; }
 
 public String getApellidos() { return apellidos; }
 
 public void setApellidos(String apellidos) { this.apellidos = apellidos; }
 
 public Date getFechaAlta() { return fechaAlta; }
 
 public void setFechaAlta(Date fechaAlta) { this.fechaAlta = fechaAlta; }
 
 public String getProvincia() { return provincia; }
 
 public void setProvincia(String provincia) { this.provincia = provincia; }
 
}
