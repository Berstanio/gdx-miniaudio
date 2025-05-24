package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_dither_mode implements CEnum {

    ma_dither_mode_none(0), ma_dither_mode_rectangle(1), ma_dither_mode_triangle(2);

    private static final int __size = 4;

    private final int index;

    ma_dither_mode(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_dither_mode getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_dither_mode_none;
            case 1:
                return ma_dither_mode_rectangle;
            case 2:
                return ma_dither_mode_triangle;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_dither_modePointer extends EnumPointer<ma_dither_mode> {

        public ma_dither_modePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_dither_modePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_dither_modePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_dither_modePointer() {
            this(1, true);
        }

        public ma_dither_modePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_dither_mode getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_dither_mode value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
