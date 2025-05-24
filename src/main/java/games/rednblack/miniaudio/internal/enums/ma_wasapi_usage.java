package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_wasapi_usage implements CEnum {

    ma_wasapi_usage_default(0), ma_wasapi_usage_games(1), ma_wasapi_usage_pro_audio(2);

    private static final int __size = 4;

    private final int index;

    ma_wasapi_usage(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_wasapi_usage getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_wasapi_usage_default;
            case 1:
                return ma_wasapi_usage_games;
            case 2:
                return ma_wasapi_usage_pro_audio;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_wasapi_usagePointer extends EnumPointer<ma_wasapi_usage> {

        public ma_wasapi_usagePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_wasapi_usagePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_wasapi_usagePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_wasapi_usagePointer() {
            this(1, true);
        }

        public ma_wasapi_usagePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_wasapi_usage getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_wasapi_usage value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
