package com.coderbd.service;

import com.coderbd.conn.DbConnection;
import com.coderbd.domain.QuizCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Rajaul Islam
 */
public class QuizCategoryService {

    private Connection conn = DbConnection.getConnection();

    public QuizCategory getCategory(int id) {
        QuizCategory category = null;
        try {

            PreparedStatement pstm = conn.prepareStatement("select * from quiz_category where id=?");
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                category = new QuizCategory();
                category.setId(rs.getInt(1));
                category.setCategoryName(rs.getString(2));
                category.setNote(rs.getString(3));
                category.setStatus(rs.getString(4));
            }

        } catch (Exception e) {
        }
        return category;
    }

  
}
