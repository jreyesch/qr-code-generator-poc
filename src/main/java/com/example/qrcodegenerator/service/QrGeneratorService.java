package com.example.qrcodegenerator.service;

import org.springframework.stereotype.Service;

@Service
public class QrGeneratorService implements QrGeneratorInterface{
    @Override
    public String generateFromText(String text) {
        System.out.println("QR GENERATED: " + text);
        return "DONE FROM SERVICE";
    }
}
