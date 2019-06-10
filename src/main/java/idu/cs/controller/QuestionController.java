package idu.cs.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import idu.cs.domain.Question;
import idu.cs.domain.User;
import idu.cs.entity.UserEntity;
import idu.cs.exception.ResourceNotFoundException;
import idu.cs.repository.UserRepository;
import idu.cs.service.QuestionService;
import idu.cs.service.UserService;

@Controller // @Component, @Service, @Repository
// Spring Framework에게 이 클래스로 부터 작성된 객체는 Controller 역할을 함을 알려줌
// Spring 이 이 클래스로 부터 Bean 객체를 생성해서 등록할 수 있음
public class QuestionController {
	@Autowired QuestionService questionService;
	
	@GetMapping("/questions")
	public String getAllQuestion(Model model, HttpSession session) {
		List<Question> questions = questionService.getQuestions();
		model.addAttribute("questions", questions);
		return "/questions/list";	
	}
}