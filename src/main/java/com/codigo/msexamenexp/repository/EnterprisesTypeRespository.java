package com.codigo.msexamenexp.repository;

import com.codigo.msexamenexp.entity.EnterprisesTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterprisesTypeRespository extends JpaRepository<EnterprisesTypeEntity, Integer>{
}
