package com.curd.org;

import java.util.List;
import java.util.Scanner;

import com.dao.org.CommentDAOImpl;

import model.Post;
import com.extra.org.Comment;

public class CommentCurd {
	public static void main(String[] args) {
		CommentDAOImpl dao = new CommentDAOImpl();

		Scanner s = new Scanner(System.in);

		int doFlag = -1;

		do {
			System.out.println("1.Insert\n2.Delete\n3.View All Comment\n4.Search a Comment");
			int ch = s.nextInt();
			s.nextLine();
			switch (ch) {
			case 1:

				System.out.println("Enter Comment text");
				Comment comment = new Comment(0, s.nextLine());

				int res = dao.insert(comment);

				System.out.println("Rows inserted=" + res);

				break;

			case 2:
				System.out.println("Enter id of the comment to be deleted");
				int c_id = s.nextInt();
				s.nextLine();
				res = dao.delete(c_id);
				System.out.println("Rows deleted=" + res);
				break;

			case 3:

				List<Comment> list = dao.view();

				for (Comment c : list) {
					System.out.println(c);
				}

				break;

			case 4:
				System.out.println("Enter id of the Post to be searched");
				c_id = s.nextInt();
				s.nextLine();
				comment = dao.view(c_id);
				System.out.println(comment);
				break;

			default:
				System.out.println("Invalid Input Choice");
			}

			System.out.println("RE RUN ? 1.YES\t2.NO");
			doFlag = s.nextInt();
			s.nextLine();

		} while (doFlag == 1);
	}
}
