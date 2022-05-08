package com.debate.sesame.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "answer")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Answer {

    @Id
    @Column(name ="id")
    @GeneratedValue
    private Long id;

    @Column(name ="gender")
    @Convert(converter = GenderConverter.class)
    private Gender gender;

    @ElementCollection
    @Column(name ="answer")
    private List<Integer> answerList;

    @Builder
    public Answer(Long id, Gender gender, List<Integer> answerList) {
        super();
        this.id = id;
        this.gender = gender;
        this.answerList = answerList;

    }

}
