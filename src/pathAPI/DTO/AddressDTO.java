package pathAPI.DTO;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class AddressDTO {

    @SerializedName("ConvertAdd")
    private ConvertAdd convertAdd;

    public ConvertAdd getConvertAdd() {
        return convertAdd;
    }

    public void setConvertAdd(ConvertAdd convertAdd) {
        this.convertAdd = convertAdd;
    }

    public static class ConvertAdd {
        @SerializedName("resCount")
        private String resCount;

        @SerializedName("resMulti")
        private String resMulti;

        @SerializedName("reqAddress")
        private String reqAddress;

        @SerializedName("upperDistCode")
        private String upperDistCode;

        @SerializedName("upperDistName")
        private String upperDistName;

        @SerializedName("middleDistCode")
        private String middleDistCode;

        @SerializedName("middleDistName")
        private String middleDistName;

        @SerializedName("legalLowerDistCode")
        private String legalLowerDistCode;

        @SerializedName("legalLowerDistName")
        private String legalLowerDistName;

        @SerializedName("legalDetailCode")
        private String legalDetailCode;

        @SerializedName("legalDetailName")
        private String legalDetailName;

        @SerializedName("adminLowerDistCode")
        private String adminLowerDistCode;

        @SerializedName("adminDistName")
        private String adminDistName;

        @SerializedName("primary")
        private String primary;

        @SerializedName("secondary")
        private String secondary;

        @SerializedName("mlClass")
        private String mlClass;

        @SerializedName("oldLat")
        private String oldLat;

        @SerializedName("oldLon")
        private String oldLon;

        @SerializedName("newAddressList")
        private NewAddressList newAddressList;

        public String getResCount() {
            return resCount;
        }

        public void setResCount(String resCount) {
            this.resCount = resCount;
        }

        public String getResMulti() {
            return resMulti;
        }

        public void setResMulti(String resMulti) {
            this.resMulti = resMulti;
        }

        public String getReqAddress() {
            return reqAddress;
        }

        public void setReqAddress(String reqAddress) {
            this.reqAddress = reqAddress;
        }

        public String getUpperDistCode() {
            return upperDistCode;
        }

        public void setUpperDistCode(String upperDistCode) {
            this.upperDistCode = upperDistCode;
        }

        public String getUpperDistName() {
            return upperDistName;
        }

        public void setUpperDistName(String upperDistName) {
            this.upperDistName = upperDistName;
        }

        public String getMiddleDistCode() {
            return middleDistCode;
        }

        public void setMiddleDistCode(String middleDistCode) {
            this.middleDistCode = middleDistCode;
        }

        public String getMiddleDistName() {
            return middleDistName;
        }

        public void setMiddleDistName(String middleDistName) {
            this.middleDistName = middleDistName;
        }

        public String getLegalLowerDistCode() {
            return legalLowerDistCode;
        }

        public void setLegalLowerDistCode(String legalLowerDistCode) {
            this.legalLowerDistCode = legalLowerDistCode;
        }

        public String getLegalLowerDistName() {
            return legalLowerDistName;
        }

        public void setLegalLowerDistName(String legalLowerDistName) {
            this.legalLowerDistName = legalLowerDistName;
        }

        public String getLegalDetailCode() {
            return legalDetailCode;
        }

        public void setLegalDetailCode(String legalDetailCode) {
            this.legalDetailCode = legalDetailCode;
        }

        public String getLegalDetailName() {
            return legalDetailName;
        }

        public void setLegalDetailName(String legalDetailName) {
            this.legalDetailName = legalDetailName;
        }

        public String getAdminLowerDistCode() {
            return adminLowerDistCode;
        }

        public void setAdminLowerDistCode(String adminLowerDistCode) {
            this.adminLowerDistCode = adminLowerDistCode;
        }

        public String getAdminDistName() {
            return adminDistName;
        }

        public void setAdminDistName(String adminDistName) {
            this.adminDistName = adminDistName;
        }

        public String getPrimary() {
            return primary;
        }

        public void setPrimary(String primary) {
            this.primary = primary;
        }

        public String getSecondary() {
            return secondary;
        }

        public void setSecondary(String secondary) {
            this.secondary = secondary;
        }

        public String getMlClass() {
            return mlClass;
        }

        public void setMlClass(String mlClass) {
            this.mlClass = mlClass;
        }

        public String getOldLat() {
            return oldLat;
        }

        public void setOldLat(String oldLat) {
            this.oldLat = oldLat;
        }

        public String getOldLon() {
            return oldLon;
        }

        public void setOldLon(String oldLon) {
            this.oldLon = oldLon;
        }

        public NewAddressList getNewAddressList() {
            return newAddressList;
        }

        public void setNewAddressList(NewAddressList newAddressList) {
            this.newAddressList = newAddressList;
        }
    }

    public static class NewAddressList {
        @SerializedName("newAddress")
        private List<NewAddress> newAddress;

        public List<NewAddress> getNewAddress() {
            return newAddress;
        }

        public void setNewAddress(List<NewAddress> newAddress) {
            this.newAddress = newAddress;
        }
    }

    public static class NewAddress {
        @SerializedName("newLat")
        private String newLat;

        @SerializedName("newLon")
        private String newLon;

        @SerializedName("roadName")
        private String roadName;

        @SerializedName("bldNo1")
        private String bldNo1;

        @SerializedName("bldNo2")
        private String bldNo2;

        @SerializedName("roadId")
        private String roadId;

        public String getNewLat() {
            return newLat;
        }

        public void setNewLat(String newLat) {
            this.newLat = newLat;
        }

        public String getNewLon() {
            return newLon;
        }

        public void setNewLon(String newLon) {
            this.newLon = newLon;
        }

        public String getRoadName() {
            return roadName;
        }

        public void setRoadName(String roadName) {
            this.roadName = roadName;
        }

        public String getBldNo1() {
            return bldNo1;
        }

        public void setBldNo1(String bldNo1) {
            this.bldNo1 = bldNo1;
        }

        public String getBldNo2() {
            return bldNo2;
        }

        public void setBldNo2(String bldNo2) {
            this.bldNo2 = bldNo2;
        }

        public String getRoadId() {
            return roadId;
        }

        public void setRoadId(String roadId) {
            this.roadId = roadId;
        }
    }
}
