package InterviewProblems;

public enum EnumExample {

    addPlaceAPI("maps/api/place/add/json"),
    getPlaceAPI("maps/api/place/get/json"),
    deletePlaceAPI("maps/api/place/delete/json");

    private String resources;

    EnumExample(String resources){
        this.resources = resources;
    }

    public String getResources(){
        return resources;
    }
}
