package com.com.sightseeingrecommendation;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

public class URLTemplate {
    private String encodingKey;
    private String decodingKey;
    private String appName;

    private String m_SightUrl;
    private String m_EventDateUrl;
    private String m_NearPositionUrl;

    private String defaultSightURL;
    private String defaultEveltDateURL;
    private String defaultNearPositionURL;

    private String contentTypeURL;
    private String areaCodeURL;

    private String eventStartDateURL;
    private String eventEndDateURL;

    private String mapXURL;
    private String mapYURL;
    private String radiusURL;

    private String mobileOsURL;
    private String mobileAppURL;

    private ArrayList<String> contentType;
    private ArrayList<String> areaCode;

    private String m_AreaCode;
    private String m_ContentType;
    private String m_EventStartDate;
    private String m_EventEndDate;
    private String m_MapX;
    private String m_MapY;
    private String m_Radius;


    public static final String touristDestination = new String("12"); // 관광지
    public static final String culturalFacilities = new String("14"); // 문화시설
    public static final String festivalEvent = new String("15");      // 축제공연행사
    public static final String travelCourse = new String("25");       // 여행코스
    public static final String sports = new String("28");             // 레포츠
    public static final String lodgment = new String("32");           // 숙박
    public static final String shopping = new String("38");           // 쇼핑
    public static final String restaurant = new String("39");         // 음식점


    public static final String Seoul = new String("1");              // 서울
    public static final String Incheon = new String("2");            // 인천
    public static final String Daejeon = new String("3");            // 대전
    public static final String Daegu = new String("4");              // 대구
    public static final String Gwangju = new String("5");            // 광주
    public static final String Busan = new String("6");              // 부산
    public static final String Ulsan = new String("7");              // 울산
    public static final String Sejong = new String("8");             // 세종특별자치시
    public static final String Gyeonggido = new String("31");        // 경기도
    public static final String Gangwondo = new String("32");         // 강원도
    public static final String Chungcheongbukdo = new String("33");  // 충청북도
    public static final String Chungcheongnamdo = new String("34");  // 충청남도
    public static final String Gyeongsangbukdo = new String("35");   // 경상북도
    public static final String Gyeongsangnamdo = new String("36");   // 경상남도
    public static final String Jeollabukdo = new String("37");       // 전라북도
    public static final String Jeollanamdo = new String("38");       // 전라남도
    public static final String JejuIsland = new String("39");        // 제주도


    // Constructor
    public URLTemplate() {

         /* Key */
        encodingKey = new String("70PtmeOob2gD%2Bx5qjZpYrKzWlsGxqf1qFrbirpOOlQx48zO3zcfpTf6wPlo2msbftiVKxNM%2FjY57bB%2BsUUrgBg%3D%3D") ;
        decodingKey = new String("70PtmeOob2gD+x5qjZpYrKzWlsGxqf1qFrbirpOOlQx48zO3zcfpTf6wPlo2msbftiVKxNM/jY57bB+sUUrgBg==");

        // APP NAME
        appName = new String("SightseeingRecommendation");

        /*Default URL*/
        defaultSightURL = new String("http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=");
        defaultEveltDateURL = new String("http://api.visitkorea.or.kr/openapi/service/rest/KorService/searchFestival?ServiceKey=");
        defaultNearPositionURL = new String("http://api.visitkorea.or.kr/openapi/service/rest/KorService/locationBasedList?ServiceKey=");

        contentTypeURL = new String("&contentTypeId=");
        areaCodeURL = new String("&areaCode=");

        mobileOsURL = new String("&MobileOS=AND");
        mobileAppURL = new String("&MobileApp=" + appName);

        eventStartDateURL = new String("&eventStartDate=");
        eventEndDateURL = new String("&eventStartDate=");

        mapXURL = new String("&mapX=");
        mapYURL = new String("&mapY=");
        radiusURL = new String("&radius=");

        contentType = new ArrayList<>(Arrays.asList(
                 touristDestination
                ,culturalFacilities
                ,festivalEvent
                ,travelCourse
                ,sports
                ,lodgment
                ,shopping
                ,restaurant));

        areaCode = new ArrayList<>(Arrays.asList(
                 Seoul
                ,Incheon
                ,Daejeon
                ,Daegu
                ,Gwangju
                ,Busan
                ,Ulsan
                ,Sejong
                ,Gyeonggido
                ,Gangwondo
                ,Chungcheongbukdo
                ,Chungcheongnamdo
                ,Gyeongsangbukdo
                ,Gyeongsangnamdo
                ,Jeollabukdo
                ,Jeollanamdo
                ,JejuIsland
                ));

        m_AreaCode = new String("");
        m_ContentType = new String("");
        m_EventStartDate = new String("");
        m_EventEndDate = new String("");
        m_MapX = new String("");
        m_MapY = new String("");
        m_Radius = new String("");

        m_SightUrl = new String("");
        m_EventDateUrl = new String("");
        m_NearPositionUrl = new String("");
    }

    public String getAreaCode() {return m_AreaCode;}
    public String getContentType() {return m_ContentType;}
    public String getEventStartDate() {return m_EventStartDate;}
    public String getEventEndDate() {return m_EventEndDate;}
    public String getMapX() {return m_MapX;}
    public String getMapY() {return m_MapY;}
    public String getRadius() {return m_Radius;}

    public void setAreaCode(String _AreaCode) {m_AreaCode = _AreaCode;}
    public void setContentType(String _ContentType) {m_ContentType = _ContentType;}
    public void setEventStartDate(String _EventStartDate) {m_EventStartDate = _EventStartDate;}
    public void setEventEndDate(String _EventEndDate) {m_EventEndDate = _EventEndDate;}
    public void setMapX(String _MapX) {m_MapX = _MapX;}
    public void setMapY(String _MapY) {m_MapY = _MapY;}
    public void setRadius(String _Radius) {m_Radius = _Radius;}

    public String sightURL(){
        m_SightUrl =
                  defaultSightURL
                + encodingKey
                + contentTypeURL
                + m_ContentType
                + areaCodeURL
                + m_AreaCode
                + mobileOsURL
                + mobileAppURL;
        return m_SightUrl;
    }

    public String eventURL(){
        m_EventDateUrl =
                  defaultEveltDateURL
                + encodingKey
                + eventStartDateURL
                + m_EventStartDate
                + eventEndDateURL
                + m_EventEndDate
                + areaCodeURL
                + m_AreaCode
                + mobileOsURL
                + mobileAppURL;
        return m_EventDateUrl;
    }

    public String nearPositionURL(){
        m_NearPositionUrl =
                  defaultNearPositionURL
                + encodingKey
                + contentTypeURL
                + m_ContentType
                + mapXURL
                + m_MapX
                + mapYURL
                + m_MapY
                + radiusURL
                + m_Radius
                + mobileOsURL
                + mobileAppURL;
        return m_EventDateUrl;
    }
    //Log.d("[URLTest]", m_url.joinToString(""));
}
