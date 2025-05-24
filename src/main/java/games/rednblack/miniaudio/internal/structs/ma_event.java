package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_event extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(128).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_event(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_event(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_event() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_event.ma_eventPointer asPointer() {
        return new ma_event.ma_eventPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_event.ma_eventPointer ptr) {
        ptr.setPointer(this);
    }

    public static final class ma_eventPointer extends StackElementPointer<ma_event> {

        public ma_eventPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_eventPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_eventPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_eventPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_eventPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_eventPointer() {
            this(1, true);
        }

        public ma_eventPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_event createStackElement(long ptr, boolean freeOnGC) {
            return new ma_event(ptr, freeOnGC);
        }
    }
}
