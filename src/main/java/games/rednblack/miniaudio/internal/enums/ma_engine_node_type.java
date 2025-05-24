package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_engine_node_type implements CEnum {

    ma_engine_node_type_sound(0), ma_engine_node_type_group(1);

    private static final int __size = 4;

    private final int index;

    ma_engine_node_type(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_engine_node_type getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_engine_node_type_sound;
            case 1:
                return ma_engine_node_type_group;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_engine_node_typePointer extends EnumPointer<ma_engine_node_type> {

        public ma_engine_node_typePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_engine_node_typePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_engine_node_typePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_engine_node_typePointer() {
            this(1, true);
        }

        public ma_engine_node_typePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_engine_node_type getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_engine_node_type value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
