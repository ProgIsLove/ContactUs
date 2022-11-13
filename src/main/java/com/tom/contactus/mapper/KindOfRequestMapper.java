package com.tom.contactus.mapper;

import com.tom.contactus.domain.KindOfRequest;
import com.tom.contactus.dto.KindOfRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KindOfRequestMapper {


    KindOfRequestDTO kindOfRequestEntityToRequestDTO(KindOfRequest request);
}
