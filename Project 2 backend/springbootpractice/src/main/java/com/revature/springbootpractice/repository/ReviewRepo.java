package com.revature.springbootpractice.repository;

import com.revature.springbootpractice.models.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReviewRepo extends JpaRepository<Reviews, Integer> {

//    public List<Reviews> findAll();
//    public List<Reviews> findAllByReview_id(int reviewid);
//
//

}
