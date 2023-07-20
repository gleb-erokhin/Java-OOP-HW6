package SinglePrinciple;

import java.util.List;

public class DevCalculator {
    public double devision(List<? extends Number> numbers) {
        double res = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            res = res / numbers.get(i).doubleValue();
        }
        return res;
    }
}
