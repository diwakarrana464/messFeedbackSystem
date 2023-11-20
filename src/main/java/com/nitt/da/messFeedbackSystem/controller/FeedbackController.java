package com.nitt.da.messFeedbackSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitt.da.messFeedbackSystem.models.Feedback;
import com.nitt.da.messFeedbackSystem.repository.FeedbackRepository;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@PostMapping("/")
	public ResponseEntity<?> addFeedback(@RequestBody Feedback feedback){
		Feedback save = this.feedbackRepository.save(feedback);
		return ResponseEntity.ok(save);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getFeedback(@RequestBody Feedback feedback){
		Feedback save = this.feedbackRepository.save(feedback);
		return ResponseEntity.ok(this.feedbackRepository.findAll());
	}
}
