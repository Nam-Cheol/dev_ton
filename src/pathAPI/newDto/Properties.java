
package pathAPI.newDto;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Properties {

    @SerializedName("totalDistance")
    @Expose
    public Integer totalDistance;
    @SerializedName("totalTime")
    @Expose
    public Integer totalTime;
    @SerializedName("index")
    @Expose
    public Integer index;
    @SerializedName("pointIndex")
    @Expose
    public Integer pointIndex;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("direction")
    @Expose
    public String direction;
    @SerializedName("nearPoiName")
    @Expose
    public String nearPoiName;
    @SerializedName("nearPoiX")
    @Expose
    public String nearPoiX;
    @SerializedName("nearPoiY")
    @Expose
    public String nearPoiY;
    @SerializedName("intersectionName")
    @Expose
    public String intersectionName;
    @SerializedName("facilityType")
    @Expose
    public String facilityType;
    @SerializedName("facilityName")
    @Expose
    public String facilityName;
    @SerializedName("turnType")
    @Expose
    public Integer turnType;
    @SerializedName("pointType")
    @Expose
    public String pointType;
    @SerializedName("lineIndex")
    @Expose
    public Integer lineIndex;
    @SerializedName("distance")
    @Expose
    public Integer distance;
    @SerializedName("time")
    @Expose
    public Integer time;
    @SerializedName("roadType")
    @Expose
    public Integer roadType;
    @SerializedName("categoryRoadType")
    @Expose
    public Integer categoryRoadType;

}
