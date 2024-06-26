package com.mantap.SpringStarter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mantap.SpringStarter.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
}