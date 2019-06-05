package idu.cs.domain;

import java.time.LocalDateTime;

public class Question {
	
	private Long id;
	private String title;
	private User writer;
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
	public String getContens() {
		return contens;
	}
	public void setContens(String contens) {
		this.contens = contens;
	}
	public LocalDateTime getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
	private String contens;
	private LocalDateTime createTime;
	
	public Question() {}
	
}
