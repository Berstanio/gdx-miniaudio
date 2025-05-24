package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_standard_channel_map implements CEnum {

    ma_standard_channel_map_microsoft_ma_standard_channel_map_default(0),
    ma_standard_channel_map_alsa(1),
    ma_standard_channel_map_rfc3551(2),
    ma_standard_channel_map_flac_ma_standard_channel_map_webaudio(3),
    ma_standard_channel_map_vorbis(4),
    ma_standard_channel_map_sound4(5),
    ma_standard_channel_map_sndio(6);

    private static final int __size = 4;

    private final int index;

    ma_standard_channel_map(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_standard_channel_map getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_standard_channel_map_microsoft_ma_standard_channel_map_default;
            case 1:
                return ma_standard_channel_map_alsa;
            case 2:
                return ma_standard_channel_map_rfc3551;
            case 3:
                return ma_standard_channel_map_flac_ma_standard_channel_map_webaudio;
            case 4:
                return ma_standard_channel_map_vorbis;
            case 5:
                return ma_standard_channel_map_sound4;
            case 6:
                return ma_standard_channel_map_sndio;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_standard_channel_mapPointer extends EnumPointer<ma_standard_channel_map> {

        public ma_standard_channel_mapPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_standard_channel_mapPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_standard_channel_mapPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_standard_channel_mapPointer() {
            this(1, true);
        }

        public ma_standard_channel_mapPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_standard_channel_map getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_standard_channel_map value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
