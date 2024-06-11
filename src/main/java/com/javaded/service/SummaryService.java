package com.javaded.service;

import com.javaded.model.Data;
import com.javaded.model.MeasurementType;
import com.javaded.model.Summary;
import com.javaded.model.SummaryType;

import java.util.Set;

public interface SummaryService {

    Summary get(
            Long sensorId,
            Set<MeasurementType> measurementTypes,
            Set<SummaryType> summaryTypes
    );

    void handle(
            Data data
    );

}
