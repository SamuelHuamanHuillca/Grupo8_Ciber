package ciberWaza.CiberSentinel.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CyberRequestDTO {

    @JsonProperty("intentos_login_fallidos")
    @Min(0)
    @Max(200)
    private Integer intentosLoginFallidos;

    @JsonProperty("puertos_abiertos")
    @Min(0)
    @Max(100)
    private Integer puertosAbiertos;

    @JsonProperty("vulnerabilidades_criticas")
    @Min(0)
    @Max(20)
    private Integer vulnerabilidadesCriticas;

    @JsonProperty("trafico_anomalo_pct")
    @Min(0)
    @Max(100)
    private Double traficoAnomaloPct;

    @JsonProperty("equipos_afectados")
    @Min(0)
    @Max(500)
    private Integer equiposAfectados;

    @JsonProperty("parcheado_pct")
    @Min(0)
    @Max(100)
    private Double parcheadoPct;

}