package pathAPI.DTO;

import java.util.Map;

import lombok.Data;

@Data
public class FeatureDTO {
    private String type;
    private GeometryDTO geometry;
    private PropertiesDTO properties;

}
