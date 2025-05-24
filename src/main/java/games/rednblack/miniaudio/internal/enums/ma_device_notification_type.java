package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_device_notification_type implements CEnum {

    ma_device_notification_type_started(0),
    ma_device_notification_type_stopped(1),
    ma_device_notification_type_rerouted(2),
    ma_device_notification_type_interruption_began(3),
    ma_device_notification_type_interruption_ended(4),
    ma_device_notification_type_unlocked(5);

    private static final int __size = 4;

    private final int index;

    ma_device_notification_type(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_device_notification_type getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_device_notification_type_started;
            case 1:
                return ma_device_notification_type_stopped;
            case 2:
                return ma_device_notification_type_rerouted;
            case 3:
                return ma_device_notification_type_interruption_began;
            case 4:
                return ma_device_notification_type_interruption_ended;
            case 5:
                return ma_device_notification_type_unlocked;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_device_notification_typePointer extends EnumPointer<ma_device_notification_type> {

        public ma_device_notification_typePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_device_notification_typePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_device_notification_typePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_device_notification_typePointer() {
            this(1, true);
        }

        public ma_device_notification_typePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_device_notification_type getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_device_notification_type value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
