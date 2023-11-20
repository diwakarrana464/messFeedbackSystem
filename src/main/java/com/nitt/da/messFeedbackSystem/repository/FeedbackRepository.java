package com.nitt.da.messFeedbackSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nitt.da.messFeedbackSystem.models.Feedback;

public interface FeedbackRepository extends MongoRepository<Feedback, Integer> {

}
