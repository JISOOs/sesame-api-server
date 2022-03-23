package com.debate.sesame.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @Column(name ="id")
    private Long id;

    @Column(name ="gender")
    private boolean gender;

    @ElementCollection
    @Column(name ="answer")
    private List<Integer> answer;




}
