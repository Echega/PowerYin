package dto;

import java.io.Serializable;

public class TipoGimnasio implements Dto, Serializable
{
    private static final long       serialVersionUID = 916479397570182364L;
    private int id;
    private String enfoque;

    public TipoGimnasio(int id, String enfoque)
    {
        this.id = id;
        this.enfoque = enfoque;
    }
    public TipoGimnasio(int id)
    {
        this.id = id;
    }

    @Override
    public String insert() {
        String sql = "INSERT INTO public.TipoGimnasio(id, enfoque) VALUES ("
                + id +", '"
                + enfoque.trim() + "','"
                + "');";
        System.out.println(sql);
        return sql;
    }

    @Override
    public String read() {
        return "SELECT * FROM TipoGimnasio";
    }


    @Override
    public String update() {
        return null;
    }

    @Override
    public String delete() {
        return "DELETE FROM TipoGimnasio WHERE id = " + id;
    }

    @Override
    public String findById() {
        return "SELECT * FROM TipoGimnasio WHERE id = " + id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnfoque() {
        return enfoque;
    }

    public void setEnfoque(String enfoque) {
        this.enfoque = enfoque;
    }
    public String toString() {
        return "TipoGimnasio{" +
                "id=" + id +
                ", enfoque='" + enfoque + '\'' +
                '}';
    }
}
