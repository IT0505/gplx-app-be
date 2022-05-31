package com.website.gplxapp.controller;

import com.website.gplxapp.service.PracticeService;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/practice")
@CrossOrigin
public class PracticeController {

    @Autowired
    PracticeService practiceService;

    @GetMapping("/get-list-question")
    private JSONArray getListQuestion(@RequestParam String id) {
        return practiceService.getListQuestion(id);
    }
}
