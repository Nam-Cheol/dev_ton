package pathAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import pathAPI.newDto.AddressDTO;

public class Destination {

	public static List<String> getLatLon(String place) throws IOException {
		List<String> locations = new ArrayList<>();
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
				.url("https://apis.openapi.sk.com/tmap/geo/convertAddress?version=1&searchTypCd=NtoO&reqAdd="
						+ place + "&reqMulti=S&resCoordType=WGS84GEO")
				.get().addHeader("accept", "application/json")
				.addHeader("appKey", "YEWVxfrK4j8xTNQZURJ4z1Te4JTZs26v45fgmfn7").build();

		Response response = client.newCall(request).execute();
		String location = response.body().string();
		System.out.println(location);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		AddressDTO addressDTO = gson.fromJson(location, AddressDTO.class);

		locations.add(addressDTO.getConvertAdd().getOldLat());
		locations.add(addressDTO.getConvertAdd().getOldLon());
		
		return locations;
	}
	
}
