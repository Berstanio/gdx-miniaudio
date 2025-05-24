package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_performance_profile implements CEnum {

    ma_performance_profile_low_latency(0), ma_performance_profile_conservative(1);

    private static final int __size = 4;

    private final int index;

    ma_performance_profile(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_performance_profile getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_performance_profile_low_latency;
            case 1:
                return ma_performance_profile_conservative;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_performance_profilePointer extends EnumPointer<ma_performance_profile> {

        public ma_performance_profilePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_performance_profilePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_performance_profilePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_performance_profilePointer() {
            this(1, true);
        }

        public ma_performance_profilePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_performance_profile getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_performance_profile value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
