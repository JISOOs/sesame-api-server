package com.debate.sesame.web.controller;

import com.debate.sesame.service.StatisticsService;
import com.debate.sesame.web.dto.StatisticsRequestDto;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StatisticsApiController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private StatisticsService statisticsService;

    @PostMapping("/api/v1/answer")
    public void saveAnswer(@RequestBody StatisticsRequestDto statisticsRequestDto) {

        logger.debug("save api call"+statisticsRequestDto.getGender());
        statisticsService.saveAnswer(statisticsRequestDto);
    }

}
