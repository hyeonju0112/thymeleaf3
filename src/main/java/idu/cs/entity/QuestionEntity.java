package idu.cs.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import idu.cs.domain.Question;
import idu.cs.domain.User;

@Entity
@Table(name = "question")
public class QuestionEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; 	
	private String title;
	
	@ManyToOne
	@JoinColumn (name="fk_question_writer")
	private UserEntity witer;
	
	@Lob
	private String contentes;
	private LocalDateTime createTime;
	
	public Question buildDomain(){ //Domain 생성
		Question question = new Question
		question.setId(id);
		question.setTitle(title);
		question.setWriter(Writer.buildomain());
		question.setContents(contents);
		question.setCreateTime(createTime);
		return question;
	}
	public void buildEntity(Question question) {
		
		id = question.getId();
		title = question.getTitle();
		
		UserEntity entity = new UserEntity();
		entity.buildEntity(question.getWtiter);		
		writer = entity;
		
		contents = question.getContents();
		createTime = question.getCreateTime();
		
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public UserEntity getWiter() {
		return witer;
	}
	public void setWiter(UserEntity witer) {
		this.witer = witer;
	}
	public String getContentes() {
		return contentes;
	}
	public void setContentes(String contentes) {
		this.contentes = contentes;
	}
	public LocalDateTime getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
}