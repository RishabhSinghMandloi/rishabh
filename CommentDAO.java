package com.dao.org;

import java.util.List;

import com.extra.org.Comment;

public interface CommentDAO {
	int insert(Comment comment);

	int delete(int c_id);

	List<Comment> view();

	Comment view(int c_id);

}
