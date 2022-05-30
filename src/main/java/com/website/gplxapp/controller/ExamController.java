package com.website.gplxapp.controller;

import com.website.gplxapp.service.ExamService;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/exam")
@CrossOrigin
public class ExamController {

    @Autowired
    ExamService examService;

    @GetMapping("/get-exam")
    private JSONArray getListQuestion() {
        return examService.getListQuestion();
    }
}
