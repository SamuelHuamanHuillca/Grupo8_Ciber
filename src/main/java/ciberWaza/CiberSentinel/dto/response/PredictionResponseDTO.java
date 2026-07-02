package ciberWaza.CiberSentinel.dto.response;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PredictionResponseDTO {

    private String caso;

    private String prediccion;

    private Double confianza;

    private List<RankingDTO> ranking;

    private List<String> recomendaciones;

    private Map<String, Object> entrada;

}