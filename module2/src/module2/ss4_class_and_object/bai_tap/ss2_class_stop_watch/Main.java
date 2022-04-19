package module2.ss4_class_and_object.bai_tap.ss2_class_stop_watch;

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
