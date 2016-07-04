package net.ballmerlabs.scatterbrain.network;

/**
 * General device information and settings storage.
 */
public class DeviceProfile {

    protected String mac;

    public static enum deviceType {
        ANDROID, IOS, LINUX
    };

    public static enum MobileStatus {
      STATIONARY, MOBILE, VERYMOBILE
    };

    public static enum HardwareServices {
        WIFIP2P, WIFICLIENT, WIFIAP, BLUETOOTH,
        BLUETOOTHLE, INTERNET
    };


    protected deviceType type;
    protected MobileStatus status;
    protected HardwareServices services;

    public final byte protocolVersion = 2;
    protected byte congestion;
    public DeviceProfile (deviceType type, MobileStatus status, HardwareServices services, String mac) {
        this.type = type;
        this.services = services;
        this.status = status;
        congestion = 0;
        this.mac = mac;
    }

    public void  update(deviceType type, MobileStatus status, HardwareServices services) {
        this.type = type;
        this.services = services;
        this.status = status;
    }

    public deviceType getType() {
        return type;
    }

    public HardwareServices getServices() {
        return services;
    }

    public MobileStatus getStatus() {
        return status;
    }

    public byte getProtocolVersion() {
        return protocolVersion;
    }

    public byte getCongestion() { return congestion; }

    public void setCongestion(byte congestion) { this.congestion = congestion; }
    public String getMac(){ return this.mac;}

    public void setMac(String mac){this.mac = mac;}
}
