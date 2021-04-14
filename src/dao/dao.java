package dao;

import dto.Dto;

public abstract class dao <T extends Dto>
{
    protected dao(){}

    public String insert(Dto data)
    {
        return data.insert();
    }

    public String read(Dto data)
    {
        return data.read();
    }

    public String update(Dto data)
    {
        return data.update();
    }

    public String delete(Dto data)
    {
        return data.delete();
    }

    public String findById(Dto data)
    {
        return data.findById();
    }
}
