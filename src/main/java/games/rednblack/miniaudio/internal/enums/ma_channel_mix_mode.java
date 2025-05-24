package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_channel_mix_mode implements CEnum {

    ma_channel_mix_mode_rectangular_ma_channel_mix_mode_default(0), ma_channel_mix_mode_simple(1), ma_channel_mix_mode_custom_weights(2);

    private static final int __size = 4;

    private final int index;

    ma_channel_mix_mode(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_channel_mix_mode getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_channel_mix_mode_rectangular_ma_channel_mix_mode_default;
            case 1:
                return ma_channel_mix_mode_simple;
            case 2:
                return ma_channel_mix_mode_custom_weights;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_channel_mix_modePointer extends EnumPointer<ma_channel_mix_mode> {

        public ma_channel_mix_modePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_channel_mix_modePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_channel_mix_modePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_channel_mix_modePointer() {
            this(1, true);
        }

        public ma_channel_mix_modePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_channel_mix_mode getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_channel_mix_mode value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
