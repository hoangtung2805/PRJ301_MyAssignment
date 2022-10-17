/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
class Seesion {
    private int id;
    private Group group;
    private Room room;
    private Lecturer lecturer;
    private TimeSlot slot;
    private ArrayList<Attandance> atts = new ArrayList<>();
    private Date date;
    private int index;
    private boolean attanded; 

    public Seesion() {
    }

    public Seesion(int id, Group group, Room room, Lecturer lecturer, TimeSlot slot, Date date, int index, boolean attanded) {
        this.id = id;
        this.group = group;
        this.room = room;
        this.lecturer = lecturer;
        this.slot = slot;
        this.date = date;
        this.index = index;
        this.attanded = attanded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public TimeSlot getSlot() {
        return slot;
    }

    public void setSlot(TimeSlot slot) {
        this.slot = slot;
    }

    public ArrayList<Attandance> getAtts() {
        return atts;
    }

    public void setAtts(ArrayList<Attandance> atts) {
        this.atts = atts;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isAttanded() {
        return attanded;
    }

    public void setAttanded(boolean attanded) {
        this.attanded = attanded;
    }
    
}
