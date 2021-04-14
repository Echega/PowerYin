package dto;

import java.io.Serializable;



    public class Usuario implements Dto, Serializable
    {
        private static final long       serialVersionUID = 916479397570182364L;
        private int cedula;
        private String nombre;


        public Usuario(int cedula,String nombre)
        {
            this.cedula = cedula;
            this.nombre = nombre;

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
            return "DELETE FROM Instructor WHERE cedula = " + cedula;
        }

        public String findById()
        {
            return "SELECT * FROM Instructor WHERE cedula = " + cedula;
        }

        public String read()
        {
            return "SELECT * FROM Instructor";
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

        public String toString() {
            return "Usuario{" +
                    "Cedula=" + cedula +
                    ",Nombre ='" + nombre + '\'' +
                    '}';
        }

    }

