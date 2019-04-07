/* 
 * Copyright (C) 2019 Ingeniero en computación: Ricardo Presilla.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Bean para el saludo.
 * @author Ingeniero en computación: Ricardo Presilla.
 * @version 1.0.
 */
@ManagedBean
@RequestScoped
public class RegistrationBean {
    /**
     * Almacena el saludo.
     */
    private String saludo;
    /**
     * Almacena el nombre.
     */
    private String nombre;
    /**
     * Almacena el apellido.
     */
    private String apellidos;
    /**
     * Almacena la edad en años.
     */
    private int edad;
    /**
     * Almacena el email.
     */
    private String email;
    /**
     * Creates a new instance of RegistrationBean
     */
    public RegistrationBean() {
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
