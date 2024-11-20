package cn.com.nadav.sms.handler.codec.sgip.pdu;

/**
 * Represents the content of an SGIP (Short Message Gateway Interface Protocol) bind message.
 * This class encapsulates the necessary information for an SGIP bind operation, including
 * login type, login name, password, and a reserved field.
 */
public class SgipBindContent extends AbstractSgipContent {

    private int loginType;

    private String loginName;

    private String password;

    private String reserve;

    public SgipBindContent() {
    }

    public SgipBindContent(int loginType, String loginName, String password, String reserve) {
        this.loginType = loginType;
        this.loginName = loginName;
        this.password = password;
        this.reserve = reserve;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

}
