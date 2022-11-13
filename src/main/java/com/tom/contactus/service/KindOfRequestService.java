package com.tom.contactus.service;

import com.tom.contactus.domain.KindOfRequest;
import com.tom.contactus.dto.KindOfRequestDTO;
import com.tom.contactus.mapper.KindOfRequestMapper;
import com.tom.contactus.repository.KindOfRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class KindOfRequestService {

    private final KindOfRequestRepository requestRepository;
    private final KindOfRequestMapper requestMapper;

    public List<KindOfRequestDTO> listKindOfRequests() {

        List<KindOfRequest> requests = new ArrayList<>(requestRepository.findAll());

        return requests.stream()
                       .map(requestMapper::kindOfRequestEntityToRequestDTO)
                       .toList();
    }
}
