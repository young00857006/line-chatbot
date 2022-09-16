package com.example.linemessagereply.reppository;

import com.example.linemessagereply.entity.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MemberRepository extends MongoRepository<Member, String> {

    List<Member> findByAccountAndPassword(String account, String password);
    List<Member> findByUserId(String UserId);
}
