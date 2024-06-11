package com.javaded.service;

import com.javaded.model.exception.SensorNotFoundException;
import com.javaded.model.Data;
import com.javaded.model.MeasurementType;
import com.javaded.model.Summary;
import com.javaded.model.SummaryType;
import com.javaded.repository.SummaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class SummaryServiceImpl implements SummaryService {

    private final SummaryRepository summaryRepository;

    @Override
    public Summary get(
            Long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    ) {
        return summaryRepository.findBySensorId(
                        sensorId,
                        measurementTypes == null ? Set.of(MeasurementType.values()) : measurementTypes,
                        summaryTypes == null ? Set.of(SummaryType.values()) : summaryTypes
                )
                .orElseThrow(SensorNotFoundException::new);
    }

    @Override
    public void handle(
            Data data
    ) {
        summaryRepository.handle(data);
    }

}
