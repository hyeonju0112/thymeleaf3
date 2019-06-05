package idu.cs.controller;

import org.springframework.ui.Model;

import idu.cs.service.QuestionService;
	
public class QuestionController {
	
@AutoWired QuestionService questionService;
	
	@GetMapping("/questions")
	pulic String getAllQuestion(Model model, HttpSession session) {
		List<Question> question = questionService.getQuestions();
		model.addAttribute("questions", questions);
	return "/questions/list" ;
	}
	
	
}
