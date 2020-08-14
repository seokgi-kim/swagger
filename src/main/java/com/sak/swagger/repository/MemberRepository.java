package com.sak.swagger.repository;

import com.sak.swagger.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by seokgi4885@gmail.com on 2020-08-14.
 */
public interface MemberRepository extends JpaRepository<Member, Long> {

}
