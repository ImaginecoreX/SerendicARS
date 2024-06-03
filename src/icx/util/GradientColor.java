package icx.util;

/**
 *
 * @author sandaruwan
 */
import java.awt.Color;

public class GradientColor extends Color {

    public GradientColor(Color start, Color end, int width, int row, int rowHeight) {
        super(
            interpolate(start.getRed(), end.getRed(), width, row * rowHeight),
            interpolate(start.getGreen(), end.getGreen(), width, row * rowHeight),
            interpolate(start.getBlue(), end.getBlue(), width, row * rowHeight)
        );
    }

    private static int interpolate(int start, int end, int width, int currentPosition) {
        return start + (end - start) * currentPosition / width;
    }
}
