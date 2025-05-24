package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;

public final class ma_lcg extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(149).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_lcg(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_lcg(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_lcg() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_lcg.ma_lcgPointer asPointer() {
        return new ma_lcg.ma_lcgPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_lcg.ma_lcgPointer ptr) {
        ptr.setPointer(this);
    }

    public int state() {
        return getBufPtr().getInt(0);
    }

    public void state(int state) {
        getBufPtr().setInt(0, state);
    }

    public static final class ma_lcgPointer extends StackElementPointer<ma_lcg> {

        public ma_lcgPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_lcgPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_lcgPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_lcgPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_lcgPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_lcgPointer() {
            this(1, true);
        }

        public ma_lcgPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_lcg createStackElement(long ptr, boolean freeOnGC) {
            return new ma_lcg(ptr, freeOnGC);
        }
    }
}
