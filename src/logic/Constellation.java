package logic;

public class Constellation {
    private String name;
    private String startTime;
    private String endTime;
    private String manDesc;
    private String womanDesc;
    public Constellation(String name, String startTime, String endTime, String manDesc, String womanDesc){
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.manDesc = manDesc;
        this.womanDesc = womanDesc;
    }
    public String getConstellationName() {
        return this.name;
    }
    public String getConstellationStartTime() {
        return this.startTime;
    }
    public String getConstellationEndTime() {
        return this.endTime;
    }
    public String getConstellationDesc(int sex) {  //0 女 1男
        if(sex == 1){
            return this.manDesc;
        }
        return this.womanDesc;
    }

}
