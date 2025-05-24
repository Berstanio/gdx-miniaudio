package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_seek_origin implements CEnum {

    ma_seek_origin_start(0), ma_seek_origin_current(1), ma_seek_origin_end(2);

    private static final int __size = 4;

    private final int index;

    ma_seek_origin(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_seek_origin getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_seek_origin_start;
            case 1:
                return ma_seek_origin_current;
            case 2:
                return ma_seek_origin_end;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_seek_originPointer extends EnumPointer<ma_seek_origin> {

        public ma_seek_originPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_seek_originPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_seek_originPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_seek_originPointer() {
            this(1, true);
        }

        public ma_seek_originPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_seek_origin getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_seek_origin value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
