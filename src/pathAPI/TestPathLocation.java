package pathAPI;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import pathAPI.DTO.WalkerPathDTO;

public class TestPathLocation {

	public static void main(String[] args) throws IOException {
		
		OkHttpClient client = new OkHttpClient();
		
		WalkerPathDTO dto = new WalkerPathDTO();
		
		dto.setStartX(129.06018048f);
		dto.setStartY(35.15960017f);
		dto.setEndX(129.05665309f);
		dto.setEndY(35.15685041f);
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
		
		System.out.println(response.body().string());
	}
	
}
