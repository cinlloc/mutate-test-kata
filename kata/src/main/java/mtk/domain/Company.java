package mtk.domain;

import java.util.ArrayList;
import java.util.List;

public class Company
{
    private String name = "No name";

    public Company(String newName)
    {
        this.setName(newName);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }






}
