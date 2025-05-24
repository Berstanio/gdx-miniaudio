package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_resample_algorithm implements CEnum {

    ma_resample_algorithm_linear(0), ma_resample_algorithm_custom(1);

    private static final int __size = 4;

    private final int index;

    ma_resample_algorithm(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_resample_algorithm getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_resample_algorithm_linear;
            case 1:
                return ma_resample_algorithm_custom;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_resample_algorithmPointer extends EnumPointer<ma_resample_algorithm> {

        public ma_resample_algorithmPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_resample_algorithmPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_resample_algorithmPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_resample_algorithmPointer() {
            this(1, true);
        }

        public ma_resample_algorithmPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_resample_algorithm getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_resample_algorithm value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
