package com.QuestionAns;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAnsQuestion {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		ExamQuestions questions1 = new ExamQuestions();
		questions1.setId(1234);
		questions1.setQuestion("What are the aims of Milloions Dreams");
		Answer answer1 = new Answer();
		answer1.setId(1);
		answer1.setAnswer("To help people, Make peoples life eassyer by providing service");
		answer1.setExamQuestions(questions1);
		Answer answer2 = new Answer();
		answer2.setId(2);
		answer2.setAnswer("To Serve each continet");
		answer2.setExamQuestions(questions1);
		Answer answer3 = new Answer();
		answer3.setId(3);
		answer3.setAnswer("To provide best price for the people");
		answer3.setExamQuestions(questions1);
		List<Answer> aList = new ArrayList<Answer>();
		aList.add(answer1);
		aList.add(answer2);
		aList.add(answer3);
//		questions1.setAnswers(aList);
		//Seassion
		Transaction transaction = session.beginTransaction();
		//SAVE
//		session.save(questions1);
//		session.save(answer1);
//		session.save(answer2);
//		session.save(answer3);
		//Fetch Answer
		ExamQuestions q = (ExamQuestions)session.get(ExamQuestions.class, 1234);
		System.out.println(q);
		for(Answer a: q.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		transaction.commit();
		//fetch
		session.close();
		factory.close();
	}

}
