package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_aaudio_input_preset implements CEnum {

    ma_aaudio_input_preset_default(0),
    ma_aaudio_input_preset_generic(1),
    ma_aaudio_input_preset_camcorder(2),
    ma_aaudio_input_preset_voice_recognition(3),
    ma_aaudio_input_preset_voice_communication(4),
    ma_aaudio_input_preset_unprocessed(5),
    ma_aaudio_input_preset_voice_performance(6);

    private static final int __size = 4;

    private final int index;

    ma_aaudio_input_preset(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_aaudio_input_preset getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_aaudio_input_preset_default;
            case 1:
                return ma_aaudio_input_preset_generic;
            case 2:
                return ma_aaudio_input_preset_camcorder;
            case 3:
                return ma_aaudio_input_preset_voice_recognition;
            case 4:
                return ma_aaudio_input_preset_voice_communication;
            case 5:
                return ma_aaudio_input_preset_unprocessed;
            case 6:
                return ma_aaudio_input_preset_voice_performance;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_aaudio_input_presetPointer extends EnumPointer<ma_aaudio_input_preset> {

        public ma_aaudio_input_presetPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_aaudio_input_presetPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_aaudio_input_presetPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_aaudio_input_presetPointer() {
            this(1, true);
        }

        public ma_aaudio_input_presetPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_aaudio_input_preset getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_aaudio_input_preset value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
