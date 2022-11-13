package com.tom.contactus.mapper;

import com.tom.contactus.domain.Contact;
import com.tom.contactus.dto.ContactDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ContactUsMapper {

    @Mapping(source = "kindOfRequest.requestName", target = "kindOfRequestName.requestName")
    @Mapping(source = "kindOfRequest.id", target = "kindOfRequestName.id")
    Contact contactDTOtoContactEntity(ContactDTO contact);
}
