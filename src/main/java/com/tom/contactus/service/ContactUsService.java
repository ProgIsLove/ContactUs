package com.tom.contactus.service;


import com.tom.contactus.dto.ContactDTO;
import com.tom.contactus.mapper.ContactUsMapper;
import com.tom.contactus.repository.ContactUsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class ContactUsService {

    private final ContactUsRepository contactUsRepository;
    private final ContactUsMapper contactUsMapper;

    @Transactional
    public void save(ContactDTO contactDTO) {
        contactUsRepository.save(contactUsMapper.contactDTOtoContactEntity(contactDTO));
    }
}
