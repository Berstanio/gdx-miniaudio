package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_aaudio_allowed_capture_policy implements CEnum {

    ma_aaudio_allow_capture_default(0), ma_aaudio_allow_capture_by_all(1), ma_aaudio_allow_capture_by_system(2), ma_aaudio_allow_capture_by_none(3);

    private static final int __size = 4;

    private final int index;

    ma_aaudio_allowed_capture_policy(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_aaudio_allowed_capture_policy getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_aaudio_allow_capture_default;
            case 1:
                return ma_aaudio_allow_capture_by_all;
            case 2:
                return ma_aaudio_allow_capture_by_system;
            case 3:
                return ma_aaudio_allow_capture_by_none;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_aaudio_allowed_capture_policyPointer extends EnumPointer<ma_aaudio_allowed_capture_policy> {

        public ma_aaudio_allowed_capture_policyPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_aaudio_allowed_capture_policyPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_aaudio_allowed_capture_policyPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_aaudio_allowed_capture_policyPointer() {
            this(1, true);
        }

        public ma_aaudio_allowed_capture_policyPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_aaudio_allowed_capture_policy getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_aaudio_allowed_capture_policy value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
