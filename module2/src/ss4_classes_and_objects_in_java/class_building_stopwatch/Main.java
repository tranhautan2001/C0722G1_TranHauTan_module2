package ss4_classes_and_objects_in_java.class_building_stopwatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        // Làm cái gi đó để đo thời gian
        long sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }

        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime());

    }
}
