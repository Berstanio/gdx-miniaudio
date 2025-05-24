package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_node_state implements CEnum {

    ma_node_state_started(0), ma_node_state_stopped(1);

    private static final int __size = 4;

    private final int index;

    ma_node_state(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_node_state getByIndex(int index) {
        switch(index) {
            case 0:
                return ma_node_state_started;
            case 1:
                return ma_node_state_stopped;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_node_statePointer extends EnumPointer<ma_node_state> {

        public ma_node_statePointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_node_statePointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_node_statePointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_node_statePointer() {
            this(1, true);
        }

        public ma_node_statePointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_node_state getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getUInt(index * __size));
        }

        public void setEnumValue(ma_node_state value, int index) {
            getBufPtr().setUInt(index * __size, value.getIndex());
        }
    }
}
