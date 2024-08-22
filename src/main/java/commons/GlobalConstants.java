package commons;

import java.io.File;

public class GlobalConstants {

    // Timeout: short, long
    public static final long SHORT_TIMEOUT = 5;
    public static final long LONG_TIMEOUT = 10;

    // OS name
    public static final String OS_NAME = System.getProperty("os.name");

    // Relative project path
    public static final String RELATIVE_PROJECT_PATH = System.getProperty("user.dir");

    // Download/upload file folder
    public static final String DOWNLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator + "downloadFiles" + File.separator;
    public static final String UPLOAD_PATH = RELATIVE_PROJECT_PATH + File.separator + "uploadImage" + File.separator;

    // Browser extention folder
    public static final String BROWSER_EXTENTION_PATH = RELATIVE_PROJECT_PATH + File.separator + "browserExtension" + File.separator;

    // Browser log folder
    public static final String BROWSER_LOG_FOLDER = RELATIVE_PROJECT_PATH + File.separator + "browserLog" + File.separator;
    public static final String REPORTING_IMAGE_PATH = RELATIVE_PROJECT_PATH + File.separator + "reportNGImage" + File.separator;

    //Java version
    public static final String JAVA_VERSION = System.getProperty("java.version");

    // Admin dev-env account
    public static final String DEV_ADMIN_USERNAME = "admin@naver.com";
    public static final String DEV_ADMIN_PASSWORD = "12345";

    // User dev-env account
    public static final String DEV_USER_USERNAME = "bidvtest";
    public static final String DEV_USER_PASSWORD = "12345";

    // Wordpress (DB name: )
    public static final String WORDPRESS_DATABASE_USERNAME = "";
    public static final String WORDPRESS_DATABASE_PASSWORD = "";

    // Dev admin url
    public static final String DEV_ADMIN_URL = "https://devbidv-admin.infocms.com.vn/";



}
