package com.gubs.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gubs.springboot.entity.ExpenseTracker;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ExpenseTrackerRepository extends JpaRepository<ExpenseTracker, Long> {

}