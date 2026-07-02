package ciberWaza.CiberSentinel.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import ciberWaza.CiberSentinel.dto.request.CyberRequestDTO;
import ciberWaza.CiberSentinel.dto.response.PredictionResponseDTO;
import ciberWaza.CiberSentinel.service.CyberService;
import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/prediccion")
@CrossOrigin(origins = "*")
public class CyberController {

    private final CyberService cyberService;

    public CyberController(CyberService cyberService) {
        this.cyberService = cyberService;
    }

    @PostMapping("/cyber-sentinel")
    public PredictionResponseDTO predecir(@Valid @RequestBody CyberRequestDTO request) {
        return cyberService.predecir(request);
    }


}