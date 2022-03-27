package com.debate.sesame.web.dto;

import com.debate.sesame.domain.Answer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class StatisticsRequestDto {
    private Long id;
    private String gender;
    private List<Integer> answerList;

    public Answer toEntity() {
        return Answer.builder()
                .id(id)
                .gender(gender)
                .answerList(answerList).build();
    }
}
