package dto;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
public class Usuario implements dto, Serializable
{
    private static final long       serialVersionUID = 916479397570182364L;
    private int cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private String Instructorcedula;
    private String Gimnasionombre;

    public Usuario(int cedula,String nombre,String apellido,String genero,String instructorcedula,String gimnasionombre)
    {
    this.cedula = cedula;
    this.nombre = nombre;
    this.apellido = apellido;
    this.genero = genero;
    this.Gimnasionombre = gimnasionombre;
    this.Instructorcedula = instructorcedula;
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
                + apellido.trim() + "','" + genero.trim() + "','" + Gimnasionombre.trim() + "','" + Instructorcedula.trim()
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
        return "DELETE FROM Usuario WHERE id_person = " + cedula;
    }

    public String findById()
    {
        return "SELECT * FROM Usuario WHERE id_person = " + cedula;
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

    public String getName()
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



}
