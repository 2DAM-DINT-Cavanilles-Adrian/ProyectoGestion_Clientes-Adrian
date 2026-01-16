/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Cliente {
    
    private String nombre;
    private String apellidos;
    private Date fechaAlta;
    private String provincia;

    private String email;
    private String telefono;

    public Cliente(String nombre, String apellidos, Date fechaAlta, String provincia, String email, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
        this.email = email;
        this.telefono = telefono;
    }

public String[] toArrayString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = sdf.format(this.fechaAlta);
        
        return new String[]{ 
            nombre, 
            apellidos, 
            fechaFormateada, 
            provincia, 
            email, 
            telefono 
        };
    }

 public String getNombre() { return nombre; }
 
 public void setNombre(String nombre) { this.nombre = nombre; }
 
 public String getApellidos() { return apellidos; }
 
 public void setApellidos(String apellidos) { this.apellidos = apellidos; }
 
 public Date getFechaAlta() { return fechaAlta; }
 
 public void setFechaAlta(Date fechaAlta) { this.fechaAlta = fechaAlta; }
 
 public String getProvincia() { return provincia; }
 
 public void setProvincia(String provincia) { this.provincia = provincia; }
 
 public String getEmail() { return email; }
 
 public void setEmail(String email) { this.email = email; }
 
 public String getTelefono() { return telefono; }
 
 public void setTelefono(String telefono) { this.telefono = telefono; }
 
}
