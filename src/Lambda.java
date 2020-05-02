import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
    public static BiFunction<Double, Double, Double> getMax() {
        return (x, y) -> Math.max(x, y);
    }

    public static Function<Double, Double> getSqrt() {
        return Math::sqrt;
    }
}
