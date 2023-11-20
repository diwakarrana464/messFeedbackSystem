package com.nitt.da.messFeedbackSystem.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "feedbacks")
public class Feedback {
	private int feedback_id;
	private int student_id;
	private String messname;
	private String date;
	private String meal;
	private String description;
	public int getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getMessname() {
		return messname;
	}
	public void setMessname(String messname) {
		this.messname = messname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Feedback(int feedback_id, int student_id, String messname, String date, String meal, String description) {
		super();
		this.feedback_id = feedback_id;
		this.student_id = student_id;
		this.messname = messname;
		this.date = date;
		this.meal = meal;
		this.description = description;
	}
}
