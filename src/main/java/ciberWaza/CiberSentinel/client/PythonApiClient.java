package ciberWaza.CiberSentinel.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import ciberWaza.CiberSentinel.dto.request.CyberRequestDTO;
import ciberWaza.CiberSentinel.dto.response.PredictionResponseDTO;

@Component
public class PythonApiClient {

    private final WebClient webClient;

    public PythonApiClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public PredictionResponseDTO predecir(CyberRequestDTO request) {

        return webClient
                .post()
                .uri("/predict/cyber-sentinel")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(PredictionResponseDTO.class)
                .block();

    }

}