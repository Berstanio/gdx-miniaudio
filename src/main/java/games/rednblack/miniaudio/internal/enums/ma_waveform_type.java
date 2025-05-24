package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_waveform_type implements CEnum {

    ma_waveform_type_sine(0), ma_waveform_type_square(1), ma_waveform_type_triangle(2), ma_waveform_type_sawtooth(3);

    private static final int __size = 4;

    private final int index;

    ma_waveform_type(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_waveform_type getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_waveform_type_sine;
            case 1:
                return ma_waveform_type_square;
            case 2:
                return ma_waveform_type_triangle;
            case 3:
                return ma_waveform_type_sawtooth;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_waveform_typePointer extends EnumPointer<ma_waveform_type> {

        public ma_waveform_typePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_waveform_typePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_waveform_typePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_waveform_typePointer() {
            this(1, true);
        }

        public ma_waveform_typePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_waveform_type getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_waveform_type value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
