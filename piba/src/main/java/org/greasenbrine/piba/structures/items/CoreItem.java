package org.greasenbrine.piba.structures.items;

public interface CoreItem {
    public int getID();
    public String getName();
    public String getDescription();
    public int getValue();
    public String getCategory();
    void setID(int id);
    void setName(String name);
    void setDescription(String description);
    void setValue(int value);
    void setCategory(String category);
}
