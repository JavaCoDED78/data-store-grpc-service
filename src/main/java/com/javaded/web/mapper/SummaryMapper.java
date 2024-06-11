package com.javaded.web.mapper;

import com.javaded.model.Summary;
import com.javaded.web.dto.SummaryDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SummaryMapper extends Mappable<Summary, SummaryDto> {
}
