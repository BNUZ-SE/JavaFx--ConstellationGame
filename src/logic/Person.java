package logic;

public class Person {
    protected String name;
    protected String constellation;
    protected int sex;
    public Person(String name,String constellation,int sex){
        this.name = name;
        this.constellation = constellation;
        this.sex = sex;
    }
    public Person() {
        this.name="";
        this.constellation="";
        this.sex = 1;
    }
    public String getPersonName() {
        return this.name;
    }
    public String getPersonConstellation() {
        return this.constellation;
    }
    public Integer getPersonSex() {
        return this.sex;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setConstellation(String constellation){
        this.constellation = constellation;
    }
    public void setSex(int sex){
        this.sex = sex;
    }
}
