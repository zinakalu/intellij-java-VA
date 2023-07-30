package com.example.virtualAssistant.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name = "responses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

   // @Column(name = "response_text")
    private String responseText;

   // @Column(name = "response_date", columnDefinition = "TIMESTAMP")
    private LocalDateTime responseDate;

    @OneToOne
  //  @JoinColumn(name = "interaction_id")
    private UserInteractionsWithVirtualAssistant userinteractions;

    @ManyToOne
   // @JoinColumn(name = "user_id")
    private User12 user12;}

//    public User12 getUser() {
//        return this.user12;
//    }
//
//    public void setUser(User12 user12) {
//        this.user12 = user12;
//    }
//
//}
