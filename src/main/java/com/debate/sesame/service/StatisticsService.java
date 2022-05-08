package com.debate.sesame.service;

import com.debate.sesame.domain.Answer;
import com.debate.sesame.domain.AnswerRepository;
import com.debate.sesame.web.dto.StatisticsRequestDto;
import com.debate.sesame.web.dto.StatisticsResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StatisticsService {

    private AnswerRepository answerRepository;

    public void saveAnswer(StatisticsRequestDto statisticsRequestDto) {

         answerRepository.save(statisticsRequestDto.toEntity());
    }

    public StatisticsResponseDto findById(Long id) {

        Answer answer = answerRepository.findById(id).orElseThrow(()->new IllegalArgumentException("해당 정보가 없습니다. id="+ id));
        return new StatisticsResponseDto(answer);
    }
}
