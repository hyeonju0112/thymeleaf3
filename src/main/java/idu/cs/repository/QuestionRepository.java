package idu.cs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idu.cs.entity.QuestionEntity;

@Repository
public interface QuestionRepository 
	extends JpaRepository<QuestionEntity, Long> {
	// findById, save, delete 선언없이도 구현 가능
	
	// 아래 메소드들은 선언해야 JPA 규칙에 의해 구현됨 
	// find - select문, By - where, OrderBy - order by, ASC와 DESC를 함께 사용
	
	QuestionEntity findByWriter(String writer); // ByUserId == where userid=''
}