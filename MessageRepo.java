package com.example.Message.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Message.Model.Message;

public interface MessageRepo extends JpaRepository<Message, Long>{
	@Query("FROM Message WHERE receiver= :receiver")
	List<Message> findByReceiver(@Param("receiver") String receiver);
}
