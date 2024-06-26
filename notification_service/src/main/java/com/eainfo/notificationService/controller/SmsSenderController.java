package com.eainfo.notificationService.controller;

import com.eainfo.notificationService.service.SmsSenderService;
import com.eainfo.openfeignService.notification.SmsSender;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SmsSenderController {
    private final SmsSenderService smsSenderService;

    @PostMapping("/send-sms")
    public void sendOtpSms(@RequestBody SmsSender request) {
        String message = "Agence Directe. Ouverture de compte en ligne Code de confirmation " + request.getCodeOtpSms() + " valable pour une durée de: 15 minutes";
         smsSenderService.sendOtpSms(request.getKeyPhone(), request.getNumPhone(), message);
    }

}
