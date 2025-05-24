package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_device_type implements CEnum {

    ma_device_type_playback(1), ma_device_type_capture(2), ma_device_type_duplex(3), ma_device_type_loopback(4);

    private static final int __size = 4;

    private final int index;

    ma_device_type(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_device_type getByIndex(int index) {
        switch(index) {
            case 1:
                return ma_device_type_playback;
            case 2:
                return ma_device_type_capture;
            case 3:
                return ma_device_type_duplex;
            case 4:
                return ma_device_type_loopback;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_device_typePointer extends EnumPointer<ma_device_type> {

        public ma_device_typePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_device_typePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_device_typePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_device_typePointer() {
            this(1, true);
        }

        public ma_device_typePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_device_type getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_device_type value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
