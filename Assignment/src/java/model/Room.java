/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Room {
    private int id;
    private String name;
    private ArrayList<Seesion> seesions = new ArrayList<>();

    public Room() {
    }

    public Room(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Seesion> getSeesions() {
        return seesions;
    }

    public void setSeesions(ArrayList<Seesion> seesions) {
        this.seesions = seesions;
    }
    
    
    
}
