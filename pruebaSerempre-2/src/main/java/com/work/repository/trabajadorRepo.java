package com.work.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;
import com.work.entity.*;

@Repository
public interface trabajadorRepo extends JpaRepository<Trabajador, String>{ 	
	
}
