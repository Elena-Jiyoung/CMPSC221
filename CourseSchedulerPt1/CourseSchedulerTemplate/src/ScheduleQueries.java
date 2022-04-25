/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author kinner
 */
public class ScheduleQueries {
    private static Connection connection;
    private static ArrayList<String> faculty = new ArrayList<String>();
    private static PreparedStatement addScheduleEntry;
    private static PreparedStatement getScheduleByStudent;
    private static PreparedStatement getScheduleByStudentCount;
    private static ResultSet resultSet;

    public static void addScheduleEntry(ScheduleEntry entry)
    {
        connection = DBConnection.getConnection();
        try
        {
            addScheduleEntry = connection.prepareStatement("insert into app.schedule (semester, studentid, coursecode, status, timestamp) values (?, ?, ?, ?, ?)");
            addScheduleEntry.setString(1, entry.getSemester());
            addScheduleEntry.setString(2, entry.getStudentID());
            addScheduleEntry.setString(3, entry.getCourseCode());
            addScheduleEntry.setString(4, entry.getStatus());
            addScheduleEntry.setTimestamp(5, entry.getTimestamp());
            addScheduleEntry.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }

    public static ArrayList<ScheduleEntry> getScheduleByStudent(String semester, String studentID)
    {
        ArrayList<ScheduleEntry> faculty = new ArrayList<ScheduleEntry>();
        connection = DBConnection.getConnection();
        try
        {
            getScheduleByStudent = connection.prepareStatement("select semester, coursecode, studentid, status, timestamp from app.schedule where studentid = ?");
            getScheduleByStudent.setString(1, studentID);
            resultSet = getScheduleByStudent.executeQuery();
            
            while(resultSet.next())
            {
                faculty.add(new ScheduleEntry(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getTimestamp(5)));
            }

        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
            
        }
        return faculty;
    }

    public static int getScheduledStudentCount(String currentSemester, String courseCode)
    {
        int count = 0;
        connection = DBConnection.getConnection();
        try
        {
            getScheduleByStudent = connection.prepareStatement("select studentid from app.schedule where semester = ? and courseCode = ?");
            getScheduleByStudent.setString(1, currentSemester);
            getScheduleByStudent.setString(2, courseCode);
            resultSet = getScheduleByStudent.executeQuery();
            
            while(resultSet.next())
            {
                count++;
            }
            
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return count;
    }
}
