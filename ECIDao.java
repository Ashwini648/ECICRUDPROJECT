package com.tka.eci.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.eci.entity.ECICandidate;

public class ECIDao {
	List<ECICandidate> allCandidates = null;

    public List<ECICandidate> getAllCandidates() {
        String path = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3307/advjava193";
        String usname = "root";
        String pwd = "root";
        String select = "Select * from advjava193.candidates";
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            Class.forName(path);
            conn = DriverManager.getConnection(url, usname, pwd);
            statement = conn.createStatement();
            rs = statement.executeQuery(select);
            allCandidates = new ArrayList<ECICandidate>();

            while (rs.next()) {
                int id = rs.getInt("cid");
                String name = rs.getString("name");
                String assembly = rs.getString("assembly");
                String party = rs.getString("partyname");
                String state = rs.getString("statename");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");

                ECICandidate obj = new ECICandidate(id, name, assembly, party, state, age, gender);
                allCandidates.add(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (statement != null) statement.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return allCandidates;
    }
}
