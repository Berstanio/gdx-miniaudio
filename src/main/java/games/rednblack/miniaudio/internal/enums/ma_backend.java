package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_backend implements CEnum {

    ma_backend_wasapi(0),
    ma_backend_dsound(1),
    ma_backend_winmm(2),
    ma_backend_coreaudio(3),
    ma_backend_sndio(4),
    ma_backend_audio4(5),
    ma_backend_oss(6),
    ma_backend_pulseaudio(7),
    ma_backend_alsa(8),
    ma_backend_jack(9),
    ma_backend_aaudio(10),
    ma_backend_opensl(11),
    ma_backend_webaudio(12),
    ma_backend_custom(13),
    ma_backend_null(14);

    private static final int __size = 4;

    private final int index;

    ma_backend(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_backend getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_backend_wasapi;
            case 1:
                return ma_backend_dsound;
            case 2:
                return ma_backend_winmm;
            case 3:
                return ma_backend_coreaudio;
            case 4:
                return ma_backend_sndio;
            case 5:
                return ma_backend_audio4;
            case 6:
                return ma_backend_oss;
            case 7:
                return ma_backend_pulseaudio;
            case 8:
                return ma_backend_alsa;
            case 9:
                return ma_backend_jack;
            case 10:
                return ma_backend_aaudio;
            case 11:
                return ma_backend_opensl;
            case 12:
                return ma_backend_webaudio;
            case 13:
                return ma_backend_custom;
            case 14:
                return ma_backend_null;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_backendPointer extends EnumPointer<ma_backend> {

        public ma_backendPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_backendPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_backendPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_backendPointer() {
            this(1, true);
        }

        public ma_backendPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_backend getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_backend value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
