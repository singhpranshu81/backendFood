package com.ruby.OnlineFoodApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ruby.OnlineFoodApp.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	@Query("SELECT COALESCE(MAX(e.categoryId),0) FROM Category e")
	public Integer findMaxCategoryId();
}
