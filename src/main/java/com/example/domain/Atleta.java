package com.example.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Nombre;
    private String Apellido;
    private String Nacionalidad;
    private LocalDate Nacimiento;
    @OneToMany(mappedBy = "athlete")
    @JsonIgnore
    private Set<Medalla> medallas = new HashSet<>();

    public Atleta() {
    }

    public Atleta(String Nombre, String Apellido, String Nacionalidad, LocalDate Nacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nacionalidad = Nacionalidad;
        this.Nacimiento = Nacimiento;
    }

    public Set<Medalla> getMedallas() {return medallas;}
    public void setMedallas(Set<Medalla> medallas) {
        this.medallas = medallas;
    }
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public String getNombre() {return Nombre;}
    public void setNombre(String nombre) {this.Nombre = nombre;}
    public String getApellido() {return Apellido;}
    public void setApellido(String apellido) {this.Apellido = apellido;}
    public String getNacionalidad() {return Nacionalidad;}
    public void setNacionalidad(String nacionalidad) {this.Nacionalidad = nacionalidad;}
    public LocalDate getNacimiento() {return Nacimiento;}
    public void setNacimiento(LocalDate nacimiento) {this.Nacimiento = nacimiento;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Atleta that = (Atleta) o;

        if (id != that.id) return false;
        if (Nombre != null ? !Nombre.equals(that.Nombre) : that.Nombre != null) return false;
        if (Apellido != null ? !Apellido.equals(that.Apellido) : that.Apellido != null) return false;
        if (Nacionalidad != null ? !Nacionalidad.equals(that.Nacionalidad) : that.Nacionalidad != null) return false;
        return Nacimiento != null ? Nacimiento.equals(that.Nacimiento) : that.Nacimiento == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (Nombre != null ? Nombre.hashCode() : 0);
        result = 31 * result + (Apellido != null ? Apellido.hashCode() : 0);
        result = 31 * result + (Nacionalidad != null ? Nacionalidad.hashCode() : 0);
        result = 31 * result + (Nacimiento != null ? Nacimiento.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Nacionalidad='" + Nacionalidad + '\'' +
                ", Nacimiento=" + Nacimiento +
                '}';
    }
}
