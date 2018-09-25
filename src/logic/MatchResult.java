package logic;

public class MatchResult {
    private String constellationOne;
    private String constellationTwo;
    private String descManAndWoman;
    private String descWomanAndMan;
    private int percentManAndWoman;
    private int percentWomanAndMan;
    public MatchResult (String constellationOne, String constellationTwo, String descManAndWoman, String descWomanAndMan, int percentManAndWoman, int percentWomanAndMan){
        this.constellationOne = constellationOne;
        this.constellationTwo = constellationTwo;
        this.descManAndWoman = descManAndWoman;
        this.descWomanAndMan = descWomanAndMan;
        this.percentManAndWoman = percentManAndWoman;
        this.percentWomanAndMan = percentWomanAndMan;
    }
    public String getConstellationOne(){
        return this.constellationOne;
    }
    public String getConstellationTwo(){
        return this.constellationTwo;
    }
    public String getDescManAndWoman(){
        return this.descManAndWoman;
    }
    public String getDescWomanAndMan(){
        return this.descWomanAndMan;
    }
    public Integer getPercentManAndWoman(){
        return this.percentManAndWoman;
    }
    public Integer getPercentWomanAndMan(){
        return this.percentWomanAndMan;
    }
}
