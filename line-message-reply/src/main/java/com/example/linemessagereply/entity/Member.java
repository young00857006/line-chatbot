package com.example.linemessagereply.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "member")
public class Member {
    private String id;
    private String name;
    private String account;
    private String password;
    private String nonce;
    private String userId;

    public Member(){}

    public Member(String name, String account, String password,String nonce,String userId){
        this.name = name;
        this.account =account;
        this.password = password;
        this.nonce = nonce;
        this.userId = userId;
    }

    public Member(String account, String password){
        this.account = account;
        this.password = password;
    }

    public Member(String id,String account, String password){
        this.id = id;
        this.account = account;
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAccount(String account){
        this.account =account;
     }
     public void setPassword(String password){
        this.password = password;
     }
     public void setNonce(String nonce){
        this.nonce = nonce;
     }
     public void  setUserId(String userId){
        this.userId = userId;
     }

     public String getId(){return id;}
     public String getName(){
        return name;
     }
     public String getAccount(){
        return account;
     }
     public String getPassword(){
        return password;
     }
     public String getNonce(){
        return  nonce;
    }
     public String getUserId(){
        return userId;
    }
}
