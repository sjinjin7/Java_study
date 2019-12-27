package com.ksj.model;

public class BoardVO {

	private int number;

	private String subject;

	private String name;

	private String dateinserted;

	private String content;
	
	private int cnt;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getDateinserted() {
		return dateinserted;
	}

	public void setDateinserted(String dateinserted) {
		this.dateinserted = dateinserted;
	}
	
	@Override
	public String toString() {
		return "BoardVO [number=" + number + ", subject=" + subject + ", name=" + name + ", dateinserted="
				+ dateinserted + ", content=" + content + ", cnt=" + cnt + "]";
	}
	
}
