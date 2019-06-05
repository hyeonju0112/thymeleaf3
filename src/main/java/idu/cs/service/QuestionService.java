package idu.cs.service;

import java.util.List;

import idu.cs.domain.Question;


public interface QuestionService {
	Question getQuestionById(long id); // primary key에 해당하는 id로  조회
	List<Question> getQuestions(); // 모든 사용자 조회
	
	List<Question> getQuestionsByUser(String user); // name으로 조회
	
	void saveQuestion(Question question); // 생성
	void updateQuestion(Question question); // 수정
	void deleteQuestion(Question question); // 삭제
}
