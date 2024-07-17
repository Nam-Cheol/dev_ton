package pathAPI;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import pathAPI.newDto.PathDTO;
import pathAPI.newDto.WalkerPathDTO;

public class TestPathLocation2 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("출발지를 입력하세요");
		String departure = sc.nextLine();
		System.out.println("도착지를 입력하세요");
		String arrive = sc.nextLine();
		System.out.println("출발지 : " + departure + "\n" + "도착지 : " + arrive);

		List<String> start = Destination.getLatLon(departure);
		List<String> end = Destination.getLatLon(arrive);

		OkHttpClient client = new OkHttpClient();

		WalkerPathDTO dto = new WalkerPathDTO();
		try {
			dto.setStartX(Double.parseDouble(start.get(1)));
			dto.setStartY(Double.parseDouble(start.get(0)));
			dto.setEndX(Double.parseDouble(end.get(1)));
			dto.setEndY(Double.parseDouble(end.get(0)));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String walkerStr = gson.toJson(dto);

		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, walkerStr);

		Request request = new Request.Builder()
				.url("https://apis.openapi.sk.com/tmap/routes/pedestrian?version=1&callback=function").post(body)
				.addHeader("accept", "application/json").addHeader("content-type", "application/json")
				.addHeader("appKey", "YEWVxfrK4j8xTNQZURJ4z1Te4JTZs26v45fgmfn7").build();

		long startTime = System.nanoTime();

		Response response = client.newCall(request).execute();
		String pathJson = response.body().string();

		long endTime = System.nanoTime();

		PathDTO dto2 = gson.fromJson(pathJson, PathDTO.class);

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();

		for (int i = 0; i < dto2.features.size(); i++) {
			sb1.append(dto2.features.get(i).geometry.coordinates.toString());
		}

		String temp = sb1.toString();

		String temp1 = temp.replaceAll("\\]\\[", "\\] \\[");

		String[] str1 = temp1.toString().split("\\[");

		for (String string : str1) {
			sb2.append(string);
		}

		String[] str2 = sb2.toString().split("\\]");

		for (String string : str2) {
			sb3.append(string);
		}

		System.out.println(endTime - startTime);

		System.out.println(sb3.toString());

	}
}
