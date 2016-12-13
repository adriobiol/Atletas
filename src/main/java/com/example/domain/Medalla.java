package com.example.domain;

import javax.persistence.*;


@Entity
public class Medalla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Enumerated(EnumType.STRING)
    private TipoMedalla Tipo;
    private String Especialidad;
    private String Competicion;
    @ManyToOne
    private Atleta atleta;

    public Medalla() {
    }

    public Medalla(TipoMedalla Tipo, String Especialidad, String Competicion) {
        this.Tipo = Tipo;
        this.Especialidad = Especialidad;
        this.Competicion = Competicion;
    }
    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
    public TipoMedalla getTipo() {return Tipo;}
    public void setTipo(TipoMedalla tipo) {this.Tipo = tipo;}
    public String getEspecialidad() {return Especialidad;}
    public void setEspecialidad(String especialidad) {this.Especialidad = especialidad;}
    public String getCompeticion() {return Competicion;}
    public void setCompeticion(String competicion) {this.Competicion = competicion;}
    public Atleta getAtleta() {return atleta;}
    public void setAtleta(Atleta atleta) {this.atleta = atleta;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Medalla medalla = (Medalla) o;

        if (id != medalla.id) return false;
        if (Tipo != medalla.Tipo) return false;
        if (Especialidad != null ? !Especialidad.equals(medalla.Especialidad) : medalla.Especialidad != null) return false;
        if (Competicion != null ? !Competicion.equals(medalla.Competicion) : medalla.Competicion != null) return false;
        return atleta != null ? atleta.equals(medalla.atleta) : medalla.atleta == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (Tipo != null ? Tipo.hashCode() : 0);
        result = 31 * result + (Especialidad != null ? Especialidad.hashCode() : 0);
        result = 31 * result + (Competicion != null ? Competicion.hashCode() : 0);
        result = 31 * result + (atleta != null ? atleta.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Medalla{" +
                "id=" + id +
                ", Tipo=" + Tipo +
                ", Especialidad='" + Especialidad + '\'' +
                ", Competicion='" + Competicion + '\'' +
                ", atleta=" + atleta +
                '}';
    }
}
