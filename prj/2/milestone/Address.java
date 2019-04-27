package AdressBook;

public class Address {
    private String countryName;
    private String stateName;
    private String cityName;
    private String streetName;
    private int zipNumber;
    private int houseNumber;

    public Address(String conName, String stName, String ctName, String strName, int zipNum, int houNum){
            countryName = conName;
            stateName = stName;
            cityName = ctName;
            streetName = strName;
            zipNumber = zipNum;
            houseNumber = houNum;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setZipNumber(int zipNumber) {
        this.zipNumber = zipNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCountryName(){
        return countryName;
    }

    public String getStateName(){
        return stateName;
    }

    public String getCityName(){
        return cityName;
    }

    public String getStreetName(){
        return streetName;
    }

    public int getHouseNumber(){
        return houseNumber;
    }

    public int getZipNumber(){
        return zipNumber;
    }

    public String export(){
        return getCountryName() + "\n" + getStateName() + "\n" + getCityName() + "\n" + getStreetName() + "\n" + getZipNumber() + "\n" + getHouseNumber();
    }

    public String toString()
    {
        return "\nCountry: " + getCountryName() + "\nState: " + getStateName() + "\nCity: " + getCityName() + "\nStreet: " + getStreetName() + "\nHouseNumber: " + getHouseNumber() + "\nZip Code: " + getZipNumber() + "\nHouse Number: " + getHouseNumber() +"\n";
    }

}
