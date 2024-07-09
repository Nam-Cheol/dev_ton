package pathAPI.DTO;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PathDTO {
    private String type;
    private List<FeatureDTO> features = new ArrayList<>();

}
