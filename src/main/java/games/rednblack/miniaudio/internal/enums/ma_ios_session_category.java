package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_ios_session_category implements CEnum {

    ma_ios_session_category_default(0),
    ma_ios_session_category_none(1),
    ma_ios_session_category_ambient(2),
    ma_ios_session_category_solo_ambient(3),
    ma_ios_session_category_playback(4),
    ma_ios_session_category_record(5),
    ma_ios_session_category_play_and_record(6),
    ma_ios_session_category_multi_route(7);

    private static final int __size = 4;

    private final int index;

    ma_ios_session_category(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_ios_session_category getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_ios_session_category_default;
            case 1:
                return ma_ios_session_category_none;
            case 2:
                return ma_ios_session_category_ambient;
            case 3:
                return ma_ios_session_category_solo_ambient;
            case 4:
                return ma_ios_session_category_playback;
            case 5:
                return ma_ios_session_category_record;
            case 6:
                return ma_ios_session_category_play_and_record;
            case 7:
                return ma_ios_session_category_multi_route;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_ios_session_categoryPointer extends EnumPointer<ma_ios_session_category> {

        public ma_ios_session_categoryPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_ios_session_categoryPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_ios_session_categoryPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_ios_session_categoryPointer() {
            this(1, true);
        }

        public ma_ios_session_categoryPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_ios_session_category getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_ios_session_category value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
