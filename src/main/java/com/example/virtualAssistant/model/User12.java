package com.example.virtualAssistant.model;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

//@JsonSerialize(using = UserSerializer.class)
public class User12 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;


    private String email;

//    @Column(name = "password")
//    @JsonIgnore
    private String password;


   // @JsonIgnore
 //  @OneToMany(mappedBy = "interactions", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
   @OneToMany( cascade = CascadeType.ALL)
    private Set<UserInteractionsWithVirtualAssistant> userinteractions;

    @OneToMany(  cascade = CascadeType.ALL)
    //@OneToMany(mappedBy = "user12", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ApiResponse> apiResponses;
//
//    public Set<ApiResponse> getApiResponses() {
//        return this.apiResponses;
//    }
//
//    public void setApiResponses(Set<ApiResponse> apiResponses) {
//        this.apiResponses = apiResponses;
//    }
//
//    public User12(Integer id, String username, String email, String password) {
//        this.id = id;
//        this.username = username;
//        this.email = email;
//        this.password = password;
//    }
//
//    public User12() {
//
//    }
//
//    public Integer getid() {
//        return id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String toString() {
//        return "id:" + this.id + "username:" + this.username + "email:" + this.email;
//    }
//
//    public Set<UserInteractionsWithVirtualAssistant> getUserInteractions() {
//        return userinteractions;
//    }

}
