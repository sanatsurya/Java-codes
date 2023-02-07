package com.QuestionAns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name = "Answer")
public class Answer {
	@Id
	@Column(name = "Ans_Id")
	private int id;
	private String answer;
	@ManyToOne()
	private ExamQuestions examQuestions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public ExamQuestions getExamQuestions() {
		return examQuestions;
	}
	public void setExamQuestions(ExamQuestions examQuestions) {
		this.examQuestions = examQuestions;
	}
	public Answer(int id, String answer, ExamQuestions examQuestions) {
		super();
		this.id = id;
		this.answer = answer;
		this.examQuestions = examQuestions;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + ", examQuestions=" + examQuestions + "]";
	}
	
	

}
