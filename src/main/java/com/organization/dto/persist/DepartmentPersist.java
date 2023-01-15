package com.organization.dto.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.organization.bean.DepartmentVO;

//@Repository
public interface DepartmentPersist extends JpaRepository<DepartmentVO, Integer>{

}
