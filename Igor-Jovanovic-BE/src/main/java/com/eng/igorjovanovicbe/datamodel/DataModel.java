package com.eng.igorjovanovicbe.datamodel;

import com.eng.igorjovanovicbe.entity.Examination;
import com.eng.igorjovanovicbe.entity.Organization;
import com.eng.igorjovanovicbe.entity.Patient;
import com.eng.igorjovanovicbe.entity.Practitioner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.*;

public class DataModel {
    public static final String user="root";
    public static final String password="12345678";
    public static final String FILE_NAME="Dump20221010.sql";
    public static final String FILE_LOCATION=
            "jdbc:mysql://localhost:3306/medicalorg";

    private static DataModel instance=new DataModel();
    private static Connection connection;

    private static ObservableList<Organization> organizations;
    private static ObservableList<Practitioner> practitioners;
    private static ObservableList<Patient> patients;
    private static ObservableList<Examination> examinations;


    private DataModel() {
        organizations = FXCollections.observableArrayList();
        practitioners=FXCollections.observableArrayList();
        patients=FXCollections.observableArrayList();
        examinations=FXCollections.observableArrayList();
    }

    public static DataModel getInstance(){return instance;}


    public  ObservableList<Organization> getOrganization() {
        return  organizations;
    }

    public void addOrganization(Organization item) {
        organizations.add(item);
    }

    public void deleteOrganization(Organization item) {
        organizations.remove(item);
    }

    public static void loadOrganizations() {
        ResultSet rs=null;

        try {
           connection=DriverManager.getConnection(FILE_LOCATION,user,password);
            Statement statement=connection.createStatement();
             rs=statement.executeQuery("SELECT * FROM organization");

            while (rs.next()){
                int identifier=rs.getInt("identifier");
                boolean active=rs.getBoolean("active");
                String type=rs.getString("type");
                String name=rs.getString("name");
                String address=rs.getString("address");
                String phone=rs.getString("phone");
                String email=rs.getString("email");

                organizations.add(new Organization(identifier,active,type,name,address,phone,email));

            }
//            statement.execute("DELETE FROM contacts");
        }catch (SQLException e){
            System.out.println("How that Happened");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            try {
                if (rs != null){
                    rs.close();
                }
            }catch (SQLException e){
                System.out.println("close");
            }

            try {
                if (connection != null){connection.close();}

                }catch(SQLException e){
                    System.out.println("connection close");
                } }
                }


    public static void saveOrganizations() {
//        Statement statement=null;
//
//        try{
//            connection=DriverManager.getConnection(FILE_LOCATION);
//             statement=connection.createStatement();
//
//            for (Contact c:contacts){
//                statement.execute("INSERT INTO contacts values('"+c.getFirstName()+"','"+
//                        c.getLastName()+"','"+c.getPhoneNumber()+"','"+c.getNote()+"')");
//            }
//        }catch (SQLException e){
//            System.out.println(" Ohh well");
//            e.printStackTrace();
//        }finally {
//            try{
//                if (statement != null){
//                    statement.close();
//                }
//            }catch (SQLException e){
//                System.out.println("Statement closing");
//                e.printStackTrace();
//            }
//
//            try{
//                if (connection != null){
//                    connection.close();
//                }
//            }catch (SQLException e){
//                System.out.println("conn closing");
//                e.printStackTrace();
//            }
//        }
    }
}