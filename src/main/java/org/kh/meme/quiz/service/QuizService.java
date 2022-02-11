package org.kh.meme.quiz.service;

import java.util.List;

import org.kh.meme.quiz.domain.Quiz;
import org.kh.meme.quiz.domain.QuizBest;
import org.kh.meme.quiz.domain.QuizCh;

public interface QuizService {

	public List<Quiz> random();
	public List<Quiz> printAll(int quizNo);
	public int writeQuiz(Quiz quiz);
	
	public int writeQuizM(QuizCh quizCh);
	public int ScoreOne(String memberId);
	public int updateScore(QuizBest qBest);
	

}
