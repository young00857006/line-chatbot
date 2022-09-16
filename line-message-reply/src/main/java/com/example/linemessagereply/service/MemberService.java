package com.example.linemessagereply.service;

import com.example.linemessagereply.entity.Member;
import com.example.linemessagereply.reppository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository repository;

    public boolean insert(Member request){
        Member member = new Member(request.getName(), request.getAccount(), request.getPassword(),"","");
        try {
            repository.insert(member);
            return true;
        }
        catch (Exception e){
            System.out.println(e);
            return false;
        }

    }

    public boolean login(Member request){
        Member member = new Member(request.getAccount(), request.getPassword());
        if(repository.findByAccountAndPassword(member.getAccount(), member.getPassword()).isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    public void lineAccountLink(Member request, String UserId, String nonce){
        Member member = new Member(request.getId(),request.getAccount(), request.getPassword());
        member.setUserId(UserId);
        member.setNonce(nonce);
        repository.save(member);
    }
}
