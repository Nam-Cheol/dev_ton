package pathAPI.DTO;

import lombok.Data;

@Data
public class PropertiesDTO {
    private Integer index;
    private Integer pointIndex;
    private String name;
    private String description;
    private Integer distance;
    private Integer time;
    private Integer roadType;
    private Integer categoryRoadType;
    private String facilityType;
    private String facilityName;
    private Integer turnType;
    private String pointType;
    private String nearPoiName;
    private String nearPoiX;
    private String nearPoiY;
    private String intersectionName;
    private Double totalDistance;
    private Double totalTime;
}
