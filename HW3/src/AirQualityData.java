// HW2, 자바프로그래밍, 2분반, 2025.04.17, 32203919, 장천명
/**
 * 대기질 데이터를 관리하는 enum 클래스
 */
public enum AirQualityData {
    // 각 행은 {날짜, 측정소, PM2.5, PM10, O3, NO2, CO, SO2} 형식
    AVERAGE("2025-04-10 08:00", "평균", "39", "54", "0.0176", "0.0320", "0.57", "0.0029"),
    GANGNAM("2025-04-10 08:00", "강남구", "44", "59", "0.0177", "0.0356", "0.50", "0.0024"),
    GANGDONG("2025-04-10 08:00", "강동구", "41", "56", "0.0116", "0.0387", "0.77", "0.0026"),
    GANGBUK("2025-04-10 08:00", "강북구", "31", "40", "0.0282", "0.0204", "0.49", "0.0024"),
    GANGSEO("2025-04-10 08:00", "강서구", "41", "61", "0.0095", "0.0422", "0.56", "0.0039"),
    GWANAK("2025-04-10 08:00", "관악구", "32", "42", "0.0141", "0.0407", "0.62", "0.0029"),
    GWANGJIN("2025-04-10 08:00", "광진구", "38", "52", "0.0165", "0.0361", "0.59", "0.0028"),
    GURO("2025-04-10 08:00", "구로구", "50", "57", "0.0170", "0.0299", "0.47", "0.0028"),
    GEUMCHEON("2025-04-10 08:00", "금천구", "36", "55", "0.0102", "0.0481", "0.56", "0.0031"),
    NOWON("2025-04-10 08:00", "노원구", "36", "51", "0.0161", "0.0333", "0.58", "0.0028"),
    DOBONG("2025-04-10 08:00", "도봉구", "34", "50", "0.0272", "0.0225", "0.61", "0.0033"),
    DONGDAEMUN("2025-04-10 08:00", "동대문구", "41", "60", "0.0207", "0.0261", "0.56", "0.0025"),
    DONGJAK("2025-04-10 08:00", "동작구", "39", "54", "0.0269", "0.0296", "0.49", "0.0028"),
    MAPO("2025-04-10 08:00", "마포구", "40", "46", "0.0219", "0.0233", "0.50", "0.0029"),
    SEODAEMUN("2025-04-10 08:00", "서대문구", "42", "52", "0.0162", "0.0255", "0.74", "0.0041"),
    SEOCHO("2025-04-10 08:00", "서초구", "47", "68", "0.0143", "0.0363", "0.50", "0.0025"),
    SEONGDONG("2025-04-10 08:00", "성동구", "42", "56", "0.0143", "0.0354", "0.52", "0.0025"),
    SEONGBUK("2025-04-10 08:00", "성북구", "33", "49", "0.0239", "0.0235", "0.66", "0.0031"),
    SONGPA("2025-04-10 08:00", "송파구", "32", "49", "0.0139", "0.0413", "0.51", "0.0038"),
    YANGCHEON("2025-04-10 08:00", "양천구", "43", "62", "0.0100", "0.0422", "0.60", "0.0032"),
    YEONGDEUNGPO("2025-04-10 08:00", "영등포구", "42", "51", "0.0149", "0.0342", "0.55", "0.0026"),
    YONGSAN("2025-04-10 08:00", "용산구", "41", "56", "0.0155", "0.0323", "0.56", "0.0034"),
    EUNPYEONG("2025-04-10 08:00", "은평구", "38", "53", "0.0108", "0.0272", "0.68", "0.0028"),
    JONGNO("2025-04-10 08:00", "종로구", "43", "59", "0.0246", "0.0243", "0.56", "0.0029"),
    JUNG("2025-04-10 08:00", "중구", "43", "53", "0.0280", "0.0225", "0.56", "0.0024"),
    JUNGNANG("2025-04-10 08:00", "중랑구", "34", "53", "0.0158", "0.0281", "0.53", "0.0025");

    private final String[] data;

    /**
     * 대기질 데이터를 초기화하는 생성자
     * @param dateTime 측정 시간
     * @param station 측정소 이름
     * @param pm25 PM2.5 농도
     * @param pm10 PM10 농도
     * @param o3 오존 농도
     * @param no2 이산화질소 농도
     * @param co 일산화탄소 농도
     * @param so2 이산화황 농도
     */
    AirQualityData(String dateTime, String station, String pm25, String pm10, 
                  String o3, String no2, String co, String so2) {
        this.data = new String[]{dateTime, station, pm25, pm10, o3, no2, co, so2};
    }

    /**
     * 대기질 데이터를 반환
     * @return 대기질 데이터 배열
     */
    public String[] getData() {
        return data;
    }

    /**
     * 모든 대기질 데이터를 2차원 배열로 반환
     * @return 모든 대기질 데이터가 포함된 2차원 배열
     */
    public static String[][] getAllData() {
        AirQualityData[] values = values();
        String[][] result = new String[values.length][];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i].getData();
        }
        return result;
    }
}
