package DevInversionPrinciple;

import java.util.List;

public interface DevClass {
    double operation(List<? extends Number> numbers);
}
