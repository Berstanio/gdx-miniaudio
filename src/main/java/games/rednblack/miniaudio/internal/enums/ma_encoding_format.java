package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_encoding_format implements CEnum {

    ma_encoding_format_unknown(0), ma_encoding_format_wav(1), ma_encoding_format_flac(2), ma_encoding_format_mp3(3), ma_encoding_format_vorbis(4);

    private static final int __size = 4;

    private final int index;

    ma_encoding_format(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_encoding_format getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_encoding_format_unknown;
            case 1:
                return ma_encoding_format_wav;
            case 2:
                return ma_encoding_format_flac;
            case 3:
                return ma_encoding_format_mp3;
            case 4:
                return ma_encoding_format_vorbis;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_encoding_formatPointer extends EnumPointer<ma_encoding_format> {

        public ma_encoding_formatPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_encoding_formatPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_encoding_formatPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_encoding_formatPointer() {
            this(1, true);
        }

        public ma_encoding_formatPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_encoding_format getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_encoding_format value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
