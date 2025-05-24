package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_handedness implements CEnum {

    ma_handedness_right(0), ma_handedness_left(1);

    private static final int __size = 4;

    private final int index;

    ma_handedness(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_handedness getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_handedness_right;
            case 1:
                return ma_handedness_left;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_handednessPointer extends EnumPointer<ma_handedness> {

        public ma_handednessPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_handednessPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_handednessPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_handednessPointer() {
            this(1, true);
        }

        public ma_handednessPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_handedness getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_handedness value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
