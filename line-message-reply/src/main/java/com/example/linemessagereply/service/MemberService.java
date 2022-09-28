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

//    public boolean insert(Member request){
//        Member member = new Member(request.getDeviceId(), request.getAccessToken(), request.geturl(),"","");
//        try {
//            repository.insert(member);
//            return true;
//        }
//        catch (Exception e){
//            System.out.println(e);
//            return false;
//        }
//
//    }

    public boolean login(Member request){
        Member member = new Member(request.getdeviceId(), request.getaccessToken());
        if(repository.findByDeviceIdAndAccessToken(member.getdeviceId(), member.getaccessToken()).isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public void lineAccountLink(Member request, String UserId, String nonce){
        Member member = new Member(request.getdeviceId(), request.getaccessToken(), request.geturl(),request.getaddress(), nonce, UserId);
        repository.save(member);
    }

    public boolean checkAccountLink(String UserId){
        return repository.findByUserId(UserId).isEmpty() ? false:true;
    }

    public String getDeviceId(String userId){
        return repository.findByUserId(userId).get(0).getdeviceId();
    }



    public List<Member> getAll(){
        return repository.findAll();
    }


}
