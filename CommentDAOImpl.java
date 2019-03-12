package com.dao.org;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.extra.org.*;

import model.Post;

public class CommentDAOImpl implements CommentDAO {
	private static Connection con;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public int insert(Comment comment) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into comment (text) values(?)");
			pst.setString(1, comment.getText());
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	

	public int delete(int c_id) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("delete from comment where c_id = ?");
			pst.setInt(1, c_id);
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public List<Comment> view() {

		ArrayList<Comment> list = new ArrayList<Comment>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from comment");
			while (rs.next()) {
				list.add(new Comment(rs.getInt(1), rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public Comment view(int id) {
		Comment comment = new Comment();
		try {
			PreparedStatement pst = con.prepareStatement("select * from posts where id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				comment = new Comment(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  comment;
	}
}
