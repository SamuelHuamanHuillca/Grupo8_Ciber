package ciberWaza.CiberSentinel.service;

import org.springframework.stereotype.Service;

import ciberWaza.CiberSentinel.client.PythonApiClient;
import ciberWaza.CiberSentinel.dto.request.CyberRequestDTO;
import ciberWaza.CiberSentinel.dto.response.PredictionResponseDTO;

@Service
public class CyberServiceImpl implements CyberService {

    private final PythonApiClient pythonApiClient;

    public CyberServiceImpl(PythonApiClient pythonApiClient) {
        this.pythonApiClient = pythonApiClient;
    }

    @Override
    public PredictionResponseDTO predecir(CyberRequestDTO request) {

        return pythonApiClient.predecir(request);

    }

}