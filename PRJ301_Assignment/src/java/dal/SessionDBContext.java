/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Group;
import model.Lecturer;
import model.Room;
import model.Session;
import model.Subject;
import model.TimeSlot;

/**
 *
 * @author PC
 */
public class SessionDBContext extends DBContext<Session>{

    @Override
    public void insert(Session model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Session model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Session model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Session get(int id) {
        try {
            String sql = "SELECT ses.sesid,ses.[index],ses.date,ses.attanded\n"
                        + "	,g.gid,g.gname\n"
                        + "	,r.rid,r.rname\n"
                        + "	,t.tid,t.[description] tdescription\n"
                        + "	,l.lid,l.lname\n"
                        + "	,sub.subid,sub.subname\n"
                        + "	,s.stdid,s.stdname\n"
                        + "	,ISNULL(a.present,0) present, ISNULL(a.[description],'') [description]\n"
                        + "		FROM [Session] ses\n"
                        + "		INNER JOIN Room r ON r.rid = ses.rid\n"
                        + "		INNER JOIN TimeSlot t ON t.tid = ses.tid\n"
                        + "		INNER JOIN Lecturer l ON l.lid = ses.lid\n"
                        + "		INNER JOIN [Group] g ON g.gid = ses.gid\n"
                        + "		INNER JOIN [Subject] sub ON sub.subid = g.subid\n"
                        + "		INNER JOIN [Student_Group] sg ON sg.gid = g.gid\n"
                        + "		INNER JOIN [Student] s ON s.stdid = sg.stdid\n"
                        + "		LEFT JOIN Attandance a ON s.stdid = a.stdid AND ses.sesid = a.sesid\n"
                        + "WHERE ses.sesid = ?";
        
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            Session ses = null;
            while(rs.next()){
                if(ses == null){
                    ses = new Session();
                    Room r = new Room();
                    r.setId(rs.getInt("rid"));
                    r.setName(rs.getString("rname"));
                    ses.setRoom(r);
                    
                    TimeSlot t = new TimeSlot();
                    t.setId(rs.getInt("tid"));
                    t.setDescription(rs.getString("tdescription"));
                    ses.setSlot(t);
                    
                    Lecturer l = new Lecturer();
                    l.setId(rs.getInt("lid"));
                    l.setName(rs.getString("lname"));
                    ses.setLecturer(l);
                    
                    Group g = new Group();
                    g.setId(rs.getInt("gid"));
                    g.setName(rs.getString("gname"));
                    ses.setGroup(g);
                    
                    Subject sub = new Subject();
                    sub.setId(rs.getInt("subid"));
                    sub.setName(rs.getString("subname"));
                    g.setSubject(sub);
                    
                }
            
        }
        } catch (SQLException ex) {
            Logger.getLogger(SessionDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public ArrayList<Session> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
