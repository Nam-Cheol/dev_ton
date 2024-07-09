package pathAPI;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import pathAPI.DTO.FeatureDTO;
import pathAPI.DTO.GeometryDTO;
import pathAPI.DTO.PathDTO;
import pathAPI.DTO.WalkerPathDTO;

public class TestPathLocation {

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        WalkerPathDTO dto = new WalkerPathDTO();
        dto.setStartX(129.06018048);
        dto.setStartY(35.15960017);
        dto.setEndX(129.05665309);
        dto.setEndY(35.15685041);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String walkerStr = gson.toJson(dto);

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, walkerStr);

        Request request = new Request.Builder()
                .url("https://apis.openapi.sk.com/tmap/routes/pedestrian?version=1&callback=function")
                .post(body)
                .addHeader("accept", "application/json")
                .addHeader("content-type", "application/json")
                .addHeader("appKey", "YEWVxfrK4j8xTNQZURJ4z1Te4JTZs26v45fgmfn7")
                .build();

        Response response = client.newCall(request).execute();
        String pathJson = response.body().string();

        PathDTO path = gson.fromJson(pathJson, PathDTO.class);

        // Coordinates 가져오기 예시
        for (FeatureDTO featureDTO : path.getFeatures()) {
            GeometryDTO geometry = featureDTO.getGeometry();
            String geometryType = geometry.getType();
            
            if ("Point".equals(geometryType)) {
                List<Double> pointCoordinates = geometry.getCoordinates().get(0);
                System.out.println("Point Coordinates: " + pointCoordinates);
            } else if ("LineString".equals(geometryType)) {
                List<List<Double>> lineCoordinates = geometry.getCoordinates();
                System.out.println("Line Coordinates: " + lineCoordinates);
            }
        }
    }
}
