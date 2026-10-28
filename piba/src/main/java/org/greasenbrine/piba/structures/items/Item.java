/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.greasenbrine.piba.structures.items;


public class Item implements CoreItem {
    private int id;
    private String name;
    private String description;
    private int value;
    private String category;

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
    public int setID() {
        return id;
    }

    @Override
    public String setName() {
        return name;
    }

    @Override
    public String setDescription() {
        return description;
    }

    @Override
    public int setValue() {
        return value;
    }

    @Override
    public String setCategory() {
        return category;
    }

}
