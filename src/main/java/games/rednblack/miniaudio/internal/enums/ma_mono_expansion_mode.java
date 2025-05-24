package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_mono_expansion_mode implements CEnum {

    ma_mono_expansion_mode_duplicate_ma_mono_expansion_mode_default(0), ma_mono_expansion_mode_average(1), ma_mono_expansion_mode_stereo_only(2);

    private static final int __size = 4;

    private final int index;

    ma_mono_expansion_mode(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_mono_expansion_mode getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_mono_expansion_mode_duplicate_ma_mono_expansion_mode_default;
            case 1:
                return ma_mono_expansion_mode_average;
            case 2:
                return ma_mono_expansion_mode_stereo_only;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_mono_expansion_modePointer extends EnumPointer<ma_mono_expansion_mode> {

        public ma_mono_expansion_modePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_mono_expansion_modePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_mono_expansion_modePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_mono_expansion_modePointer() {
            this(1, true);
        }

        public ma_mono_expansion_modePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_mono_expansion_mode getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_mono_expansion_mode value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
