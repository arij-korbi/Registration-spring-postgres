package com.example.leoniplatform.repository;



import com.example.leoniplatform.model.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilesRepository extends JpaRepository<File,String> {
}
