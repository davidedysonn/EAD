package com.ead.course.services.iplm;

import com.ead.course.repositories.Courserepository;
import com.ead.course.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceIplm implements CourseService {
    @Autowired
    private Courserepository courserepository;
}
