package vo;

import java.io.File;

/**
 * Created by Benjamin on 2019/1/9.
 */
public class ipaInfo {
    public static String appName;
    public static String packgeName;
    public static String versionCode;
    public static String versionName;
    public static String minSdk;

    public static String provisionName;
    public static String AppIDName;
    public static String UUID;
    public static String TeamName;
    public static String ExpirationDate;
    public static File mobileprovision;


    public static String getAppName() {
        return appName;
    }

    public static void setAppName(String appName) {
        ipaInfo.appName = appName;
    }

    public static String getPackgeName() {
        return packgeName;
    }

    public static void setPackgeName(String packgeName) {
        ipaInfo.packgeName = packgeName;
    }

    public static String getVersionCode() {
        return versionCode;
    }

    public static void setVersionCode(String versionCode) {
        ipaInfo.versionCode = versionCode;
    }

    public static String getVersionName() {
        return versionName;
    }

    public static void setVersionName(String versionName) {
        ipaInfo.versionName = versionName;
    }

    public static String getMinSdk() {
        return minSdk;
    }

    public static void setMinSdk(String minSdk) {
        ipaInfo.minSdk = minSdk;
    }

    public static String getProvisionName() {
        return provisionName;
    }

    public static void setProvisionName(String provisionName) {
        ipaInfo.provisionName = provisionName;
    }

    public static String getAppIDName() {
        return AppIDName;
    }

    public static void setAppIDName(String appIDName) {
        AppIDName = appIDName;
    }

    public static String getUUID() {
        return UUID;
    }

    public static void setUUID(String UUID) {
        ipaInfo.UUID = UUID;
    }

    public static String getTeamName() {
        return TeamName;
    }

    public static void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public static String getExpirationDate() {
        return ExpirationDate;
    }

    public static void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }

    public static File getMobileprovision() {
        return mobileprovision;
    }

    public static void setMobileprovision(File mobileprovision) {
        ipaInfo.mobileprovision = mobileprovision;
    }
}
