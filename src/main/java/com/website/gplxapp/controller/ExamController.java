package com.website.gplxapp.controller;

import com.website.gplxapp.service.ExamService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/exam")
@CrossOrigin
public class ExamController {

    @Autowired
    ExamService examService;

    @GetMapping("/get-exam")
    private JSONObject getListQuestion() {
        return examService.getListQuestion();
    }

    @PostMapping("/save-exam")
    private Integer saveExamScore(@RequestBody JSONObject examResult) { return examService.saveExamScore(examResult); }
}
