/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.service;

import com.coderbd.conn.DbConnection;
import com.coderbd.domain.QuizCategory;
import com.coderbd.domain.QuizLevel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rajail Islam
 */
public class QuizLevelService {
     private Connection conn = DbConnection.getConnection();

    public List<QuizLevel> getLevels(QuizCategory category) {
        List<QuizLevel> levels = new ArrayList();
        QuizLevel level = null;
        try {

            PreparedStatement pstm = conn.prepareStatement("select * from quiz_level where category_id=?");
            pstm.setInt(1, category.getId());
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                level = new QuizLevel();
                level.setId(rs.getInt(1));
                level.setLevel(rs.getString(2));
                levels.add(level);
            }

        } catch (Exception e) {
        }
        return levels;
    }
 
}
