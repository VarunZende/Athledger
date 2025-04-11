package com.athledger.slotmgmt.repo;

import com.athledger.slotmgmt.dao.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepository extends JpaRepository<Sport, String> {
}

