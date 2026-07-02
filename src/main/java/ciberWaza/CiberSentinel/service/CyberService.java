package ciberWaza.CiberSentinel.service;

import ciberWaza.CiberSentinel.dto.request.CyberRequestDTO;
import ciberWaza.CiberSentinel.dto.response.PredictionResponseDTO;

public interface CyberService {

    PredictionResponseDTO predecir(CyberRequestDTO request);

}