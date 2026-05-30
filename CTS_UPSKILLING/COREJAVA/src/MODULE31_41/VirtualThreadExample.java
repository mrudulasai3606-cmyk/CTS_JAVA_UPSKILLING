package MODULE31_41;

public class VirtualThreadExample {

    public static void main(String[] args)
            throws InterruptedException {

        long start = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {

            int taskId = i;

            Thread.startVirtualThread(() -> {
                System.out.println(
                        "Virtual Thread " + taskId);
            });
        }

        long end = System.currentTimeMillis();

        System.out.println(
                "Time Taken: " + (end - start) + " ms");

        Thread.sleep(2000);
    }
}