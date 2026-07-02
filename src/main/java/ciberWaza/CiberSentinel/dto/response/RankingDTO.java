package ciberWaza.CiberSentinel.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RankingDTO {

    private String clase;

    private Double probabilidad;

}