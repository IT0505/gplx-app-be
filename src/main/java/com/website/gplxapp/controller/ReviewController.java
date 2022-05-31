package com.website.gplxapp.controller;

import com.website.gplxapp.service.ReviewService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/review")
@CrossOrigin
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/save-review")
    private Integer saveReview(@RequestBody JSONObject reviewObj) {
        return reviewService.saveReview(reviewObj);
    }

    @GetMapping("/get-review")
    private JSONArray getReviewList(@RequestParam String id) {
        return reviewService.getListQuestion(id);
    }
}
