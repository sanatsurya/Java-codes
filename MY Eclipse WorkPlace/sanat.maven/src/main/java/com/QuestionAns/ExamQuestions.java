package com.QuestionAns;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity @Table(name = "Question")
public class ExamQuestions {
	@Id
	private int id;
	private String question;
	@OneToOne
	private Answer answer;
	public ExamQuestions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExamQuestions(int id, String question, Answer answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "ExamQuestions [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
	

}
