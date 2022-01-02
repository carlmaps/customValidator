package com.example.CustomValidator.controller;

import com.example.CustomValidator.dto.APIResponse;
import com.example.CustomValidator.dto.FieldTripForm;
import com.example.CustomValidator.service.FieldTripService;
import com.example.CustomValidator.validator.FieldTripFormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class FieldTripController{
    @Autowired
    private FieldTripFormValidator ftfValidator;
    @Autowired
    private FieldTripService ftService;
    @InitBinder(value = "fieldTripForm")
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(ftfValidator);
    }
    @PostMapping(value = "/fieldtrip")
    public ResponseEntity<APIResponse> signUp(@Valid @RequestBody
                                                      FieldTripForm ftf){
        APIResponse apiResponse = new APIResponse();
        //perform your logic here
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}