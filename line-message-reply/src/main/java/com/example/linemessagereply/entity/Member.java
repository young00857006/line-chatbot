package com.example.linemessagereply.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "member")
public class Member {
//    @Id
    private String id;
    private String DeviceId;
    private String AccessToken;
    private String url;
    private String address;
    private String nonce;
    private String userId;

    public Member(){}

    public Member(String DeviceId, String AccessToken, String url,String nonce,String userId){
        this.DeviceId = DeviceId;
        this.AccessToken =AccessToken;
        this.url = url;
        this.address = address;
        this.nonce = nonce;
        this.userId = userId;
    }

    public Member(String AccessToken, String url){
        this.AccessToken = AccessToken;
        this.url = url;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String DeviceId){
        this.DeviceId = DeviceId;
    }
    public void setAccessToken(String AccessToken){
        this.AccessToken =AccessToken;
     }
     public void seturl(String url){
        this.url = url;
     }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNonce(String nonce){
        this.nonce = nonce;
     }
     public void  setUserId(String userId){
        this.userId = userId;
     }

     public String getId(){return id;}
     public String getDeviceId(){
        return DeviceId;
     }
     public String getAccessToken(){
        return AccessToken;
     }
     public String geturl(){
        return url;
     }
     public String getAddress(){return address;}
     public String getNonce(){
        return  nonce;
    }
     public String getUserId(){
        return userId;
    }
}
