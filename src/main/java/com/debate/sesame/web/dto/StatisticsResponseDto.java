package com.debate.sesame.web.dto;

import com.debate.sesame.domain.Answer;
import com.debate.sesame.domain.Gender;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class StatisticsResponseDto {

    private Long id;
    private Gender gender;
    private List<Integer> answerList;

    public StatisticsResponseDto(Answer answer) {
        this.id = answer.getId();
        this.gender = answer.getGender();
        this.answerList = answer.getAnswerList();
    }


}
