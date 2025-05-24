package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Union;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_timer extends Union {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(219).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_timer(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_timer(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_timer() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_timer.ma_timerPointer asPointer() {
        return new ma_timer.ma_timerPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_timer.ma_timerPointer ptr) {
        ptr.setPointer(this);
    }

    public long counter() {
        return getBufPtr().getLong(0);
    }

    public void counter(long counter) {
        getBufPtr().setLong(0, counter);
    }

    public double counterD() {
        return getBufPtr().getDouble(0);
    }

    public void counterD(double counterD) {
        getBufPtr().setDouble(0, counterD);
    }

    public static final class ma_timerPointer extends StackElementPointer<ma_timer> {

        public ma_timerPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_timerPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_timerPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_timerPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_timerPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_timerPointer() {
            this(1, true);
        }

        public ma_timerPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_timer createStackElement(long ptr, boolean freeOnGC) {
            return new ma_timer(ptr, freeOnGC);
        }
    }
}
