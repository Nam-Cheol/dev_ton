package pathAPI.DTO;

import java.util.List;

import lombok.Data;

@Data
public class GeometryDTO {
    private String type;
    private List<List<Double>> coordinates;
}
