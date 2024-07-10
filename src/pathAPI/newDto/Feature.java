
package pathAPI.newDto;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Feature {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("geometry")
    @Expose
    public Geometry geometry;
    @SerializedName("properties")
    @Expose
    public Properties properties;

}
