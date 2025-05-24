package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_pan_mode implements CEnum {

    ma_pan_mode_balance(0), ma_pan_mode_pan(1);

    private static final int __size = 4;

    private final int index;

    ma_pan_mode(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_pan_mode getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_pan_mode_balance;
            case 1:
                return ma_pan_mode_pan;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_pan_modePointer extends EnumPointer<ma_pan_mode> {

        public ma_pan_modePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_pan_modePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_pan_modePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_pan_modePointer() {
            this(1, true);
        }

        public ma_pan_modePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_pan_mode getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_pan_mode value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
