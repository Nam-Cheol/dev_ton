
package pathAPI.newDto;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PathDTO {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("features")
    @Expose
    public List<Feature> features;
    
    

}
