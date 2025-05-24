package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_format implements CEnum {

    ma_format_unknown(0),
    ma_format_u8(1),
    ma_format_s16(2),
    ma_format_s24(3),
    ma_format_s32(4),
    ma_format_f32(5),
    ma_format_count(6);

    private static final int __size = 4;

    private final int index;

    ma_format(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_format getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_format_unknown;
            case 1:
                return ma_format_u8;
            case 2:
                return ma_format_s16;
            case 3:
                return ma_format_s24;
            case 4:
                return ma_format_s32;
            case 5:
                return ma_format_f32;
            case 6:
                return ma_format_count;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_formatPointer extends EnumPointer<ma_format> {

        public ma_formatPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_formatPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_formatPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_formatPointer() {
            this(1, true);
        }

        public ma_formatPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_format getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_format value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
