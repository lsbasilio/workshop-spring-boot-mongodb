package com.leandro.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leandro.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	// Query Methods
	List<Post> findByTitleContainingIgnoreCase(String text);
	
}
