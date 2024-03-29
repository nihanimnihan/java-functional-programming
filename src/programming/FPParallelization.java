package programming;

import java.util.stream.LongStream;

class FPParallelization {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();

        System.out.println(LongStream.range(0, 1000000000).sum());
        System.out.println(System.currentTimeMillis() - time);

        long time2 = System.currentTimeMillis();

        System.out.println(LongStream.range(0, 1000000000).parallel().sum());
        System.out.println(System.currentTimeMillis() - time2);
    }

}
