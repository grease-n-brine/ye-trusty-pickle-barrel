/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.greasenbrine.piba.structures.items;
import org.greasenbrine.piba.structures.labels.Tag;


public class Item implements CoreItem {
    private int id;
    private String name;
    private String description;
    private int value;
    private String category;
    private Tag[] tags;

    public Tag[] getTags() {
        return tags;
    }

    public void setTags(Tag[] tags) {
        this.tags = tags;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

}
