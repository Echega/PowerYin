package dto;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
public class Usuario implements Dto, Serializable
{
    private static final long       serialVersionUID = 916479397570182364L;
    private int cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private String instructorCedula;
    private String gimnasioNombre;

    public Usuario(int cedula,String nombre,String apellido,String genero,String instructorCedula,String gimnasioNombre)
    {
    this.cedula = cedula;
    this.nombre = nombre;
    this.apellido = apellido;
    this.genero = genero;
    this.gimnasioNombre = gimnasioNombre;
    this.instructorCedula = instructorCedula;
    }
    public Usuario (int cedula)
    {
        this.cedula = cedula;
    }
    public Usuario()
    {
    }
    public String insert() {

        String sql = "INSERT INTO public.Usuario (cedula, nombre, apellido, genero, Gimnasionombre, Instructorcedula) VALUES ("
                + cedula +", '"
                + nombre.trim() + "','"
                + apellido.trim() + "','"
                + genero.trim() + "','"
                + gimnasioNombre.trim() + "','"
                + instructorCedula.trim()
                + "');";
        System.out.println(sql);
        return sql;
    }

    public String update() {
        // TODO Auto-generated method stub
        return null;
    }
    public String delete()
    {
        return "DELETE FROM Usuario WHERE cedula = " + cedula;
    }

    public String findById()
    {
        return "SELECT * FROM Usuario WHERE cedula = " + cedula;
    }

    public String read()
    {
        return "SELECT * FROM Usuario";
    }

    public int getCedula()
    {
        return cedula;
    }

    public void setCedula(int cedula)
    {
        this.cedula = cedula;
    }

    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String name)
    {
        this.nombre = nombre;
    }
    public String getApellido()
    {
        return apellido;
    }
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    public String getGenero()
    {
        return genero;
    }
    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public String getgimnasioNombre()
    {
        return gimnasioNombre;
    }
    public void setgimnasioNombre(String gimnasioNombre)
    {
        this.gimnasioNombre= gimnasioNombre;
    }
    public String getInstructorCedula()
    {
        return instructorCedula;
    }
    public void setInstructorCedula(String instructorCedula)
    {
        this.instructorCedula= instructorCedula;
    }
    public String toString() {
        return "Usuario{" +
                "Cedula=" + cedula +
                ",Nombre ='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Genero='" + genero + '\'' +
                ", GimnasioNombre='" + gimnasioNombre + '\'' +
                ", InstructorCedula='" + instructorCedula + '\'' +
                '}';
    }


}
