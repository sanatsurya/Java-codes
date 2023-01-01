package com.QuestionAns;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAnsQuestion {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		ExamQuestions questions1 = new ExamQuestions();
		questions1.setQuestion("Who is the Ceo of Millions Dreams");
		Answer answer1 = new Answer();
		answer1.setAnswer("Sanat surya is the CEO of Millions Dreams");
		questions1.setAnswer(answer1);
		Transaction transaction = session.beginTransaction();
		session.save(questions1);
		session.save(answer1);
		transaction.commit();
		session.close();
	}

}
