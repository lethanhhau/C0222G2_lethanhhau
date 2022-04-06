package ss4_lop_va_doi_tuong_trong_java.bai_tap.SS2ClassStopWatch;

public class Main {
    public static void main(String[] args) {
        int t;
        StopWatch st = new StopWatch();
        st.setStartTime(System.currentTimeMillis());
        long stars = st.getStartTime();
        System.out.println(stars);
        for (int i = 0; i < 100000; i++) {
            t = 1 + 1;
            t = 1 + 2;
            t = 0;
        }
        st.setEndTime(System.currentTimeMillis());
        long end = st.getEndTime();
        System.out.println(end);
        System.out.println("Elapsed time: " + st.getElapsedTime());
        st.start();
        st.stop();
    }
}
