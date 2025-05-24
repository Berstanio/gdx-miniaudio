package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_opensl_stream_type implements CEnum {

    ma_opensl_stream_type_default(0),
    ma_opensl_stream_type_voice(1),
    ma_opensl_stream_type_system(2),
    ma_opensl_stream_type_ring(3),
    ma_opensl_stream_type_media(4),
    ma_opensl_stream_type_alarm(5),
    ma_opensl_stream_type_notification(6);

    private static final int __size = 4;

    private final int index;

    ma_opensl_stream_type(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_opensl_stream_type getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_opensl_stream_type_default;
            case 1:
                return ma_opensl_stream_type_voice;
            case 2:
                return ma_opensl_stream_type_system;
            case 3:
                return ma_opensl_stream_type_ring;
            case 4:
                return ma_opensl_stream_type_media;
            case 5:
                return ma_opensl_stream_type_alarm;
            case 6:
                return ma_opensl_stream_type_notification;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_opensl_stream_typePointer extends EnumPointer<ma_opensl_stream_type> {

        public ma_opensl_stream_typePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_opensl_stream_typePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_opensl_stream_typePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_opensl_stream_typePointer() {
            this(1, true);
        }

        public ma_opensl_stream_typePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_opensl_stream_type getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_opensl_stream_type value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
