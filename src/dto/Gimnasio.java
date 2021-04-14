package dto;

import java.io.Serializable;

public class Gimnasio implements Dto, Serializable
{
    private static final long       serialVersionUID = 916479397570182364L;
    private String nombre;
    private String direccion;
    private int mensualidad;
    private int tipoGimnasioId;

    public Gimnasio(String nombre,String direccion, int mensualidad,int tipoGimnasioId)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.mensualidad = mensualidad;
        this.tipoGimnasioId = tipoGimnasioId;
    }
    public Gimnasio(String nombre)
    {
        this.nombre = nombre;
    }
    public Gimnasio()
    {
    }

    @Override
    public String insert() {
        String sql = "INSERT INTO public.Gimnasio(nombre,direccion, mensualidad, tipoGimnasio) VALUES ("
                + nombre +", '"
                + direccion.trim() + "','"
                + mensualidad + "','" + tipoGimnasioId + "','" ;
        System.out.println(sql);
        return sql;
    }
        

    @Override
    public String read() {
        return "SELECT * FROM Gimnasio";
    }

    @Override
    public String update() {
        return null;
    }

    @Override
    public String delete() {
        return "DELETE FROM Gimnasio WHERE nombre = " + nombre;
    }

    @Override
    public String findById() {
        return "SELECT * FROM Gimnasio WHERE nombre = " + nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(int mensualidad) {
        this.mensualidad = mensualidad;
    }

    public int getTipoGimnasioId() {
        return tipoGimnasioId;
    }

    public void setTipoGimnasioId(int tipoGimnasioId) {
        this.tipoGimnasioId = tipoGimnasioId;
    }
    public String toString() {
        return "Gimnasio{" +
                "nombre=" + nombre +
                ", direccion='" + direccion + '\'' +
                ", mensualidad='" + mensualidad + '\'' +
                ", tipoGimnasio='" + tipoGimnasioId + '\''+
                '}';
    }
}
