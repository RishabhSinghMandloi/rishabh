package com.extra.org;

public class Comment {
	private int c_id;
	private String text;

	public Comment() {

	}

	public Comment(int c_id, String text) {
		super();
		this.c_id = c_id;
		this.text = text;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String toString()
	{
	    return "Comment [c_id=" + c_id + ", text =" + text + "]";
	}
}
