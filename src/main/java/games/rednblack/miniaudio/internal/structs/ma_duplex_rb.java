package games.rednblack.miniaudio.internal.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.jnigen.runtime.pointer.Pointing;
import com.badlogic.gdx.jnigen.runtime.pointer.VoidPointer;
import games.rednblack.miniaudio.internal.FFITypes;
import games.rednblack.miniaudio.internal.structs.ma_pcm_rb;

public final class ma_duplex_rb extends Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(121).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public ma_duplex_rb(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public ma_duplex_rb(long pointer, boolean freeOnGC, Pointing parent) {
        super(pointer, freeOnGC);
        setParent(parent);
    }

    public ma_duplex_rb() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public ma_duplex_rb.ma_duplex_rbPointer asPointer() {
        return new ma_duplex_rb.ma_duplex_rbPointer(getPointer(), false, 1, this);
    }

    public void asPointer(ma_duplex_rb.ma_duplex_rbPointer ptr) {
        ptr.setPointer(this);
    }

    public ma_pcm_rb rb() {
        return new ma_pcm_rb(getPointer(), false);
    }

    public void rb(ma_pcm_rb toSetPtr) {
        toSetPtr.setPointer(getPointer(), (CHandler.IS_COMPILED_ANDROID_X86) ? 108 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 112 : 152, this);
    }

    public ma_pcm_rb getRb() {
        return new ma_pcm_rb(getBufPtr().duplicate(0, (CHandler.IS_COMPILED_ANDROID_X86) ? 108 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 112 : 152), true);
    }

    public void getRb(ma_pcm_rb toCopyTo) {
        toCopyTo.getBufPtr().copyFrom(0, getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 108 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 112 : 152);
    }

    public void setRb(ma_pcm_rb toCopyFrom) {
        getBufPtr().copyFrom(0, toCopyFrom.getBufPtr(), 0, (CHandler.IS_COMPILED_ANDROID_X86) ? 108 : ((CHandler.IS_32_BIT && CHandler.IS_COMPILED_WIN) || (CHandler.IS_32_BIT && CHandler.IS_COMPILED_UNIX && !CHandler.IS_COMPILED_ANDROID_X86)) ? 112 : 152);
    }

    public static final class ma_duplex_rbPointer extends StackElementPointer<ma_duplex_rb> {

        public ma_duplex_rbPointer(VoidPointer pointer) {
            super(pointer);
        }

        public ma_duplex_rbPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public ma_duplex_rbPointer(long pointer, boolean freeOnGC, int capacity) {
            super(pointer, freeOnGC, capacity * __size);
        }

        public ma_duplex_rbPointer(long pointer, boolean freeOnGC, Pointing parent) {
            super(pointer, freeOnGC);
            setParent(parent);
        }

        public ma_duplex_rbPointer(long pointer, boolean freeOnGC, int capacity, Pointing parent) {
            super(pointer, freeOnGC, capacity * __size);
            setParent(parent);
        }

        public ma_duplex_rbPointer() {
            this(1, true);
        }

        public ma_duplex_rbPointer(int count, boolean freeOnGC) {
            super(__size, count, freeOnGC);
        }

        public int getSize() {
            return __size;
        }

        protected ma_duplex_rb createStackElement(long ptr, boolean freeOnGC) {
            return new ma_duplex_rb(ptr, freeOnGC);
        }
    }
}
