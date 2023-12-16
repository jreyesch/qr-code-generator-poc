package com.example.qrcodegenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.qrcodegenerator.service.QrGeneratorService;

@Controller
public class QrGeneratorController {

    @Autowired
    QrGeneratorService qrGeneratorService;

    @PostMapping("/generate-qr")
    public String generateFromText(@RequestBody String text){
        return qrGeneratorService.generateFromText(text);
    }

}
