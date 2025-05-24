package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

/**
 * **********************************************************************************************************************************************************
 * Channel Conversion
 * ***********************************************************************************************************************************************************
 */
public enum ma_channel_conversion_path implements CEnum {

    ma_channel_conversion_path_unknown(0),
    ma_channel_conversion_path_passthrough(1),
    ma_channel_conversion_path_mono_out(2),
    ma_channel_conversion_path_mono_in(3),
    ma_channel_conversion_path_shuffle(4),
    ma_channel_conversion_path_weights(5);

    private static final int __size = 4;

    private final int index;

    ma_channel_conversion_path(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_channel_conversion_path getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_channel_conversion_path_unknown;
            case 1:
                return ma_channel_conversion_path_passthrough;
            case 2:
                return ma_channel_conversion_path_mono_out;
            case 3:
                return ma_channel_conversion_path_mono_in;
            case 4:
                return ma_channel_conversion_path_shuffle;
            case 5:
                return ma_channel_conversion_path_weights;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_channel_conversion_pathPointer extends EnumPointer<ma_channel_conversion_path> {

        public ma_channel_conversion_pathPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_channel_conversion_pathPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_channel_conversion_pathPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_channel_conversion_pathPointer() {
            this(1, true);
        }

        public ma_channel_conversion_pathPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_channel_conversion_path getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_channel_conversion_path value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
