package pathAPI;

import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import pathAPI.DTO.AddressDTO;

public class Destination {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("출발지를 입력하세요");
		String departure = sc.nextLine();
//		System.out.println("도착지를 입력하세요");
//		String arrive = sc.nextLine();
//		System.out.println("출발지 : " + departure + "\n" + "도착지 : " + arrive);

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
				.url("https://apis.openapi.sk.com/tmap/geo/convertAddress?version=1&searchTypCd=NtoO&reqAdd="
						+ departure + "&reqMulti=S&resCoordType=WGS84GEO")
				.get().addHeader("accept", "application/json")
				.addHeader("appKey", "YEWVxfrK4j8xTNQZURJ4z1Te4JTZs26v45fgmfn7").build();

		Response response = client.newCall(request).execute();
		String location = response.body().string();
		System.out.println(location);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		System.out.println("확인1");
		AddressDTO addressDTO = gson.fromJson(location, AddressDTO.class);
		System.out.println("확인2");

		if(addressDTO.getConvertAdd() == null) {
			System.out.println("확인3");
		}
		
		System.out.println("위도 : " + addressDTO.getConvertAdd().getOldLat());
		System.out.println("경도 : " + addressDTO.getConvertAdd().getOldLon());
	}

}
