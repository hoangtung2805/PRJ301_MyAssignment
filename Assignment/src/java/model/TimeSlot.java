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
public class TimeSlot {
    private int id;
    private String description;
    private ArrayList<Seesion> seesions = new ArrayList<>();

    public TimeSlot() {
    }

    public TimeSlot(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Seesion> getSeesions() {
        return seesions;
    }

    public void setSeesions(ArrayList<Seesion> seesions) {
        this.seesions = seesions;
    }
    
    
}
