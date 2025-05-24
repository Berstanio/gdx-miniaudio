package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_positioning implements CEnum {

    ma_positioning_absolute(0), ma_positioning_relative(1);

    private static final int __size = 4;

    private final int index;

    ma_positioning(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_positioning getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_positioning_absolute;
            case 1:
                return ma_positioning_relative;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_positioningPointer extends EnumPointer<ma_positioning> {

        public ma_positioningPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_positioningPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_positioningPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_positioningPointer() {
            this(1, true);
        }

        public ma_positioningPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_positioning getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_positioning value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
