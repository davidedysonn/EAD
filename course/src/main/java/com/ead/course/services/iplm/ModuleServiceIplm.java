package com.ead.course.services.iplm;

import com.ead.course.repositories.ModuleRepository;
import com.ead.course.services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleServiceIplm implements ModuleService {
    @Autowired
    private ModuleRepository moduleRepository;
}
