package idu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idu.cs.entity.QuestionEntity;
import idu.cs.entity.UserEntity;

@Repository
public interface QuestionRepository 
	extends JpaRepository<QuestionEntity, Long> {
	// findById, save, delete 선언없이도 구현 가능
	
	// 아래 메소드들은 선언해야 JPA 규칙에 의해 구현됨 
	// find - select문, By - where, OrderBy - order by, ASC와 DESC를 함께 사
	
	//id 내림차순으로 정렬
	//List<UserEntity> findByNameOrderByIdDESC(String name);
	
	UserEntity findByQuestionWriter(String Writer); // ByUserId == where userid=''
}
