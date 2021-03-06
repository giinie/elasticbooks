package example.korean;

import example.korean.compare.ComparePerformanceAnalysisTest;

public class KoreanAnalyzerPerformanceComparingExample {
    public static void main(String[] args) {
        ComparePerformanceAnalysisTest test = new ComparePerformanceAnalysisTest();

        // 아리랑 분석기
        System.out.println("=============== 아리랑 분석기 ===============");
        test.arirangIndexTest();

        // 한나눔 분석기
        System.out.println("=============== 한나눔 분석기 ===============");
        test.hannanumAanalyzeTest();

        // s은전한닢 분석기
        System.out.println("=============== s은전한닢 분석기 ===============");
        test.eunjeonTest();

        // 꼬꼬마 분석기
        System.out.println("=============== 꼬꼬마 분석기 ===============");
        test.kkmaTest();

        // 트위터 분석기
        System.out.println("=============== 트위터 분석기 ===============");
        test.twitterTest();
    }
}
