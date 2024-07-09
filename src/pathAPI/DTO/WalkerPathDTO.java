package pathAPI.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalkerPathDTO {

	private float startX;
	private float startY;
	private int angle = 20;
	private int speed = 30;
	private String endPoiId = "10001";
	private float endX;
	private float endY;
	private String reqCoordType = "WGS84GEO";
	private String startName = "%EC%B6%9C%EB%B0%9C";
	private String endName = "%EB%8F%84%EC%B0%A9";
	private String searchOption = "30";
	private String resCoordType = "WGS84GEO";
	private String sort = "index";
	
	
}
