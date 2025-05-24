package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_opensl_recording_preset implements CEnum {

    ma_opensl_recording_preset_default(0),
    ma_opensl_recording_preset_generic(1),
    ma_opensl_recording_preset_camcorder(2),
    ma_opensl_recording_preset_voice_recognition(3),
    ma_opensl_recording_preset_voice_communication(4),
    ma_opensl_recording_preset_voice_unprocessed(5);

    private static final int __size = 4;

    private final int index;

    ma_opensl_recording_preset(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_opensl_recording_preset getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_opensl_recording_preset_default;
            case 1:
                return ma_opensl_recording_preset_generic;
            case 2:
                return ma_opensl_recording_preset_camcorder;
            case 3:
                return ma_opensl_recording_preset_voice_recognition;
            case 4:
                return ma_opensl_recording_preset_voice_communication;
            case 5:
                return ma_opensl_recording_preset_voice_unprocessed;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_opensl_recording_presetPointer extends EnumPointer<ma_opensl_recording_preset> {

        public ma_opensl_recording_presetPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_opensl_recording_presetPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_opensl_recording_presetPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_opensl_recording_presetPointer() {
            this(1, true);
        }

        public ma_opensl_recording_presetPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_opensl_recording_preset getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_opensl_recording_preset value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
