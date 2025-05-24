package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_attenuation_model implements CEnum {

    ma_attenuation_model_none(0), ma_attenuation_model_inverse(1), ma_attenuation_model_linear(2), ma_attenuation_model_exponential(3);

    private static final int __size = 4;

    private final int index;

    ma_attenuation_model(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_attenuation_model getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_attenuation_model_none;
            case 1:
                return ma_attenuation_model_inverse;
            case 2:
                return ma_attenuation_model_linear;
            case 3:
                return ma_attenuation_model_exponential;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_attenuation_modelPointer extends EnumPointer<ma_attenuation_model> {

        public ma_attenuation_modelPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_attenuation_modelPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_attenuation_modelPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_attenuation_modelPointer() {
            this(1, true);
        }

        public ma_attenuation_modelPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_attenuation_model getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_attenuation_model value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
