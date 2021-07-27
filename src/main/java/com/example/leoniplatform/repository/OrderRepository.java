package com.example.leoniplatform.repository;
import com.example.leoniplatform.model.Practice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepository extends JpaRepository<Practice,Integer>{

}