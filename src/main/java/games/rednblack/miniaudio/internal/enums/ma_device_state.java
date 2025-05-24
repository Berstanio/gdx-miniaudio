package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_device_state implements CEnum {

    ma_device_state_uninitialized(0), ma_device_state_stopped(1), ma_device_state_started(2), ma_device_state_starting(3), ma_device_state_stopping(4);

    private static final int __size = 4;

    private final int index;

    ma_device_state(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_device_state getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_device_state_uninitialized;
            case 1:
                return ma_device_state_stopped;
            case 2:
                return ma_device_state_started;
            case 3:
                return ma_device_state_starting;
            case 4:
                return ma_device_state_stopping;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_device_statePointer extends EnumPointer<ma_device_state> {

        public ma_device_statePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_device_statePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_device_statePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_device_statePointer() {
            this(1, true);
        }

        public ma_device_statePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_device_state getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_device_state value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
