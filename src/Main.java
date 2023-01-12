
import io.agora.media.RtcTokenBuilder2;
import io.agora.media.RtcTokenBuilder2.Role;

public class Main {
    static String appId = "App ID";
    static String appCertificate = "App Certificate";
    static String channelName = "Hello";
    static int uid = 0; // The integer uid, required for an RTC token
    static int expirationTimeInSeconds = 3600; // The time after which the token expires

    public static void main(String[] args) throws Exception {
        RtcTokenBuilder2 tokenBuilder = new RtcTokenBuilder2();
        // Calculate the time expiry timestamp
        int timestamp = (int)(System.currentTimeMillis() / 1000 + expirationTimeInSeconds);

        System.out.println("UID token");
        String result = tokenBuilder.buildTokenWithUid(appId, appCertificate,
                channelName, uid, Role.ROLE_PUBLISHER, timestamp, timestamp);
        System.out.println(result);
    }
}