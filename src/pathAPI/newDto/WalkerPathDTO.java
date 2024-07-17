package pathAPI.newDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalkerPathDTO {

	private double startX;
	private double startY;
	private int angle = 20;
	private int speed = 30;
	private String endPoiId = "10001";
	private double endX;
	private double endY;
	private String reqCoordType = "WGS84GEO";
	private String startName = "출발";
	private String endName = "%EB%8F%84%EC%B0%A9";
	private String searchOption = "30";
	private String resCoordType = "WGS84GEO";
	private String sort = "index";
	
	// getter, setter
	public double getStartX() {
		return startX;
	}
	public void setStartX(double startX) {
		this.startX = startX;
	}
	public double getStartY() {
		return startY;
	}
	public void setStartY(double startY) {
		this.startY = startY;
	}
	public int getAngle() {
		return angle;
	}
	public void setAngle(int angle) {
		this.angle = angle;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getEndPoiId() {
		return endPoiId;
	}
	public void setEndPoiId(String endPoiId) {
		this.endPoiId = endPoiId;
	}
	public double getEndX() {
		return endX;
	}
	public void setEndX(double endX) {
		this.endX = endX;
	}
	public double getEndY() {
		return endY;
	}
	public void setEndY(double endY) {
		this.endY = endY;
	}
	public String getReqCoordType() {
		return reqCoordType;
	}
	public void setReqCoordType(String reqCoordType) {
		this.reqCoordType = reqCoordType;
	}
	public String getStartName() {
		return startName;
	}
	public void setStartName(String startName) {
		this.startName = startName;
	}
	public String getEndName() {
		return endName;
	}
	public void setEndName(String endName) {
		this.endName = endName;
	}
	public String getSearchOption() {
		return searchOption;
	}
	public void setSearchOption(String searchOption) {
		this.searchOption = searchOption;
	}
	public String getResCoordType() {
		return resCoordType;
	}
	public void setResCoordType(String resCoordType) {
		this.resCoordType = resCoordType;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	
	
	
}
