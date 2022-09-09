package ss4_classes_and_objects_in_java.exercis.class_building_stopwatch;

public class StopWatch {
    private long startTime;
    private long endTime;
    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }
}
