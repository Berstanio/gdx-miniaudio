package games.rednblack.miniaudio.internal.enums;

import com.badlogic.gdx.jnigen.runtime.pointer.EnumPointer;
import com.badlogic.gdx.jnigen.runtime.c.CEnum;
import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;

public enum ma_thread_priority implements CEnum {

    ma_thread_priority_idle(-5),
    ma_thread_priority_lowest(-4),
    ma_thread_priority_low(-3),
    ma_thread_priority_normal(-2),
    ma_thread_priority_high(-1),
    ma_thread_priority_highest_ma_thread_priority_default(0),
    ma_thread_priority_realtime(1);

    private static final int __size = 4;

    private final int index;

    ma_thread_priority(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return __size;
    }

    public static ma_thread_priority getByIndex(int index) {
        switch(index) {
            case -1:
                return ma_thread_priority_high;
            case 0:
                return ma_thread_priority_highest_ma_thread_priority_default;
            case -2:
                return ma_thread_priority_normal;
            case 1:
                return ma_thread_priority_realtime;
            case -3:
                return ma_thread_priority_low;
            case -4:
                return ma_thread_priority_lowest;
            case -5:
                return ma_thread_priority_idle;
            default:
                throw new IllegalArgumentException("Index " + index + " does not exist.");
        }
    }

    public static final class ma_thread_priorityPointer extends EnumPointer<ma_thread_priority> {

        public ma_thread_priorityPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_thread_priorityPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_thread_priorityPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_thread_priorityPointer() {
            this(1, true);
        }

        public ma_thread_priorityPointer(int count, boolean freeOnGC) {
            super(count * __size, freeOnGC);
        }

        public ma_thread_priority getEnumValue(int index) {
            return getByIndex((int) getBufPtr().getInt(index * __size));
        }

        public void setEnumValue(ma_thread_priority value, int index) {
            getBufPtr().setInt(index * __size, value.getIndex());
        }
    }
}
