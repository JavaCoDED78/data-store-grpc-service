package com.javaded.repository;

import com.javaded.model.Data;
import com.javaded.model.Summary;
import com.javaded.model.SummaryType;
import com.javaded.model.MeasurementType;

import java.util.Optional;
import java.util.Set;

public interface SummaryRepository {

    Optional<Summary> findBySensorId(
            long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    );

    void handle(
            Data data
    );

}
