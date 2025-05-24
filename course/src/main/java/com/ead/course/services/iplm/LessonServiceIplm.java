package com.ead.course.services.iplm;

import com.ead.course.repositories.LessonRepository;
import com.ead.course.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceIplm implements LessonService {
    @Autowired
    private LessonRepository lessonRepository;
}
