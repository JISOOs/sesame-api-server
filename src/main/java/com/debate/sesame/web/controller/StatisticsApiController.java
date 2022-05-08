package com.debate.sesame.web.controller;

import com.debate.sesame.service.StatisticsService;
import com.debate.sesame.web.dto.StatisticsRequestDto;
import com.debate.sesame.web.dto.StatisticsResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/api/v1/{id}")
    public StatisticsResponseDto saveAnswer(@PathVariable Long id) {

        logger.debug(String.valueOf(id));
        return statisticsService.findById(id);
    }

}
