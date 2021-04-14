package dto;

import java.io.Serializable;

public class Instructor implements Dto, Serializable
{
    private static final long       serialVersionUID = 916479397570182364L;
    private int cedula;
    private String nombre;


    public Instructor(int cedula,String nombre)
    {
        this.cedula = cedula;
        this.nombre = nombre;

    }
    public Instructor(int cedula) {
        this.cedula = cedula;
    }

    public Instructor()
    {
    }
    public String insert(){

        String sql = "INSERT INTO public.person(cedula, nombre)  VALUES ("
                + cedula +", '"
                +nombre.trim() + "','"
                + "');";
        System.out.println(sql);
        return sql;
    }

    @Override
    public String read() {
        return "SELECT * FROM Instructor";
    }

    @Override

    public String update() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String delete() {
        return "DELETE FROM Instructor WHERE cedula = " + cedula;
    }

    @Override
    public String findById()
    {
      return  "SELECT * FROM Instructor WHERE cedula = " + cedula;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString() {
        return "Person{" +
                "Cedula=" + cedula +
                ", Nombre='" + nombre + '\'' +
                '}';
    }
}
