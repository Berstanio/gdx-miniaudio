package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_noise_type implements CEnum {

    ma_noise_type_white(0), ma_noise_type_pink(1), ma_noise_type_brownian(2);

    private static final int __size = 4;

    private final int index;

    ma_noise_type(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_noise_type getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_noise_type_white;
            case 1:
                return ma_noise_type_pink;
            case 2:
                return ma_noise_type_brownian;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_noise_typePointer extends EnumPointer<ma_noise_type> {

        public ma_noise_typePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_noise_typePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_noise_typePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_noise_typePointer() {
            this(1, true);
        }

        public ma_noise_typePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_noise_type getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_noise_type value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
