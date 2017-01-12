import java.io.Serializable;

/**
 * Created by User on 08.01.2017.
 */
public class Specifications implements Serializable {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

//public class Staff implements Serializable {
//    private String firsstName;
//    private String lastName;
//    private String nickName;
//    private double sallaryValue;
//    private boolean isRegular;
//
//    public String getFirsstName() {
//        return firsstName;
//    }
//
//    public void setFirsstName(String firsstName) {
//        this.firsstName = firsstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getNickName() {
//        return nickName;
//    }
//
//    public void setNickName(String nickName) {
//        this.nickName = nickName;
//    }
//
//    public double getSallaryValue() {
//        return sallaryValue;
//    }
//
//    public void setSallaryValue(double sallaryValue) {
//        this.sallaryValue = sallaryValue;
//    }
//
//    public boolean isRegular() {
//        return isRegular;
//    }
//
//    public void setIsRegular(boolean isRegular) {
//        this.isRegular = isRegular;
//    }
//}
