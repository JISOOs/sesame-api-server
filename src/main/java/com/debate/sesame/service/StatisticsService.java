package com.debate.sesame.service;

import com.debate.sesame.domain.AnswerRepository;
import com.debate.sesame.web.dto.StatisticsRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StatisticsService {

    private AnswerRepository answerRepository;

    public void saveAnswer(StatisticsRequestDto statisticsRequestDto) {

         answerRepository.save(statisticsRequestDto.toEntity());
    }
}
